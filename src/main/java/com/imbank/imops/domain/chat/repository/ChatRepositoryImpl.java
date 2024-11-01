package com.imbank.imops.domain.chat.repository;

import com.imbank.imops.domain.chat.dto.ChatResponseDto;
import com.imbank.imops.domain.user.entity.User;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.imbank.imops.domain.chat.entity.QChat.chat;

@Log4j2
@RequiredArgsConstructor
@Repository
public class ChatRepositoryImpl implements ChatRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    @Override
    public List<ChatResponseDto> getChatList(User user) {
        return queryFactory.select(Projections.constructor(ChatResponseDto.class,
                        chat.id,
                        chat.name
                ))
                .from(chat)
                .where(chat.user.eq(user))
                .fetch();
    }
}

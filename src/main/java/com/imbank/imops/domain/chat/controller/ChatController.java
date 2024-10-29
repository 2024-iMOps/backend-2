package com.imbank.imops.domain.chat.controller;

import com.imbank.imops.domain.chat.dto.ChatResponseDto;
import com.imbank.imops.domain.chat.service.ChatService;
import com.imbank.imops.global.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Log4j2
@Controller
@RequiredArgsConstructor
@RequestMapping("api/v1/chat")
public class ChatController {
    private final ChatService chatService;

    @GetMapping
    public ResponseEntity<Message> getChatList(@RequestParam String username) {
        log.info("ChatController/getChatList : " + username);

        Message message = new Message();

        try {
            List<ChatResponseDto> data = chatService.getChatList(username);
            message.setMessage("채팅 리스트 조회 성공");
            message.setData(data);
        } catch (Exception e) {
            log.error("BoardController/postBoard : " + e.getMessage(), e);
            message.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(message);
        }
        return ResponseEntity.ok(message);
    }
}

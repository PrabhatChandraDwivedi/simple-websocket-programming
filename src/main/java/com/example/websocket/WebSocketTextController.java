package com.example.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketTextController {
	
	@Autowired
    SimpMessagingTemplate template;
	
	@PostMapping("/send")
	public ResponseEntity<Void> sendMessage(@RequestBody TextMessageDTO textMessageDTO) {
		template.convertAndSend("/topic/message", textMessageDTO);
		return new ResponseEntity<>(HttpStatusCode.valueOf(200));
	}

	@SendTo("/topic/message")
	public TextMessageDTO broadcastMessage(@Payload TextMessageDTO textMessageDTO) {
		return textMessageDTO;
	}
}

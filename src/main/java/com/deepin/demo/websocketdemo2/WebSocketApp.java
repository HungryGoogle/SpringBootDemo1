package com.deepin.demo.websocketdemo2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.deepin.demo.util.log.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableScheduling
@SpringBootApplication
public class WebSocketApp {

	public static void main(String[] args) {
		SpringApplication.run(WebSocketApp.class, args);
	}

	@Autowired
	private SimpMessagingTemplate messagingTemplate;

	// http://localhost:8080/websocket
	@GetMapping("/websocket")
	public String index() {
		LogUtil.info("websocket request, return html");
		return "websocket";
	}

	@MessageMapping("/send")
	@SendTo("/topic/send")
	public SocketMessage send(SocketMessage message) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		message.date = df.format(new Date());
		return message;
	}

	@Scheduled(fixedRate = 1000)
	@SendTo("/topic/callback")
	public Object callback() throws Exception {
		// 发现消息
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		messagingTemplate.convertAndSend("/topic/callback", df.format(new Date()));
		return "callback";
	}
}

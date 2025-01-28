package com.telegrambot;

import com.telegrambot.config.TelegramProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(TelegramProperties.class)
public class TBotApp {

    public static void main(String[] args) {
        SpringApplication.run(TBotApp.class, args);
    }

}

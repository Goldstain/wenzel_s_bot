package com.telegrambot.service;

import com.telegrambot.bot.Bot;
import com.telegrambot.service.contract.AbstractManager;
import com.telegrambot.service.contract.CommandListener;
import com.telegrambot.service.contract.QueryListener;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MainManager extends AbstractManager implements CommandListener, QueryListener {

    @Override
    public BotApiMethod<?> mainMenu(Message message, Bot bot) {
        return null;
    }

    @Override
    public BotApiMethod<?> mainMenu(CallbackQuery query, Bot bot) {
        return null;
    }

    @Override
    public BotApiMethod answerCommand(Message message, Bot bot) {
        return greetings(message.getChatId());
    }

    @Override
    public BotApiMethod answerQuery(CallbackQuery query, Bot bot) {
        return null;
    }

    private BotApiMethod<?> greetings(Long cahtId) {
        return SendMessage.builder()
                .chatId(cahtId)
                .text("Hello, dear friends")
                .build();
    }
}

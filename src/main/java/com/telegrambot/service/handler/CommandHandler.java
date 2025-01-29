package com.telegrambot.service.handler;

import com.telegrambot.bot.Bot;
import com.telegrambot.service.MainManager;
import com.telegrambot.service.contract.AbstractHandler;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CommandHandler extends AbstractHandler {

    MainManager mainManager;

    @Override
    public BotApiMethod<?> answer(BotApiObject object, Bot bot) {
        var message = (Message) object;
        if ("/start".equals(message.getText())) {
            return mainManager.answerCommand(message, bot);
        }
        throw new UnsupportedOperationException();
    }
}


package com.telegrambot.service.handler;

import com.telegrambot.bot.Bot;
import com.telegrambot.service.contract.AbstractHandler;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CallbackQueryHandler extends AbstractHandler {

    @Override
    public BotApiMethod<?> answer(BotApiObject object, Bot bot) {
        var message = (CallbackQuery) object;
        throw new UnsupportedOperationException();
    }
}

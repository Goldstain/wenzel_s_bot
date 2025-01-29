package com.telegrambot.service;

import com.telegrambot.bot.Bot;
import com.telegrambot.service.handler.CallbackQueryHandler;
import com.telegrambot.service.handler.CommandHandler;
import com.telegrambot.service.handler.MessageHandler;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UpdateDispatcher {

    MessageHandler messageHandler;
    CommandHandler commandHandler;
    CallbackQueryHandler queryHandler;

    public BotApiMethod<?> distribute(Update update, Bot bot) {

        if (update.hasCallbackQuery()) {
            return queryHandler.answer(update.getCallbackQuery(), bot);
        }
        if (update.hasMessage()) {
            var message = update.getMessage();
            if (message.hasText()) {
                if (message.getText().startsWith("/")) {
                    return commandHandler.answer(message, bot);
                }
                return messageHandler.answer(message, bot);
            }
        }
        return null;
    }

}

package com.telegrambot.service.contract;

import com.telegrambot.bot.Bot;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;


public abstract class AbstractManager {

    public abstract BotApiMethod<?> mainMenu(Message message, Bot bot);

    public abstract BotApiMethod<?> mainMenu(CallbackQuery query, Bot bot);

}

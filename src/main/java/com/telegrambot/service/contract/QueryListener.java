package com.telegrambot.service.contract;

import com.telegrambot.bot.Bot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

public interface QueryListener {

    BotApiMethod answerQuery(CallbackQuery query, Bot bot);


}

package com.telegrambot.service.contract;

import com.telegrambot.bot.Bot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface CommandListener {

    BotApiMethod answerCommand(Message message, Bot bot);
}

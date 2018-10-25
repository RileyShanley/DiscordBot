package com.ACM.DiscordBot;

import java.util.Calendar;
import java.util.Random;
import java.time.ZonedDateTime;
import java.util.Calendar;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class App extends ListenerAdapter {

	public static void main(String[] args) throws Exception {
		JDA jda = new JDABuilder(AccountType.BOT).setToken(Ref.token).build();
		jda.addEventListener(new App());

	}// end of main

	public int numberShowing;

	public int roll() {
		Random random = new Random();
		return numberShowing = random.nextInt(6) + 1;
	}

	@Override
	public void onMessageReceived(MessageReceivedEvent evt) {
		// objects
		User objUser = evt.getAuthor();
		MessageChannel objMsgCh = evt.getChannel();
		Message objMsg = evt.getMessage();
		// Role objRole;

		// commands
		if (objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix + "hi") && !objUser.isBot()) {
			objMsgCh.sendMessage("hi").queue();
		}
		if (objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix + "roll") && !objUser.isBot()) {
			objMsgCh.sendMessage(objUser.getAsMention() + " you rolled " + roll()).queue();
		}
//		if (objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix + "test")) {
//	objUser.getId().
//		}
		
	}
}

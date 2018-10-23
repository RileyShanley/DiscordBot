package com.ACM.DiscordBot;

import java.util.Calendar;
import java.time.ZonedDateTime;
import java.util.Calendar;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class App extends ListenerAdapter {
	//private Date party;
	
//	public void MeetingDate() {
//		Calendar c = Calendar.getInstance();
//		c.setTime(ZonedDateTime.now());
//		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
//	}


	
	public static void main(String[] args) throws Exception {
		JDA jda = new JDABuilder(AccountType.BOT).setToken(Ref.token).build();
		jda.addEventListener(new App());

	}// end of main

	@Override
	public void onMessageReceived(MessageReceivedEvent evt) {
		// objects
		User objUser = evt.getAuthor();
		MessageChannel objMsgCh = evt.getChannel();
		Message objMsg = evt.getMessage();

		// commands
		if (objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix + "hi")) {
			objMsgCh.sendMessage(" !hi").queue();
		}
		//if (objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix + "setDate")) {
		//}
//		if(ZonedDateTime.now().equals(2018/22/10)) {
//			objMsgCh.sendMessage(" it is today").queue();
//		}
	}
}

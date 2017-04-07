package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import message.Message;
import message.braodcaster.EuropeMessageBroadcaster;
import message.factory.MessageFactory;
import message.receivers.RadioStation;
import message.receivers.TVStation;
import message.reporters.NewsFromGermany;
import message.reporters.NewsFromPoland;
import message.type.ImportantMessage;
import message.type.StandardMessage;
import message.type.UrgentMessage;
import observer.Subject;

public class Example {
	public static void main(String[] args) {
		
		EuropeMessageBroadcaster broadcaster = new EuropeMessageBroadcaster(new MessageFactory());
		broadcaster.addListener(new TVStation());
		broadcaster.addListener(new RadioStation());
		NewsFromGermany germanReporter = new NewsFromGermany(broadcaster);
		NewsFromPoland polishReporter = new NewsFromPoland(broadcaster);
		List<String> news = new ArrayList<String>();
		news.add("Vulcano eruption!");
		news.add("Vulcano eruption!!");
		news.add("Vulcano eruption?");
		polishReporter.publishMessage(news);
		germanReporter.publishMessage("Guten tag");
		polishReporter.publishMessage("Dzieñ Dobry");
		germanReporter.publishMessage("Guten tag!");
		polishReporter.publishMessage("Dzieñ Dobry!");
		germanReporter.publishMessage("Guten tag!!");
		polishReporter.publishMessage("Dzieñ Dobry!!");
		
	
	}
}

package message.braodcaster;

import java.util.List;

import message.Message;

public interface MessageBroadcaster {

	void sendMessage(String message);

	void sendMessages(List<String> messages);

}
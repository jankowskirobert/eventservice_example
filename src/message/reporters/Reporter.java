package message.reporters;

import java.util.List;

import message.Message;

public interface Reporter {
	public void publishMessage(String message);
	public void publishMessage(List<String> messages);
}

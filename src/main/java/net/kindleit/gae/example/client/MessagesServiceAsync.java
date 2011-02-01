package net.kindleit.gae.example.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import net.kindleit.gae.example.model.Message;

import java.util.List;

public interface MessagesServiceAsync {

	void getAll(AsyncCallback<List<Message>> callback);

	void create(Message message, AsyncCallback<Void> callback);

	void deleteById(Long id, AsyncCallback<Void> callback);

}

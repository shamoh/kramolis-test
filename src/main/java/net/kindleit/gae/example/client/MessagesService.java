package net.kindleit.gae.example.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import net.kindleit.gae.example.model.Messages;

@RemoteServiceRelativePath("messages")
public interface MessagesService extends RemoteService, Messages {
	// marker interface
}

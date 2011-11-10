package br.com.tecsinapse.glimpse.client;

import java.util.List;

public interface Connector {

	String start(String script);

	boolean isOpen(String id);
	
	List<ClientPoll> poll(String id);

	void cancel(String id);
	
}

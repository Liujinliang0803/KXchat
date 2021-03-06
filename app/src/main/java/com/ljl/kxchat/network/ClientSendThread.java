package com.ljl.kxchat.network;

import com.ljl.kxchat.beran.TranObject;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class ClientSendThread {
	private Socket mSocket = null;
	private ObjectOutputStream oos = null;
	public ClientSendThread(Socket socket) {
		this.mSocket = socket;
		try {
			oos = new ObjectOutputStream(mSocket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void sendMessage(TranObject t) throws IOException{
		oos.writeObject(t);
		oos.flush();
	}
}

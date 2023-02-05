/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerimpl;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import controller.ChatController;
import controller.ChatObserver;
import java.util.ArrayList;

/**
 *
 * @author lahir
 */
public class ChatControllerImpl extends UnicastRemoteObject implements ChatController{
    
    private ArrayList<ChatObserver> chatObserverArrayList = new ArrayList<>();

    public ChatControllerImpl() throws RemoteException{}
    
    @Override
    public void sendMassage(String massage) throws RemoteException {
        for(ChatObserver co : chatObserverArrayList) {
            co.update(massage);
        }
    }

    @Override
    public void addChatObserver(ChatObserver chatObserver) throws RemoteException {
        chatObserverArrayList.add(chatObserver);
    }

    @Override
    public void removeChatObserver(ChatObserver chatObserver) throws RemoteException {
        chatObserverArrayList.remove(chatObserver);
    }
    
}

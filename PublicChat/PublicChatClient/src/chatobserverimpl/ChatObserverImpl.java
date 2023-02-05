/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatobserverimpl;

import controller.ChatObserver;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import view.ChatWindow;

/**
 *
 * @author lahir
 */
public class ChatObserverImpl extends UnicastRemoteObject implements ChatObserver{
    
    private ChatWindow chatWindow;
    
    public ChatObserverImpl(ChatWindow chatWindow) throws RemoteException{
        this.chatWindow = chatWindow;
    }

    @Override
    public void update(String massage) throws RemoteException {
        chatWindow.setMassage(massage);
    }
    
}

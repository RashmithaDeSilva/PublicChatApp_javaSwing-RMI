/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author lahir
 */
public interface ChatController extends Remote{
    public void sendMassage(String massage) throws RemoteException ;
    
    // login
    public void addChatObserver(ChatObserver chatObserver) throws RemoteException;
    
    // logout
    public void removeChatObserver(ChatObserver chatObserver) throws RemoteException; 
}

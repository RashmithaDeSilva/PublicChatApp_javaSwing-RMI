/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connector;

import controller.ChatController;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author lahir
 */
public class ServerConnector {
    
    private static ServerConnector serverConnector;
    private static ChatController chatController;
    
    private ServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        chatController = (ChatController) Naming.lookup("rmi://localhost:5050/ChatServer");
    }
    
    public static ServerConnector getServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        if(serverConnector == null) {
            serverConnector = new ServerConnector();
        }
        return serverConnector;
    }
    
    public static ChatController getChatController() {
        return chatController ;
    }
}

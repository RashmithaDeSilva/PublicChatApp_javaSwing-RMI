/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controllerimpl.ChatControllerImpl;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lahir
 */
public class ServerStart {
    public static void main(String[] args) {
        try {
            Registry chatRegistry = LocateRegistry.createRegistry(5050);
            chatRegistry.rebind("ChatServer", new ChatControllerImpl());
            System.out.println("Server Start .....");
            
        } catch (RemoteException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

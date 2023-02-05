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
public interface ChatObserver extends Remote{
    public void update(String massage) throws RemoteException;
}

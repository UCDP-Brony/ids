
import java.rmi.*;
import java.rmi.server.*; 
import java.rmi.registry.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uhc'estdesPets
 */
public class Client {
    private clientImpl client;
    //private Player player;
    //private Player[] model;
    
    public void doConnect(){
    
    }
    
    
    
   
    
   public static void main(String [] args) {	
	
       
       
      try {
	  if (args.length < 1) {
	   System.out.println("Usage: Server adress not specified");
	   return;}
           String host = args[0];
        
	// Get remote object reference
	Registry registry = LocateRegistry.getRegistry(host); 
	serverItf serverI = (serverItf) registry.lookup("toClient");
        
        // Create a Name remote object
        clientImpl c=new clientImpl("player3  ") ;
        clientItf client_stub1 = (clientItf) UnicastRemoteObject.exportObject(c, 0);
        
	Boolean res = serverI.connect(c);
        
        serverI.movePlayer(1, c);

	} catch (Exception e)  {
		System.err.println("Error on client: " + e);
	}
  }
}

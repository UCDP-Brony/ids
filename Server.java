
import java.rmi.*; 
import java.rmi.server.*; 
import java.rmi.registry.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uhc'estdesPets
 */
public class Server  {
    
    private Player[] model;  
    ArrayList<Player> Players ;   
    private Links[] nodes;
    
    public Server(){
        Players=new ArrayList<Player>();
    }
    
   /* public String connect(String name){
        //Player p=new Player(1,1,name,1);
        System.out.println("added ! ");
          //  Players.add(p);
            System.out.println(Players.size());
            return ("Connection established "+ name);
    }*/
    
   
    
    public void disconnect(int player){
        
    }

    public void moveClient(String dir, int player){
        switch (dir){
            case "up":
                moveClient(model[player].getX(), model[player].getY()+1, player);
                break;
            case "down":
                moveClient(model[player].getX(), model[player].getY()-1, player);
                break;
            case "right":
                moveClient(model[player].getX()+1, model[player].getY(), player);
                break;
            case "left":
                moveClient(model[player].getX()-1, model[player].getY(), player);
                break;
                
        }
    }
    
    private void moveClient(int x, int y, int player){
    // do stuff on    model[player]
    }
    
    public boolean requestPos(int x, int y){
        for (Player player : model) {
            if (x == player.getX() && y == player.getY()) {
                return false;
            }
        }
        return true;
    }
    
    public void sendPlayer(int x, int y){      
    }
    
    public static void  main(String [] args) {
	  try {
		  // Create a Hello remote object

	    Server h = new Server ();
            //serverToClientItf h_stub = (serverToClientItf) UnicastRemoteObject.exportObject(h, 0);

            serverImpl SImp = new serverImpl ();
            serverItf h_stub1 = (serverItf) UnicastRemoteObject.exportObject(SImp, 0);


	    // Register the remote object in RMI registry with a given identifier
	    Registry registry= LocateRegistry.getRegistry(); 
	    registry.bind("toClient", h_stub1);
	    System.out.println ("Server ready");

	  } catch (Exception e) {
		  System.err.println("Error on server :" + e) ;
		  e.printStackTrace();
	  }
  }
    
    
}

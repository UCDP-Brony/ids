
import java.rmi.*;
import java.rmi.RemoteException;
import java.util.ArrayList;



public class clientImpl implements clientItf {
    
    private String name;
    
    
    public clientImpl(String n) {
    name=n;
    }
    
    public void tell (String msg)throws RemoteException {
                System.out.println(msg);		
    }
    
    public String getName()throws RemoteException {    
        return name;
    }
    
    public void latestPos(ArrayList<Player> Players) throws RemoteException{
        System.out.println("I'm here");
        for(int i=0; i<Players.size();i++){
            System.out.println(Players.get(i).getName()+"is in the position x = "+Players.get(i).getX()+" y= "+Players.get(i).getX());
      
      }                           
    }
    

    
}

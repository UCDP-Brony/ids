
import java.rmi.*;
import java.rmi.RemoteException;
import java.util.ArrayList;



public class clientImpl implements clientItf {
    
    private String name;
    ArrayList<PlayerInfo> PlayersI ;
    
    
    public clientImpl(String n) {
    name=n;
            PlayersI=new ArrayList<PlayerInfo>();

    }
    
    public void tell (String msg)throws RemoteException {
                System.out.println(msg);		
    }
    
    public String getName()throws RemoteException {    
        return name;
    }
    
    public void latestPos(String  Players) throws RemoteException{       
       // System.out.println(Players);
        PlayerInfo p=new PlayerInfo();
        String[] parts = Players.split(";");
            
        for(int i=0; i<parts.length;i++){                          
          
            System.out.println(parts[i]);
            String temp=parts[i];
            String[] tempp = temp.split("/");
           // String[] partsI = parts[i].split("-");
            p.name=tempp[0];
            p.x=Integer.parseInt(tempp[1]);
            p.y=Integer.parseInt(tempp[2]);
            p.color=tempp[3];
            PlayersI.add(p);
        }
        
        //this.getGUI().update(PlayersI);
        
    }   
}

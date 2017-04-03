
import java.rmi.RemoteException;
import java.util.ArrayList;


public class serverImpl implements serverItf {
    
    private Player[] model;  
    ArrayList<Player> Players ;   
    private Links[] nodes;
    
     public serverImpl(){
        Players=new ArrayList<Player>();
    }
       
        public boolean connect (clientItf a)throws RemoteException {           
	    a.tell("You have Connected successfully.");
            //notify all the conencted players
            publish(a.getName()+ " joined");            
            //Add the player
            Player p=new Player(1,1,a.getName(),"b",a);
            Players.add(p);
            //Send postions of current players in the map    
            
            String PlayersList="";
            for(int i=0; i<Players.size();i++){
            try{
                PlayersList=PlayersList+(Players.get(i).getName()+"/"+Players.get(i).getX()+"/"+
                                        Players.get(i).getY()+"/"+Players.get(i).getColor()+";");
               }
            catch(Exception e){}
               }  
            System.out.println(PlayersList);
            
            
            p.client.latestPos(PlayersList);
            return true;
        }

        public void publish (String s)throws RemoteException {
            System.out.println(s);
            for(int i=0; i<Players.size();i++){
                try{               
                    Players.get(i).client.tell(s);
                    }
                catch(Exception e){
                 //Problem with the client not connected
                 // if we want to remove it it's here 
                }
            }           
        }
                       
        public void movePlayer(int direction, clientItf c) throws RemoteException {
            Player p;
             String PlayerName=c.getName();
            for(int i=0; i<Players.size();i++){                          

                if (Players.get(i).getName().equals(PlayerName))
                {   
                    p=Players.get(i);
                    switch (direction)
                     {
                        case 1: Players.get(i).setY(p.getY()-1);break;
                        case 2: Players.get(i).setY(p.getY()+1);break;
                        case 3: Players.get(i).setX(p.getX()+1);break;
                        case 4: Players.get(i).setX(p.getX()-1);break;
                     }
                    System.out.println("x ="+Players.get(i).getX()+ " Y="+Players.get(i).getY());
                    break;
                }
                    //else System.out.println("Player not found");
            }
            
            //Store the player list in a string 
            String PlayersList="";
            for(int i=0; i<Players.size();i++){
            try{
                PlayersList=PlayersList+(Players.get(i).getName()+"/"+Players.get(i).getX()+"/"+
                                        Players.get(i).getY()+"/"+Players.get(i).getColor()+";");
               }
            catch(Exception e){}
               } 
                       
            // broadcast the lastest position to all connected players             
            for(int i=0; i<Players.size();i++){
            try{
                System.out.println("x :"+Players.get(i).getX()+" y : "+Players.get(i).getY());
                Players.get(i).client.latestPos(PlayersList);
               }
            catch(Exception e){}
               }            
        }


    
}

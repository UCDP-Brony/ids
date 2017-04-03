import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

 
public interface clientItf extends Remote{	
	public void tell (String name)throws RemoteException ;
	public String getName()throws RemoteException ;
        public void latestPos(ArrayList<Player> Players) throws RemoteException;
       // public void sayHello(int player1, int player2);
        // public void changeConnection();
}
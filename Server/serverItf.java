
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface serverItf extends Remote {
    public boolean connect (clientItf a)throws RemoteException ;
    //public boolean disconnect (clientItf a)throws RemoteException ;
    public void publish (String s)throws RemoteException ;
    public void movePlayer(int direction, clientItf player) throws RemoteException;
    //public boolean requestPos(int x, int y); from server to server
    //public void sendPlayer(int x, int y);  from server to server
    
    
}

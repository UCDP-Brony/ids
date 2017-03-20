/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rabbitmq;

/**
 *
 * @author Uhc'estdesPets
 */
public class Server {
    private Player[] model;
    
    private Links[] nodes;
    
    public Server(){
        
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
    
    public void connect(Player player){
        
    }
    
    public void disconnect(int player){
        
    }
}

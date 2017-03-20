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
public class Client {
    private Player player;
    private Player[] model;
    
    
    public void updatePos(Player[] model){
        this.model = model;
        displayOnScreen();
    }
    
    public void sayHello(int player1, int player2){
        System.out.println(model[player1].getName() + "says hello to "+model[player2].getName());
        displayOnScreen();
    }
    
    public void changeConnection(){
        //TODO :  this function 
    }
    
    private void displayOnScreen(){
        //TODO : this
    }
}

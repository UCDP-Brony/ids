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
public class Player {
    private int x;
    private int y;
    private final String name;
    private final int color;

    public Player(int x, int y, String name, int color) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getColor() {
        return color;
    }
}

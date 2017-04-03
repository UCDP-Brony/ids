import java.io.Serializable;
import java.rmi.Remote;

public class Player implements Remote{
    private int x;
    private int y;
    private final String name;
    private final String color;
    public clientItf client;

    public Player(int x, int y, String name, String color,clientItf client ) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
        this.client=client;
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

    public String getColor() {
        return color;
    }
}

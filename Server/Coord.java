
public class Coord {
    private final int x;
    private final int y;
    
    public Coord(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int compareHor(Coord other){
        return this.x < other.getX()? -1 : this.x > other.getX() ? 1 : 0;
    }
    
    public int compareVer(Coord other){
        return this.y < other.getY()? -1 : this.y > other.getY() ? 1 : 0;
    }
    
    public boolean isInArea(int sizeX, int sizeY){
        return !(x < 0 || y < 0 || x > sizeX || y > sizeY);
    }
}

public class Ship {
    private String name;
    private int size;
    private char orientation;
    private int r1;
    private int c1;
    private int r2;
    private int c2;
    private String tag;
    public Ship(String name, int size, char orientation, int r1, int c1, int r2, int c2, String tag) {
        this.name = name;
        this.size = size;
        this.orientation = orientation;
        this.r1 = r1;
        this.c1 = c1;
        this.r2 = r2;
        this.c2 = c2;
        this.tag = tag;
    }
    public String getName() {return name;}
    public int getSize() {return size;}
    public char getOrientation() {return orientation;}
    public int getR1() {return r1;}
    public int getC1() {return c1 - 48;}
    public int getR2() {return r2;}
    public int getC2() {return c2 - 48;}
    public String getTag() {return tag;}


}

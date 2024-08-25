public class Furniture {
    private int length;
    private int width;
    private int height;
    private int cost;
    private String colour;

    public Furniture(int length, int width, int height, int cost, String colour) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.cost = cost;
        this.colour = colour;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColour() {
        return colour;
    }
}

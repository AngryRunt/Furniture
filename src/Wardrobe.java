public class Wardrobe extends Furniture{
    private int numofDoors;
    private int numofMirrors;
    private int numofShelfs;

    public int getNumofDoors() {
        return numofDoors;
    }

    public int getNumofMirrors() {
        return numofMirrors;
    }

    public int getNumofShelfs() {
        return numofShelfs;
    }

    public Wardrobe(int length, int width, int height, int cost, String colour, int numofDoors, int numofMirrors, int numofShelfs) {
        super(length, width, height, cost, colour);
        this.numofDoors = numofDoors;
        this.numofMirrors = numofMirrors;
        this.numofShelfs = numofShelfs;
    }
}

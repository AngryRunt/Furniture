public class Table extends Furniture {
    private int numOfLegs;
    private boolean refoldable;
    private String colourofLegs;


    public int getNumOfLegs() {
        return numOfLegs;
    }

    public boolean isRefoldable() {
        return refoldable;
    }

    public String getColourofLegs() {
        return colourofLegs;
    }

    public Table(int length, int width, int height, int cost, String colour, int numOfLegs, boolean refoldable, String colourofLegs) {
        super(length, width, height, cost, colour);
        this.numOfLegs = numOfLegs;
        this.refoldable = refoldable;
        this.colourofLegs = colourofLegs;
    }

    public Table(int length, int width, int height, int cost, String colour, int numOfLegs, boolean refoldable) {
        this(length, width, height, cost, colour, numOfLegs, refoldable, colour);

    }
}

public class Chair extends Table{
    private boolean Armrests;
    private String colourofArmrests;
    private boolean softArmrests;

    public Chair(int length, int width, int height, int cost, String colour, int numOfLegs,
                 boolean refoldable, String colourofLegs,
                 boolean armrests, String colourofArmrests, boolean softArmrests) {
        super(length, width, height, cost, colour, numOfLegs, refoldable, colourofLegs);
        this.Armrests = armrests;
        this.colourofArmrests = colourofArmrests;
        this.softArmrests = softArmrests;
    }
    public Chair(int length, int width, int height, int cost, String colour, int numOfLegs,
                 boolean refoldable, String colourofLegs) {
        this(length, width, height, cost, colour, numOfLegs, refoldable, colourofLegs, false, null, false);
         }

    public boolean isArmrests() {
        return Armrests;
    }

    public String getColourofArmrests() {
        return colourofArmrests;
    }

    public boolean isSoftArmrests() {
        return softArmrests;
    }





}

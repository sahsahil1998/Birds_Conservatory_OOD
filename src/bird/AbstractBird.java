package bird;

public class AbstractBird implements BirdInterface{

    private String name;
    private boolean mammal;
    private int wings;

    public AbstractBird(String name) {
        this.name = name;
    }


    @Override
    public String getType() {
        return null;
    }

    @Override
    public String getChar() {
        return null;
    }

    @Override
    public boolean boolFlight() {
        return false;
    }

    @Override
    public boolean boolExtinct() {
        return false;
    }

    @Override
    public boolean boolMammal() {
        return false;
    }

    @Override
    public String getFood() {
        return null;
    }

    @Override
    public String getLocation() {
        return null;
    }

    @Override
    public boolean boolWater() {
        return false;
    }

    @Override
    public String getWaterName() {
        return null;
    }
}

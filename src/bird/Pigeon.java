package bird;

import java.util.ArrayList;

public class Pigeon extends Bird{


    public Pigeon(String type, boolean isExtinct, int wingNum, ArrayList<food> favFood) {
        super(type,"feeds young bird milk", isExtinct, wingNum, favFood);
    }
}

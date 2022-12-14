package bird;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class AbstractBirdTest {

    AbstractBird hawk1 = new Hawk("hawk1");
    AbstractBird eagle1 = new Eagle("eagle1");
    AbstractBird owl1 = new Owl("owl1");
    AbstractBird emu1 = new Emus("emu1");
    AbstractBird gParrot = new GreyParrot("grayparrot", 100, "hello");
    AbstractBird pigeon1 = new Pigeon("pigeon1");
    AbstractBird moas1 = new Moas("my moa");
    AbstractBird african1 = new AfricanJacana("my jacana");

    @Test//testing getName from all child classes using parent AbstractBird
    public void testGetName(){
        assertEquals("emu1", emu1.getName());
        assertEquals("eagle1", eagle1.getName());
        assertEquals("hawk1", hawk1.getName());
        assertEquals("owl1", owl1.getName());
        assertEquals("pigeon1", pigeon1.getName());
        assertEquals("grayparrot", gParrot.getName());

    }

    @Test//testing get shared characteristics from all child classes using parent AbstractBird
    public void testGetSharedChar() {
        assertEquals("sharp hooked beaks and visible nostrils", hawk1.getSharedChar());
        assertEquals("These birds are often found near bodies of water, such as freshwater or the ocean.", african1.getSharedChar());
        assertEquals("sharp hooked beaks and visible nostrils", eagle1.getSharedChar());
        assertEquals("Feed young bird milk", pigeon1.getSharedChar());
        assertEquals("intelligent and mimic sounds and short, curved beak", gParrot.getSharedChar());
        assertEquals("Lives on the ground and has underdeveloped wings or no wings", emu1.getSharedChar());

    }

    @Test//testing get boolean values from isExtinct from all child classes using parent AbstractBird
    public void testIsExtinct(){
        assertFalse(hawk1.isExtinct());
        assertTrue(moas1.isExtinct());
        assertFalse(hawk1.isExtinct());
        assertFalse(emu1.isExtinct());
        assertFalse(eagle1.isExtinct());

    }

    @Test//testing get number of wings from all child classes using parent AbstractBird
    public void getNumberOfWings() {
        assertEquals(2, hawk1.getWingNum());
        assertEquals(2, eagle1.getWingNum());
        assertEquals(2, moas1.getWingNum());
        assertEquals(2, emu1.getWingNum());
        assertEquals(2, pigeon1.getWingNum());
        assertEquals(2, owl1.getWingNum());
    }


    @Test//testing getFood from all child classes using parent AbstractBird
    public void testFood(){
        assertEquals(Arrays.toString(new String[]{String.valueOf(Food.SMALLMAMMALS), String.valueOf(Food.OTHERBIRDS), String.valueOf(Food.INSECTS)}), Arrays.toString(owl1.getFavFood()));
        assertEquals(Arrays.toString(new String[]{String.valueOf(Food.SMALLMAMMALS), String.valueOf(Food.INSECTS)}), Arrays.toString(eagle1.getFavFood()));
        assertEquals(Arrays.toString(new String[]{String.valueOf(Food.VEGETATION), String.valueOf(Food.FRUIT), String.valueOf(Food.SEEDS)}), Arrays.toString(moas1.getFavFood()));
        assertEquals(Arrays.toString(new String[]{String.valueOf(Food.INSECTS), String.valueOf(Food.VEGETATION)}), Arrays.toString(emu1.getFavFood()));
        assertEquals(Arrays.toString(new String[]{String.valueOf(Food.SMALLMAMMALS), String.valueOf(Food.INSECTS)}), Arrays.toString(hawk1.getFavFood()));
        assertEquals(Arrays.toString(new String[]{String.valueOf(Food.SEEDS), String.valueOf(Food.INSECTS)}), Arrays.toString(pigeon1.getFavFood()));

    }

    @Test//testing getType from all child classes using parent AbstractBird
    public void testGetTypes(){
        assertEquals(BirdType.OWL.toString(), owl1.getType().toString());
        assertEquals(BirdType.EAGLE.toString(), eagle1.getType().toString());
        assertEquals(BirdType.GREYPARROT.toString(), gParrot.getType().toString());
        assertEquals(BirdType.EMU.toString(), emu1.getType().toString());

    }


    @Test // test owl to String
    public void testOwlToString(){
        Owl owly = new Owl("Owly");
        Eagle myeagle = new Eagle("myeagle");
        //System.out.println(owly.toString());
        System.out.println(myeagle.toString());
        //assertEquals("hi", owly.toString());

    }


}
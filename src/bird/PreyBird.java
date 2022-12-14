package bird;
// Class: Abstract class PreyBird
//
//
// Extends AbstractBird and shares its methods.
//
// This object will be used to extend several child classes. AKA all PreyBirds
//====================================================================================================================//
abstract class PreyBird extends AbstractBird{


    protected String sharedChar = "sharp hooked beaks and visible nostrils";


    @Override
    public Food[] getFavFood() {

        return this.favFood;
    }

    abstract String getSharedChar();

}

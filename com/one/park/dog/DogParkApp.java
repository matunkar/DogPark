package DogPark1;

public class DogParkApp {
    public static void main (String[] args) {
        DogPark evilRidge = new DogPark("Evil Ridge");
        DogPark sickeningStream = new DogPark("Sickening Stream", 77);

        for(int i = 0; i < 49; i++) {
            evilRidge.addDog();
        }

        for (int i = 0; i < 20; i++) {
            sickeningStream.addDog();
        }

        System.out.println("The dog park " + evilRidge.getName() + " has a current capacity of " + evilRidge.getCurrentCapacity() + " and a max capacity of " + evilRidge.getMaxDogs() +".");
        System.out.println("The dog park " + sickeningStream.getName() + " has a current capacity of " + sickeningStream.getCurrentCapacity() + " dogs and a max capacity of " + sickeningStream.getMaxDogs() +" dogs.");

        for (int i = 0; i < 5; i++) {
            evilRidge.removeDog();
        }
        for (int i = 0; i < 15; i++) {
            sickeningStream.removeDog();
        }

        System.out.println("The dog park " + evilRidge.getName() + " has a current capacity of " + evilRidge.getCurrentCapacity() + " and a max capacity of " + evilRidge.getMaxDogs() +".");
        System.out.println("The dog park " + sickeningStream.getName() + " has a current capacity of " + sickeningStream.getCurrentCapacity() + " dogs and a max capacity of " + sickeningStream.getMaxDogs() +" dogs.");

        evilRidge.closePark();
        sickeningStream.closePark();

        System.out.println("The dog park " + evilRidge.getName() + " has a current capacity of " + evilRidge.getCurrentCapacity() + " and a max capacity of " + evilRidge.getMaxDogs() +".");
        System.out.println("The dog park " + sickeningStream.getName() + " has a current capacity of " + sickeningStream.getCurrentCapacity() + " dogs and a max capacity of " + sickeningStream.getMaxDogs() +" dogs.");
    }
}

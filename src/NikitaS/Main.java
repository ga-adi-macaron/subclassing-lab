package NikitaS;

public class Main {

    public static void main(String[] args) {
        Dinosaurs trifect = new Dinosaurs("Trifectianosaur", 6, 30.25f, true, false,true);
        Dinosaurs trex = new Dinosaurs("Tyrannosaurus Rex", 2, 70, false, true, false);

        Primate chimp = new Primate("Chimpanzee", 15, false, 240, false, "pretty dang smart");

        Reptile gecko = new Reptile ("Gecko", 4, 4, false, true, false);
        Mammal sasquatch = new Mammal("Sasquatch", 2, 13, true, 270, false);
        Animal blobfish = new Animal("Blobfish", 0, 14, false);

        blobfish.printAll();
        System.out.println("\n");

        sasquatch.printAll();
        System.out.println("\n");

        gecko.printAll();
        System.out.println("\n");

        chimp.printAll();
        System.out.println("\n");

        trex.printAll();
        System.out.println("\n");

        trifect.printAll();
    }
}

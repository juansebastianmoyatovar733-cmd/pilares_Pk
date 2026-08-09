public class MainCoro {
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro("Firulais"),
            new Gato("Michi"),
            new Vaca("Lola"),
            new Loro("Paco"),
            new Loro("Coco")
        };

        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}

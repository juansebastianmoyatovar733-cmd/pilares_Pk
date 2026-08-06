public class MainVeterinaria {
    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais", 4);
        Gato michi = new Gato("Michi", 2);
        Pajaro piolin = new Pajaro("Piolin", 1);

        firulais.presentarse();
        firulais.comer();
        firulais.hacerSonido();
        firulais.perseguirCola();
        System.out.println("---");

        michi.presentarse();
        michi.dormir();
        michi.hacerSonido();
        michi.ronronear();
        System.out.println("---");

        piolin.presentarse();
        piolin.comer();
        piolin.hacerSonido();
        piolin.volar();
    }
}

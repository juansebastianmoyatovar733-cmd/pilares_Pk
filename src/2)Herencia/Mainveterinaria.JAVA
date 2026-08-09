public class MainVeterinaria {
    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais", 4);
        Gato michi = new Gato("Michi", 2);

        firulais.comer();          // Heredado del padre
        firulais.hacerSonido();    // Sobrescrito
        firulais.perseguirCola();  // Propio de Perro
        System.out.println("---");

        michi.dormir();      // Heredado del padre
        michi.hacerSonido(); // Sobrescrito
        michi.ronronear();   // Propio de Gato
    }
}

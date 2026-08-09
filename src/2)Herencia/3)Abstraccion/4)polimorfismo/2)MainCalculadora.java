public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("2 + 3 = " + calc.sumar(2, 3));
        System.out.println("1 + 2 + 3 = " + calc.sumar(1, 2, 3));
        System.out.println("2.5 + 3.7 = " + calc.sumar(2.5, 3.7));
        System.out.println("Hola + Mundo = " + calc.sumar("Hola", "Mundo"));
        System.out.println("4 + 2.5 = " + calc.sumar(4, 2.5));

        int[] numeros = {10, 20, 30, 40};
        System.out.println("Suma del arreglo {10,20,30,40} = " + calc.sumar(numeros));
    }
}

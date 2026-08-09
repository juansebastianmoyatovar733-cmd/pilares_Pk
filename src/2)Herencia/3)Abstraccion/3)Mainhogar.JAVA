public class MainHogar {
    public static void main(String[] args) {
        Televisor tv = new Televisor("LG");
        Nevera nv = new Nevera("Samsung");
        Lavadora lv = new Lavadora("Whirlpool");

        tv.encender();
        tv.funcionPrincipal();
        System.out.println("---");

        nv.funcionPrincipal(); // Sin encender - dara mensaje de error
        nv.encender();
        nv.funcionPrincipal();
        System.out.println("---");

        lv.encender();
        lv.funcionPrincipal();
        lv.centrifugar();
    }
}

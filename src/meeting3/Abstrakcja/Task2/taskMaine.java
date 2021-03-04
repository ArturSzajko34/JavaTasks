package meeting3.Abstrakcja.Task2;

public class taskMaine {
    public static void main(String[] args) {
        Komar komar = new Komar();
        Osa osa = new Osa();
        Tesla tesla = new Tesla();
        Volkswagen volkswagen = new Volkswagen();
        Wigry3 wigry3 = new Wigry3();

        System.out.println(komar);
        System.out.println(osa);
        System.out.println(tesla);
        System.out.println(volkswagen);
        System.out.println(wigry3);

        System.out.println("******************");


        komar.fillUp();
        osa.fillUp();
        tesla.fillUp();
        volkswagen.fillUp();
        wigry3.fillUp();

    }
}

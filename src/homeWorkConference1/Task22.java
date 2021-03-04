package homeWorkConference1;
/*
Napisz program, który odwraca tekst (zapisuje od końca)
revertText("worl") > "lrow"
 */
public class Task22 {
    public static void main(String[] args) {
        revertText("kot");
        revertText("artur");

    }
    public static void revertText(String value){
        StringBuffer stringBuffer = new StringBuffer(value);
        System.out.println(stringBuffer.reverse());
    }
}

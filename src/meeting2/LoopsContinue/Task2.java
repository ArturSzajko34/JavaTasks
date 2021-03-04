package meeting2.LoopsContinue;
/*
Napisz program, który wypisuje parzyste liczby w przedziale 1-20. Użyj continue.
 */
public class Task2 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 20; i++){
            if(i % 2 != 0){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}

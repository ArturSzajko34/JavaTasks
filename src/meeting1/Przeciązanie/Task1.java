package meeting1.Przeciązanie;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(averageParametrs(3,3,3));
        System.out.println(averageParametrs(10,10,10,10));
        System.out.println(averageParametrs(1,1,1,1,1));

    }

    public static int averageParametrs(int a , int b, int c){
        return (a+b+c)/3;
    }

    public static int averageParametrs(int a , int b, int c, int d){
        return (a+b+c+d)/4;
    }

    public static int averageParametrs(int a , int b, int c, int d, int e){
        return (a+b+c+d+e)/5;
    }
}

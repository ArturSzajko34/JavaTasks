package meeting4.Task1;

public class Task1 {


    public static void main(String[] args) {

        getObject("test");
        getObject(1);
        getObject(11.1);
        getObject(8.61f);

    }

    public static void getObject(Object objects){
        if(objects instanceof String){
            System.out.println("Obiekt to String");
        }
        else if(objects instanceof Integer){
            System.out.println("Obiekt to Intiger");
        }
        else if(objects instanceof Double){
            System.out.println("Obiekt to Doubel");
        }
        else {
            System.out.println("Nie znany obiekt");
        }
    }


}

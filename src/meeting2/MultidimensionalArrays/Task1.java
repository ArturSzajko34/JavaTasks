package meeting2.MultidimensionalArrays;

public class Task1 {
    public static void main(String[] args) {
                                        //0        //1      //2
        String[][] namesSurname = {{"Artur", "Sabina", "Damian"},           //0
                                    {"Szajko", "Oska", "Wojciechowski"}};   //1

        System.out.println(namesSurname[1][2]);


        String[][] stringArray = {{"cat","dog","mouse"},
                                {"ford","audi","fiat","mercedes"}};


        for (int i = 0 ; i < stringArray.length; i++){
            for (int j = 0 ; j < stringArray[i].length; j++){
                System.out.println(stringArray[i][j]);
            }

        }





    }


}

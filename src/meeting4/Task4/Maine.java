package meeting4.Task4;

public class Maine {
    public static void main(String[] args) {

       Generic<String> generic1 = new Generic<>();
       generic1.setContent("123");

       Generic<Integer> generic2 = new Generic<>();
       generic2.setContent(123);

       GenericObject genericObject1 = new GenericObject();
       genericObject1.setContent(123);
       genericObject1.setContent("123");

        GenericObject genericObject2 = new GenericObject();
        genericObject1.setContent("123");
        genericObject1.setContent(123);

    }
}

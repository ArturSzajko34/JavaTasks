package homeWorkConference1;

public class Task7 {
    /*
    Dodaj implementację do metody convertUsdToPln, która kwotę podaną w dolarach przeliczy na polskie złotówki
    uwzgldniajac podany przelicznik wymiany.Użyj wyrażenia return by zwrócić wynik działania metody.
    W metodzie main wywołaj metodę wydrukuj trzykrotnie wynik metody convertUsdToPlndla 3 różnych kwot.
     */
    public static void main(String[] args) {
        System.out.println(convertUsdToPLN(10, 4.10));
        System.out.println(convertUsdToPLN(20, 3.90));
        System.out.println(convertUsdToPLN(30, 5.0));
    }

    public static double convertUsdToPLN(double usd, double exchange) {
        return usd * exchange;
    }

}

package Obiect;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ObiectTest {

    @Test
    public void metodaTest(){
        List<String> dotariExterioareAudi = Arrays.asList("Faruri Led", "Oglinzi electrice", "Camera video");
        Audi AudiA1 = new Audi("Audi", "A1", "Rosu", "motorina", 2021, 1999, 10000, dotariExterioareAudi);

        AudiA1.setCuloare("Gri");
        AudiA1.prezentareAudi();
        AudiA1.definireImpozit();
        System.out.println();

//        List<String> dotariInterioareBMW = Arrays.asList("Incalzire scaune", "Incalzire volan", "Senzor parcare");
//        List<String> dotariExterioareBMW = Arrays.asList("Faruri Led", "Oglinzi electrice", "Camera video");
//        BMW BMW = new BMW("BMW", "X5", "Gri", "diesel", 2000, 2001, 20000, dotariInterioareBMW, dotariExterioareBMW);
//        BMW.prezentareBMW();
//        BMW.definireImpozit();
//        System.out.println();
//
//        Masina Toyota = new Masina("Toyota", "Prius", "Verde", "diesel", 2001, 1997, 15000);
//        Toyota.prezentareMasina();
//        Toyota.definireImpozit();
    }
}

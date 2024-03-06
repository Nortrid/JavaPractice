package variabilaMetoda;

import org.testng.annotations.Test;

import java.lang.reflect.Parameter;

public class Cursant1 {

   // public String nume;

    @Test
    public void metodaTest() {
        prezentareCursant1("Anton", "Doru", 30, 1.72, 60.66f, 'M', false);
        prezentareCursant1("Abc", "Dce", 31, 1.82, 70.66f, 'F', true);
    }

    public void prezentareCursant1(String Parameter1,
                                   String Parameter2,
                                   Integer Parameter3,
                                   Double Parameter4,
                                   Float Parameter5,
                                   Character Parameter6,
                                   Boolean Parameter7)

    {
        System.out.println("Numele complet al cursantului este "+Parameter1+" "+Parameter2);
        System.out.println("Varsta cursantului este "+Parameter3);
        System.out.println("Inaltimea cursantului este "+Parameter4);
        System.out.println("Greutatea cursantului este "+Parameter5);
        System.out.println("Sexul cursantului este "+Parameter6);
        System.out.println("Are cursantul restante? "+Parameter7);


    }
}

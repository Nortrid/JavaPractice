package Teme;

import org.testng.annotations.Test;

import java.lang.reflect.Parameter;

public class Masini {

    public String marca;
    public String culoare;
    public Boolean esteAvariata;
    public Character cutieDeViteze;
    public Integer anFabricatie;
    public Float consumExtraurban;
    public Double km;

@Test
    public void metodaTest()
    {

        prezentareMasini("Audi", "Negru", false, 'M', 2023, 6.66f, 500.5213);
        prezentareMasini("Mercedes", "Alb", true, 'A', 1990, 15.44f, 1000000.545);
        prezentareMasini("Mitsubishi", "Albastru", false, 'M', 2019, 9.345f, 7000.552);
        prezentareMasini("Subaru", "Gri", true, 'A', 2015, 7.642f, 24000.5232);
    }

    public void prezentareMasini(String Parameter1,
                                 String Parameter2,
                                 Boolean Parameter3,
                                 Character Parameter4,
                                 Integer Parameter5,
                                 Float Parameter6,
                                 Double Parameter7)
    {
        System.out.println("Marca masinii este "+Parameter1);
        System.out.println("Culoarea masinii este "+Parameter2);
        System.out.println("Masina este avariata "+Parameter3);
        System.out.println("Masina are cutie de viteza "+Parameter4);
        System.out.println("Anul de fabricatie al masinii este "+Parameter5);
        System.out.println("Masina consuma extraurban "+Parameter6+'/'+100+"km");
        System.out.println("Masina are "+Parameter7+"km "+ "parcursi");
        System.out.println();

    }
}

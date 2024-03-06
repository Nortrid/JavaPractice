package Teme;

import org.testng.annotations.Test;

public class Planets {

    public String name;
    public Character surface;
    //terrestrial of gas
    public Boolean binaryStar;
    public Boolean haveRings;
    public String composition;
    public Boolean hasAtmosphere;
    public Double age;
    public Integer radious;
    public Double gravity;
    public Long distanceToPrimarySun;

    @Test
    public void testingMethod() {
        planetsDescription("Earth", 'T', false, false, "RockandMetal", true, 4543000000.0, 6378, 1.0, 149000000L);
        planetsDescription("Saturn", 'G', false, true, "HydrogenandHelium", false, 450300000.0, 58232, 1.11, 143000000000L);

    }

    public void planetsDescription(String Parameter1,
                                   Character Parameter2,
                                   Boolean Parameter3,
                                   Boolean Parameter4,
                                   String Parameter5,
                                   Boolean Parameter6,
                                   Double Parameter7,
                                   Integer Parameter8,
                                   Double Parameter9,
                                   Long Parameter10)
    {
    System.out.println("The name of the planet is "+ Parameter1);
    System.out.println("The planet is Terrestrial or Gas: " + Parameter2);
    System.out.println("The planet has binary Star System? " + Parameter3);
    System.out.println("The planet has rings? " + Parameter4);
    System.out.println("The planet composition is: " + Parameter5);
    System.out.println("The planet has atmosphere? " + Parameter6);
    System.out.println("The planet age is: " + Parameter7);
    System.out.println("The planet radious is: " + Parameter8 + "km");
    System.out.println("The planet's gravity is " + Parameter9 + 'G');
    System.out.println("The distance of the planet from the sun is: " + Parameter10);
    System.out.println();
    }
}

package StaticKeword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public  void metodaTest(){
        Elev elev = new Elev("Doru", "Anton");
        elev.prezentare();
        System.out.println();
        Elev elevA = new Elev("A", "B");
        elevA.prezentare();
    }
}

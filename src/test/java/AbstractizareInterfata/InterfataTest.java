package AbstractizareInterfata;

import org.testng.annotations.Test;

public class InterfataTest {

    @Test public void testMethod(){

        PersoanaStudent Doru = new PersoanaStudent("Doru", "Anton", 30);
        PersoanaAngajat Doru2 = new PersoanaAngajat("Doru", "Anton", 30);
        PersoanaStudentAngajat Doru3 = new PersoanaStudentAngajat("Doru", "Anton", 30);

    }
}

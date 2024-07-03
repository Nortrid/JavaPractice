package euro2024;

import com.fasterxml.jackson.databind.ObjectMapper;
import euro2024.turneu.Euro2024;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class RecapitulareTest {

    @Test
    public void metodaTest() {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("src/test/java/euro2024/TestData.json");

        try {
            Euro2024 euro2024 = objectMapper.readValue(jsonFile, Euro2024.class);
            System.out.println("Successfully read and deserialized JSON into Euro2024 object:");
            System.out.println(euro2024); // Optionally, print the deserialized object
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

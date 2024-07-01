package valueRefferenceType;

import org.testng.annotations.Test;

public class ValueReference {

    public int originalInt = 10;
    public String originalString = "Doru";
    public Fruct mar = new Fruct("mar", "primavara");
    public final int secondInt = 5;

    @Test
    public void testMethod() {
        System.out.println("1. VALUE TYPE");
        valueTypeExample(originalInt);
        System.out.println("Valoarea initiala este: " + originalInt);

        System.out.println("2. REFERENCE TYPE - STRING OBJECT");
        referenceTypeStringExample(originalString);
        System.out.println("Valoarea initiala este: " + originalString);

        System.out.println("3. REFERENCE TYPE - OBJECT");
        referenceTypeObjectExample(mar);
        mar.descriere();

        System.out.println("4. FINAL");
//        secondInt = secondInt + 10;
    }

    public void valueTypeExample(Integer value) {
        value = value + 5;
        System.out.println("Valoarea noua este: " + value);
    }

    public void referenceTypeStringExample(String value) {
        value = value + " Anton";
        System.out.println("Valoarea noua este: " + value);
    }

    public void referenceTypeObjectExample(Fruct fruct) {
        fruct.sezon = "toamna";
        fruct.descriere();
    }
}

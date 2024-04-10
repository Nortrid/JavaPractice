package Exceptii;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Miercuri {

    //exceptie = eroare care apare in momentul cand programul ruleaza
    //exceptiile trebuie tratate deoarece contin informatii care pot sa fie exploatate
    //eg.: citim continutul unui fisier care nu exista => fileNotFoundException
    //eg.: citim datele dintr-un tabel din baza de date => sqlException
    //ca sa tratam o exceptie ne folosim de constructia : try...catch...finally
    //exista 2 tipuri de exceptii: checked si unchecked
    //checked => exceptii care se trateaza in timpul compilarii
    //unchecked => exceptii care nu se trateaza in timpul compilarii
    //exista 2 cuvinte cheie pt tratarea exceptiilor: throw si throws
    //throw = folosit sa arunce o exceptie anume
    //throw => este regasit in interiorul unei metode
    //throws => este folosit in semnatura metodei ca sa declare ca o metoda poate arunca o exceptie

    @Test
    public void testMethod() throws FileNotFoundException {
//        incarcaFisier();
//        afisareCursanti();
//        cumparEnergizant();
        incarcaFisierV2();
    }

    public void incarcaFisier(){
        try {
            File file = new File("adresa/resursa");
            FileInputStream fileInputStream = new FileInputStream(file);
        }
        catch (FileNotFoundException exception){
            System.out.println("Fisierul nu exista");

        }
        finally {
            System.out.println("A intrat pe finally indiferent daca a cazut sau nu");
        }
    }

    public void afisareCursanti(){

        String [] Cursanti = new String[2];
        Cursanti[0] = "Bogdan";
        Cursanti[1] = "Ioana";
        Cursanti[2] = "Ion";

        for (int i=0; i<Cursanti.length; i++){
            System.out.println(Cursanti[i]);
        }
    }

    public void cumparEnergizant(){
        Integer varsta = 15;
        if (varsta <=18){
            throw new RuntimeException("Persoana este minora");
        }
    }

    public void incarcaFisierV2() throws FileNotFoundException {
        File file = new File("adresa/resursa");
        FileInputStream fileInputStream = new FileInputStream(file);
    }
}

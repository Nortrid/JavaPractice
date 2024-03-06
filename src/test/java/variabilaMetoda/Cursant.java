package variabilaMetoda;

import com.beust.jcommander.IParameterValidator2;
import org.testng.annotations.Test;

import java.lang.reflect.Parameter;

public class Cursant {
    //clasa=sablon specific unui anumit obiect/produs
    //o clasa trebuia sa contina un nume
    //recunoastem o clasa intr-un fisier java dupa cuvantul class
    //intr-un fisier java putem avea mai multe clase(nu este un practice bun)

    //variabila= proprietatea/atributul unei clase
    //intr-o clasa putem avea mai multe variabile
    //exista 2 tipuri de variabile: global si local
    //variabila globala = vizibila peste tot in acest fisier
    //variabila locala = vizibila doar in locul unde este definita
    //pentru inceput toate variabilele globale sunt publice
    //diferenta intre global si local o face access controll (global = public)

    //"public" inainte de "class" inseamna ca nu este nici o restrictie. "private" restrictioneaza accessul, public in sine este un keyword

    //un cuvant sau o propozitie e un sir de caractere, tip de data "string"

    //Tipuri de date: String, Integer (eg. varsta, nr intreg), Double (eg inaltime 1.72)(e pe 64 de bit deci e mai precis), Float (32 bit), Character, Boolean

    //nu este obligatoriu ca o variabila sa plateasca o valoare cand o definim, valoarea poate fi data pe parcurs

    public String nume;
    public String prenume;
    public Integer varsta;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;


    //metoda = actiunea unei clase
    //intr-o clasa putem avea mai multe metode diferentiate prin nume
    //metodele sunt de 2 feluri: void si return
    //metoda void = cea mai des folosita si are ca scop executarea si afisarea informatiei;
    //metoda return = are ca scop sa execute si sa returneze informatia (executi actiunea dar se retine nu se afiseaza)
    //o metoda poate sau nu sa contina parametri
    //parametri se diferentiaza prin nr.(nici un parametru, 1-2 etc. De ex logarea pe site- 1parametru logare email si parola, 2 username si parola, 3 telefon si parola), nume sau tip.

    @Test
    public void metodaTest() {
//        nume="Anton";
//        prenume="Doru";
//        varsta=30;
//        inaltime=1.72;
//        greutate=60.66f; //"f" pentru a defini tipul float
//        sex='M';
//        areRestante=false;

        prezentareCursant("Anton", "Doru", 30, 1.72, 60.66f, 'M', false);
        //aici am apelat metoda de jos in metoda curenta
        prezentareCursant("X", "Y", 60, 1.7, 60.00f, 'F', true);
        calculMedie(6,7,8,4,3);

        System.out.println(getSalariu());
    }


    public void prezentareCursant(String param1,
                                  String param2,
                                  Integer param3,
                                  Double param4,
                                  Float param5,
                                  Character param6,
                                  Boolean param7) {

        System.out.println("Numele complet al cursantului este " + param1 + " " + param2);
        //+ = e concatenare/lipire 2 stringuri
        System.out.println("Varsta cursantului este " + param3);
        System.out.println("Inaltimea cursantului este" + " " + param4);
        System.out.println("Greutatea cursantului este " + param5);
        System.out.println("Sexul cursantului este " + param6);
        System.out.println("Are cursantul restante? " + param7);
        nume="Bianca";
    }

    //calculam media cursantului

    public void calculMedie(Integer nota1,
                            Integer nota2,
                            Integer nota3,
                            Integer nota4,
                            Integer nota5)
    {
        Integer medie=(nota1+nota2+nota3+nota4+nota5)/5;

        System.out.println("Media cursantului este "+medie);
        nume="Doru";
    }

    //exemplu metoda return
    public Integer getSalariu(){
        Integer salar=2000;
        return salar;
    }

}

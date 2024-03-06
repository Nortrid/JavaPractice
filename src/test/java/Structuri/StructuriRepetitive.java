package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {
    //structuri repetitive = for, while, for each

    @Test
    public void metodatest(){
//afisamPrimelenNr(5);
//afisamPrimeleNrWhile(5);
afisareNrPare();
    }

    //afisam priemel 15 nr
    public void  afisamPrimelenNr(Integer capat){
        for (Integer index=0; index <= capat; index ++){
            System.out.println(index);
        }
    }

    //aceasi metoda cu "while"
    public void afisamPrimeleNrWhile(Integer capat) {
        Integer index=0;

        while (index <= capat){
            System.out.println(index);
            index ++;
//ultima linie trebuie sa fie incrementarea +1 la "while"
// for este o structura cu numar finit iar "while" infint de pasi
        }
    }

    //afisam numerele pare de la 0 - 20

    public void afisareNrPare() {
        for (Integer i = 0; i<=20; i++){
            if(i%2==0){
                System.out.println(i);}
        }
    }
}

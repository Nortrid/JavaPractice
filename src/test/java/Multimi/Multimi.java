package Multimi;

import org.testng.annotations.Test;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {
    //multimi = array, lista

    @Test
    public void test() {
//        colegiCursArray();
//        colegiCursList();
//        diferiteGrupe();
//        tariOrase();
//        retetaGatit();
//        retetaGatit();
        retete();


    }

     //reprezentam multimea colegilor de la curs

    public void colegiCursArray() {
        String[] Colegi = new String[5];
        Colegi[0] = "Daniel";
        Colegi[1] = "Alexandru";
        Colegi[2] = "Doru";
        Colegi[3] = "Carina";
        Colegi[4] = "Robert";
        for (Integer index = 0; index < Colegi.length; index++) {
            System.out.println(Colegi[index]);
        }
    }

    public void colegiCursList() {
        List<String> Colegi = new ArrayList<>();
        Colegi.add("Daniel");
        Colegi.add("Alexandru");
        Colegi.add("Doru");
        Colegi.add("Carina");
        Colegi.add("Robert");
        for (Integer index = 0; index < Colegi.size(); index++) {
            System.out.println(Colegi.get(index));
        }
    }

    //map => key-value(ar fi fruct)-valoare(ar fi mar)
    public void diferiteGrupe() {
        Map<String, String> Obiecte = new HashMap<>();
        Obiecte.put("fruct", "mar");
        Obiecte.put("haina", "pantaloni");
        Obiecte.put("intrument", "chitara");
        for (String key : Obiecte.keySet()) {
            System.out.println("cheia este " + key);
            System.out.println("valoarea este " + Obiecte.get(key));
        }
    }

    //reprezentam niste tari cu orasele care le apartin
    public void tariOrase() {
        Map<String, List<String>> Diverse = new HashMap<>();

        List<String> OraseRomania = new ArrayList<>();
        OraseRomania.add("Brasov");
        OraseRomania.add("Timisoara");
        OraseRomania.add("Sibiu");

        List<String> OraseSpania = new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Madrid");
        OraseSpania.add("Tenerife");

        List<String> OraseItalia = new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Milano");
        OraseItalia.add("Napoli");

        Diverse.put("Romania", OraseRomania);
        Diverse.put("Spania", OraseSpania);
        Diverse.put("Italia", OraseItalia);

        for (String key : Diverse.keySet()) {
            if (key.equals("Spania")) {
                System.out.println("tara este " + key);
                System.out.println("orasele sunt " + Diverse.get(key));
            }

            //cheia trebuie sa fie unica valorile pot sa fie duplicate
        }
//tema pt acasa: prezentare reteta, mancare cu lista de ingrediente
//adauga cartiere pt orasele specificate, la linia 66 exemplu, de acolo luam primul map simplu si apoi facem cartiere
    }

//    public void retetaGatit() {
//        Map<String, String> Obiecte = new HashMap<>();
//        Obiecte.put("risotto", "orez, ceapa, usturoi, piept de pui, morcov, telina, dovleac, ardei, ciuperci");
//        //sau Obiecte.put pentru fiecare valoare
//        for (String key : Obiecte.keySet()) {
//            System.out.println("Reteta este " + key);
//            System.out.println("Ingredientele sunt " + Obiecte.get(key));
//        }
//    }

    public void retete(){
        Map<String, List<String>> ListaRetete = new HashMap<>();

        List<String> IngredienteRisotto = new ArrayList<>();
        IngredienteRisotto.add("piept pui");
        IngredienteRisotto.add("ciuperci");
        IngredienteRisotto.add("ceapa");

        List<String> IngredientePastecuFructedeMare = new ArrayList<>();
        IngredientePastecuFructedeMare.add("fructe de mare");
        IngredientePastecuFructedeMare.add("sos de smantana dulce");
        IngredientePastecuFructedeMare.add("rosi chery");
        IngredientePastecuFructedeMare.add("dovlecel");

       ListaRetete.put("Risotto", IngredienteRisotto);
       ListaRetete.put("PastecuFructedeMare", IngredientePastecuFructedeMare);

        for (String key : ListaRetete.keySet()) {
        {
                System.out.println("Reteta este " + key);
                System.out.println("Ingredientele sunt " + ListaRetete.get(key));
            }


        }
    }

}




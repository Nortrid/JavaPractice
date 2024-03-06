package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultimiExercitii {

    @Test
    public void metodaTest() {

        retete();
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

package Obiect;

import java.util.List;

public class Audi extends Masina{

    private List<String> dotariExterioare;

    private Integer pretFinal;
    public Audi(String marca, String model, String culoare, String carburant, Integer an, Integer capacitateCilindrica, Integer pret, List<String> dotariExterioare)
    {
        super(marca, model, culoare, carburant, an, capacitateCilindrica, pret);
        this.dotariExterioare = dotariExterioare;
    }

    public void prezentareAudi () {
        prezentareMasina();
        calculDotari();
        System.out.println("Pretul final al masinii este " + pretFinal);
        System.out.println("Dotarile exterioare sunt " + dotariExterioare);
    }

    //polimorfism static
    public void afisarePret(){
        System.out.println(pretFinal);
    }

    public void afisarePret(Integer reducere){
        System.out.println("Pret reducere");
    }

    public void afisarePret(String voucher){
        System.out.println("Pret voucher");
    }

    public void calculDotari () {
        pretFinal = getPret();
        for (Integer index = 0; index < dotariExterioare.size(); index++){
            switch (dotariExterioare.get(index)){
                case "Faruri Led":
                    pretFinal +=  100;
                    break;
                case "Oglinzi electrice":
                    pretFinal +=  120;
                    break;
                case "Camera video":
                    pretFinal +=  130;
                    break;
            }
        }
    }

    @Override
    public void pornesteMasina() {
        System.out.println("Masina Audi porneste de la buton!");
    }
}

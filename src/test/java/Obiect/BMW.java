package Obiect;

import java.util.List;

public class BMW extends Masina {
    private List<String> dotariInterioare;
    private List<String> dotariExterioare;
    private Integer pretFinal;

    public BMW(String marca, String model, String culoare, String carburant, Integer an,
               Integer capacitateCilindrica, Integer pret, List<String> dotariInterioare, List<String> dotariExterioare) {
        super(marca, model, culoare, carburant, an, capacitateCilindrica, pret);
        this.dotariInterioare = dotariInterioare;
        this.dotariExterioare = dotariExterioare;
    }

    public void prezentareBMW() {
        prezentareMasina();
        calculDotari();
        System.out.println("Pretul final este: " + pretFinal);
        System.out.println("Dotarile interioare sunt " + dotariInterioare);
        System.out.println("Dotarile exterioare sunt " + dotariExterioare);
    }

    public void calculDotari() {
        pretFinal = getPret();
        for (Integer index = 0; index < dotariExterioare.size(); index++) {
            switch (dotariExterioare.get(index)) {
                case "Faruri Led":
                    pretFinal +=  70;
                    break;
                case "Oglinzi electrice":
                    pretFinal +=  90;
                    break;
                case "Camera video":
                    pretFinal +=  110;
                    break;
            }
        }

        for (Integer index = 0; index < dotariInterioare.size(); index++) {
            switch (dotariInterioare.get(index)) {
                case "Incalzire scaune":
                    pretFinal +=  100;
                    break;
                case "Oglinzi electrice":
                    pretFinal +=  190;
                    break;
                case "Senzor parcare":
                    pretFinal +=  80;
                    break;
            }
        }
    }

    public void pornesteMasina(){
        System.out.println("Masina BMW pornește din comandă vocală!");
    }
}

package Obiect;

import java.sql.SQLOutput;

public class Masina {
    //constructor = are ca rol sa initializeze variabilele unei clase
    //putem sa recunoastem un constructor dupa numele clasei (masina)
    //de cele mai multe ori constructorul este public
    //exista 2 tipuri de constructori: cu parametri sau fara parametri
    //intr-o clasa java exista un constructor default fara parametri
    //obiect = instanta unei clase
    //dintr-o clasa putem instanta n obiecte
    //obiectele se diferentiaza prin numele lor sau prin numarul de parametri pe care il primesc
    //in momentul cand un obiect primeste valori(se initializeaza) se apeleaza constructorul din clasa

    private String marca;
    private String model;
    private String culoare;
    private String carburant;
    private Integer an;
    private Integer capacitateCilindrica;
    private Integer pret;

    //exista 4 concepte OOP - mostenire, incapsulare, abstractizare, polimorfism
    //mostenire = conceptul prin care o clasa este mostenita(extinsa) de o alta clasa
    //cand o clasa mosteneste o alta clasa se formeaza o relatie de parinte - copil
    //in java o clasa poate mosteni doar o singura clasa
    //cand se aplica mostenirea copilul poate accesa toate variabilele/metodele din parinte daca sunt public/protected
    //in momentul cand copilul mosteneste parintele copilul trebuie sa apeleze constructorul din parinte cu super


    //incapsulare = conceptul prin care excludem posibilitatea ca unele informatii sa fie modificate din exteriorul clasei
    //access control in java = public, private, protected, default
    //public = ofera vizibilitate in toate pachetele din proiect
    //private = restrange vizibilitatea doar in clasa unde este definit
    //ca sa oferim vizibilitate proprietatilor in alte clase apelam la conceptul getter/setter

    //polimorfism = conceptul prin care o metoda poate avea implementare diferita
    //polimorfismul este de 2 feluri dinamic (override) si static (overload)
    //polimorfismul dinamic = intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //polimorfismul dinamic se regaseste tot timpul in procesul de mostenire
    //polimorfismul static = posibilitatea prin care o metoda cu acelasi nume sa fie implementata de mai multe ori
    //diferentierea dintre aceste metode s-ar face prin nr sau tipul de parametri
    //polimorfismul static se poate aplica doar la metodele cu void

    public Masina(String marca, String model, String culoare, String carburant, Integer an, Integer capacitateCilindrica) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.an = an;
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public Masina(String marca, String model, String culoare, String carburant, Integer an, Integer capacitateCilindrica, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.an = an;
        this.capacitateCilindrica = capacitateCilindrica;
        this.pret = pret;
    }
    //definim prima implementare pentru o metoda pe care o vom suprascrie
    public void pornesteMasina(){
        System.out.println("Masina porneste de la cheie!");
    }

    public void prezentareMasina(){

        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Culoare masinii este " + culoare);
        System.out.println("Carburantul masinii este " + carburant);
        System.out.println("Anul fabricarii masinii este " + an);
        System.out.println("Capacitatea cilindrica este " + capacitateCilindrica);

        if (pret!=null){
            System.out.println("Pretul initial al masinii este " + pret);
        }
        else {
            System.out.println("Masina nu are pret");
        }
    }

    //daca anul este >= 2023 => 5 lei
    //daca anul este intre 2020 - 2023 => 10 lei
    //2020 = 20 lei
    public void definireImpozit(){

        if (an >= 2023){
            System.out.println("Pentru "+ marca + " din anul " + an + " impozitul masinii este 5 lei");
        }
        else if (an>2020 && an < 2023){
            System.out.println("Pentru "+ marca + " din anul " + an + " impozitul masinii este 10 lei");
        }
        else if(an==2020){
            System.out.println("Pentru "+ marca + " din anul " + an + " impozitul masinii este 20 lei");
        }
        else {
            System.out.println("Nu se plateste impozit.");
        }

    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getCarburant() {
        return carburant;
    }

    public Integer getAn() {
        return an;
    }

    public Integer getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public Integer getPret() {
        return pret;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public void setCapacitateCilindrica(Integer capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }
}


//facem getter/setter






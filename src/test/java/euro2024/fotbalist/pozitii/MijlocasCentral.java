package euro2024.fotbalist.pozitii;

import euro2024.fotbalist.Fotbalist;
import euro2024.fotbalist.interfete.MijlocasInterface;
import lombok.NoArgsConstructor;

@NoArgsConstructor

public class MijlocasCentral extends Fotbalist implements MijlocasInterface {
    public MijlocasCentral(String nume, String prenume, Integer varsta, String oras, Double rating, String nationalitate,
                           String pozitieTeren, Integer nrTricou, String club, String nationala, Boolean esteCapitan, Boolean esteTitular) {
        super(nume, prenume, varsta, oras, rating, nationalitate, pozitieTeren, nrTricou, club, nationala, esteCapitan, esteTitular);
    }

    @Override
    public void alearga() {

    }

    @Override
    public void dribleaza() {

    }

    @Override
    public void paseaza() {

    }

    @Override
    public void suteaza() {

    }

    @Override
    public void marcheaza() {

    }

    @Override
    public void mentinePosesia() {

    }

    @Override
    public void executaCorner() {

    }

    @Override
    public void executaLovituriLibere() {

    }
}

package euro2024.fotbalist.pozitii;

import euro2024.fotbalist.Fotbalist;
import euro2024.fotbalist.interfete.AtacantInterface;
import lombok.NoArgsConstructor;

@NoArgsConstructor

public class AtacantLateral extends Fotbalist implements AtacantInterface {
    public AtacantLateral(String nume, String prenume, Integer varsta, String oras, Double rating, String nationalitate, String pozitieTeren,
                          Integer nrTricou, String club, String nationala, Boolean esteCapitan, Boolean esteTitular) {
        super(nume, prenume, varsta, oras, rating, nationalitate, pozitieTeren, nrTricou, club, nationala, esteCapitan, esteTitular);
    }

    @Override
    public void evitaOffSide() {

    }

    @Override
    public void executaPenalti() {

    }

    @Override
    public void simuleazaFault() {

    }

    @Override
    public void centreaza() {

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
}

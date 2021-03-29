package com.example.demo.kinobillett.repository;

import com.example.demo.kinobillett.billetter.Billett;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AppRepo {
    private final ArrayList<Billett> billettliste = new ArrayList<>();

    public void leggInn(Billett billett ) {
        billettliste.add(billett);
    }

    public ArrayList<Billett> hentAlle() {
        return billettliste;
    }

    public void slettAlle() {
        billettliste.clear();
    }
}

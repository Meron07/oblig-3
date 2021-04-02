package com.example.demo.kinobillett.repository;

import com.example.demo.kinobillett.billetter.Billett;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AppRepo {

    @Autowired
    private JdbcTemplate db;

    public void lagreBillett(Billett billett) {
        String sql = "INSERT INTO Kunde (film,antall,fornavn,etternavn,telefonNr,epost) VALUES(?,?,?,?,?,?)";
        db.update(sql, billett.getFilm(), billett.getAntall(), billett.getFornavn(), billett.getEtternavn(),
                billett.getTelefonNr(), billett.getEpost());
    }

    public List<Billett> hentAlle() {
        String sql = "SELECT * FROM Billett";
        List<Billett> allebilleter = db.query(sql,new BeanPropertyRowMapper(Billett.class));
        return allebilleter;
    }

    public void slettAlle() {
        String sql = "DELETE FROM Billett";
        db.update(sql);
    }
}



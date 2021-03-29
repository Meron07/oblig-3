package com.example.demo.kinobillett.controll;

import com.example.demo.kinobillett.billetter.Billett;
import com.example.demo.kinobillett.repository.AppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/kinobillett")
    public class controller {
        @Autowired
        AppRepo repo;

        @PostMapping("/lagre")
        public void lagre(Billett billett) {
            repo.leggInn(billett);
        }

        @GetMapping("/hent")
        public ArrayList<Billett> hent() {
            return repo.hentAlle();
        }

        @DeleteMapping("/slett")
        public void slett() {
            repo.slettAlle(); }
    }
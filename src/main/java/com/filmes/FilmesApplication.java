package com.filmes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FilmesApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilmesApplication.class, args);
    }

    @Bean
    CommandLineRunner createMovies(FilmRepository rp) {
        return args -> {
            rp.deleteAll();

            Filme patrulhaCanina = new Filme("Patrulha Canina",
                    "Filme da patrulha canina é muito top, filme de quebrada, de gueto", 100);


            Filme barbie = new Filme("Barbie",
                    "Filme de quebrada", 120);

            Filme velozesFuriosos = new Filme("Velozes e Furiosos",
                    "È um filme de carro de gueto fi", 300);

            Filme carrossel2 = new Filme("Carrosel 2 O sumiço da maria joaquina",
                    "maria joaquina roubou os ladrao quebrada", 100);

            Filme sherek = new Filme("Sherek",
                    "Filme dahora demaizi quebrada", 200);

            rp.save(patrulhaCanina);
            rp.save(barbie);
            rp.save(velozesFuriosos);
            rp.save(carrossel2);
            rp.save(sherek);


        };

    }
}

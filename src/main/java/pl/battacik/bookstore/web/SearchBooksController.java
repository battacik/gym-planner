package pl.battacik.bookstore.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.battacik.bookstore.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static pl.battacik.bookstore.Items.Type.*;
import static pl.battacik.bookstore.Items.*;

@Slf4j //tworzy obiekt Logger (log)
@Controller //kandydat do skanowania komponentu i utworzenia SearchBooksController jako komponentu bean
@RequestMapping("/search")
public class SearchBooksController {
        @GetMapping
        public String showSearchForm(Model model){
            int maxId = 1;
            List<Items> worksListPlato = new ArrayList<>();
            List<Items> worksListAristotele = new ArrayList<>();
            List<Items> worksListPre = new ArrayList<>();

        // Dodanie przykładowych dzieł
            // Dodanie dzieł Platona
            worksListPlato.add(new Items(maxId++, "Sofista", "Platon", Items.Type.PLATO));
            worksListPlato.add(new Items(maxId++, "Polityk", "Platon", Items.Type.PLATO));
            worksListPlato.add(new Items(maxId++, "Uczta", "Platon", Items.Type.PLATO));
            worksListPlato.add(new Items(maxId++, "Fajdros", "Platon", Items.Type.PLATO));
            worksListPlato.add(new Items(maxId++, "Gorgiasz", "Platon", Items.Type.PLATO));
            worksListPlato.add(new Items(maxId++, "Teajtet", "Platon", Items.Type.PLATO));
            worksListPlato.add(new Items(maxId++, "Panstwo", "Platon", Items.Type.PLATO));
            worksListPlato.add(new Items(maxId++, "Timajos", "Platon", Items.Type.PLATO));
            worksListPlato.add(new Items(maxId++, "Fedon", "Platon", Items.Type.PLATO));
            worksListPlato.add(new Items(maxId++, "Prawa", "Platon", Items.Type.PLATO));

            // Dodanie dzieł Arystotelesa
            worksListAristotele.add(new Items(maxId++, "Nikaomachejska etyka", "Arystoteles", Items.Type.ARISTOTELE));
            worksListAristotele.add(new Items(maxId++, "Polityka", "Arystoteles", Items.Type.ARISTOTELE));
            worksListAristotele.add(new Items(maxId++, "Fizyka", "Arystoteles", Items.Type.ARISTOTELE));
            worksListAristotele.add(new Items(maxId++, "Metafizyka", "Arystoteles", Items.Type.ARISTOTELE));
            worksListAristotele.add(new Items(maxId++, "Retoryka", "Arystoteles", Items.Type.ARISTOTELE));
            worksListAristotele.add(new Items(maxId++, "Poetyka", "Arystoteles", Items.Type.ARISTOTELE));

            // Dodanie dzieł przedsokratejskich filozofów
            worksListPre.add(new Items(maxId++, "Arche", "Tales z Miletu", Items.Type.PRE_SOCRATICS));
            worksListPre.add(new Items(maxId++, "Nieustający Strumień", "Heraklit z Efezu", Items.Type.PRE_SOCRATICS));
            worksListPre.add(new Items(maxId++, "Kosmogonia", "Anaksymander", Items.Type.PRE_SOCRATICS));
            worksListPre.add(new Items(maxId++, "Pythagorejskie Odyseje", "Pythagoras", Items.Type.PRE_SOCRATICS));
            worksListPre.add(new Items(maxId++, "Atomistyczne Dialogi", "Leukippos", Items.Type.PRE_SOCRATICS));
            worksListPre.add(new Items(maxId++, "Eliackie Dydaktyki", "Ksenofanes", Items.Type.PRE_SOCRATICS));


            model.addAttribute("worksListPlato" , worksListPlato);
            model.addAttribute("worksListAristotele" , worksListAristotele);
            model.addAttribute("worksListPre" , worksListPre);

            return "searchDesigner";
    }
}

package fi.academy.harjoitus7springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class KouluKontrolleri {
    @Autowired
    KouluRepository kouluRepository;
    @Autowired
    OppilasRepository oppilasRepository;

    @GetMapping("/oppilaat")
    public Iterable<Oppilas> restMetodiGetOppilaat() {
        return oppilasRepository.findAll();
    }

    @PostMapping("/lisaaoppilas")
    public void restMetodriPostOppilas(@RequestBody Oppilas oppilas) {
        oppilasRepository.save(oppilas);
    }

    @PutMapping("/muokkaaoppilas")
    public void restMetodiPutOppilas(@RequestBody Oppilas oppilas) {
        oppilasRepository.save(oppilas);
    }

    @DeleteMapping("/poistaoppilas")
    public void restMetodiDeleteOppilas(@RequestParam(name="id", required=false) Integer id) {
        oppilasRepository.deleteById(id);
    }

    @GetMapping("/koulut")
    public Iterable<Koulu> restMetodiGetKoulut() {
        return kouluRepository.findAll();
    }

    @PostMapping("/lisaakoulu")
    public void restMetodiPostKoulu(@RequestBody Koulu koulu) {
        kouluRepository.save(koulu);
    }

    @PutMapping("/muokkaakoulu")
    public void restMetodiPutKoulu(@RequestBody Koulu koulu) {
        kouluRepository.save(koulu);
    }

    @DeleteMapping("/poistakoulu")
    public void restMetodiDeleteKoulu(@RequestParam(name="id", required=false) Integer id) {
        kouluRepository.deleteById(id);
    }
}

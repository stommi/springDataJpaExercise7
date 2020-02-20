package fi.academy.harjoitus7springdatajpa;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class Oppilas {

    @Id
    @GeneratedValue(strategy = SEQUENCE,
            generator = "oppilas_oppilas_id_seq")
    @SequenceGenerator(name = "oppilas_oppilas_id_seq",
            sequenceName = "oppilas_oppilas_id_seq",
            allocationSize = 1)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String etunimi;
    private String sukunimi;
    private Integer luokka;
    @ManyToOne
    private Koulu koulu;
//    @Version
//    private Integer versio;

    public Koulu getKoulu() {
        return koulu;
    }

    public void setKoulu(Koulu koulu) {
        this.koulu = koulu;
    }

    public Oppilas(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public Integer getLuokka() {
        return luokka;
    }

    public void setLuokka(Integer luokka) {
        this.luokka = luokka;
    }
}

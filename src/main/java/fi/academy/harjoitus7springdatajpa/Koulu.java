package fi.academy.harjoitus7springdatajpa;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class Koulu {

    @Id
    @GeneratedValue(strategy = SEQUENCE,
            generator = "koulu_koulu_id_seq")
    @SequenceGenerator(name = "koulu_koulu_id_seq",
            sequenceName = "koulu_koulu_id_seq",
            allocationSize = 1)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String nimi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
}

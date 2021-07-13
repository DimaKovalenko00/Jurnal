package by.dmitry.kovalenko.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table (name = "predmet")
@Getter
@Setter
public class Predmet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int predmet_id;
    private int kol_nb;

    @OneToOne
    @JoinColumn(name = "nazv_predmeta_id")
    private NazvPredmeta nazvPredmeta;

    @ManyToOne
    @JoinColumn(name = "predmet_usp_id")
    private PredmetUspevaimost predmetUspevaimost;




}

package by.dmitry.kovalenko.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table (name = "predmet_usp")
@Getter
@Setter
public class PredmetUspevaimost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int predmet_usp_id;
    private String dopusk_k_sesii;
    private int kol_nb;



}

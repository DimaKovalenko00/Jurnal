package by.dmitry.kovalenko.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by user on 01.02.2019.
 */
@Entity
@Table(name = "otmetka_po_predmetu")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OtmetkaPoPredmetu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int otmetky_id;
    private Date data_otmetky;
    private int otmetka;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "predmet_id")
    private Predmet predmet ;
}

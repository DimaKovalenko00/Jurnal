package by.dmitry.kovalenko.model.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by user on 01.02.2019.
 */
@Entity
@Table(name = "protivopokaz")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Protivopokaz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int protivopokaz_id;
    private String zapr_prepar;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "med_karta_id")
    private MedCarta medCarta;

}

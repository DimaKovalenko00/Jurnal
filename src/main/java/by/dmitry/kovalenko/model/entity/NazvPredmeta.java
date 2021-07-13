package by.dmitry.kovalenko.model.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by user on 01.02.2019.
 */
@Entity
@Table(name = "nazv_predmeta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class NazvPredmeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nazv_predmeta_id;
    private String nazv_predmeta;
    private String socraschenie;
}

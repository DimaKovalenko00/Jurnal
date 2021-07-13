package by.dmitry.kovalenko.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by user on 01.02.2019.
 */
@Entity
@Table(name = "prepod")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Prepod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int prepod_id;
    private String surname;
    private String name;
    private String otchestvo;
    private int stage;
    private String dolgnost;
    @ManyToOne
    @JoinColumn(name = "predmet_id")
    private Predmet predmet;
}


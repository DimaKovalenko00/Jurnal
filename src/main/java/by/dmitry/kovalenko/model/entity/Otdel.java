package by.dmitry.kovalenko.model.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by user on 01.02.2019.
 */
@Entity
@Table(name = "otdel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Otdel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int otdel_id;
    private String nazv_otdel;
}

package by.dmitry.kovalenko.model.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by user on 01.02.2019.
 */
@Entity
@Table(name = "protocol")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Protocol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int protocol_id;
    private int nomer_protocola;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mil_karta_id")
    private MilCarta milCarta;
}


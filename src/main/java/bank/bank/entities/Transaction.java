package bank.bank.entities;

import bank.bank.entities.Enum.typeTransaction;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    long idTransaction;
    Double montant;
    typeTransaction type;
    Date datetransaction;

    @ManyToOne
    @ToString.Exclude
    Compte expediteur;
    @ManyToOne
    @ToString.Exclude
    Compte destinataire;

}

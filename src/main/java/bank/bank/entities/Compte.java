package bank.bank.entities;

import bank.bank.entities.Enum.TypeCompte;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Compte  implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    long idCompte ;

    @Enumerated(EnumType.ORDINAL)
    private TypeCompte type;
    long code ;
    Double solde;
   @ManyToOne
    Bank bank;

}

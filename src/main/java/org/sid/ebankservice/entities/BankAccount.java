package org.sid.ebankservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ebankservice.enums.AccountType;

import javax.persistence.*;
import java.util.Date;
@Entity // bankAccount correspond maintenant a une table de la base de donnée
@Data //Genere getter and setter
// -------3 methodes de generations d'objets : -----//

@NoArgsConstructor// Constructeur vide
@AllArgsConstructor// Constructeur full param
@Builder // design patern --> qui cree objet

//------------FIN------------/
public class BankAccount {
    @Id
    private  String id ;
    private Date createAt;
    private Double balance;
    // @Enumerated (EnumType.STRING)// DONNE le nom des enumerations au lieu de 1/0 dans la BDD
    //@Column(length = 15) // Max lenght dans le string serra de 15
    private AccountType type;
    private String currency;


}

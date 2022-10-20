package org.sid.ebankservice.entities.repository;

import org.sid.ebankservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource // Directement avec toute les methodes " update ajout etc " //
                        //Remplace tout le code trouvé dans BankAccountRestControler//


public interface BankAccountRepository extends JpaRepository<BankAccount, String> {



}

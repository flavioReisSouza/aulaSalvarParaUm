package devsuperior.com.aulaSalvarParaUm.repositories;

import devsuperior.com.aulaSalvarParaUm.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

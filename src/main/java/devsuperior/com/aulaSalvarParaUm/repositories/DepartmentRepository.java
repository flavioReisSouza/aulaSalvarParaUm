package devsuperior.com.aulaSalvarParaUm.repositories;

import devsuperior.com.aulaSalvarParaUm.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

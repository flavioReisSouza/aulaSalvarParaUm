package devsuperior.com.aulaSalvarParaUm.services;

import devsuperior.com.aulaSalvarParaUm.dto.PersonDTO;
import devsuperior.com.aulaSalvarParaUm.dto.PersonDepartmentDTO;
import devsuperior.com.aulaSalvarParaUm.entities.Department;
import devsuperior.com.aulaSalvarParaUm.entities.Person;
import devsuperior.com.aulaSalvarParaUm.repositories.DepartmentRepository;
import devsuperior.com.aulaSalvarParaUm.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId());

        entity.setDepartment(dept);

        entity = repository.save(entity);

        return new PersonDepartmentDTO(entity);
    }

    public PersonDTO insert(PersonDTO dto) {
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept = departmentRepository.getReferenceById(dto.getDepartmentId());

        entity.setDepartment(dept);

        entity = repository.save(entity);

        return new PersonDTO(entity);
    }
}
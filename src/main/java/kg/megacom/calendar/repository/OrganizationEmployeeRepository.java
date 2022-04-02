package kg.megacom.calendar.repository;

import kg.megacom.calendar.model.entity.OrganizationEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationEmployeeRepository extends JpaRepository<OrganizationEmployee, Long> {
}

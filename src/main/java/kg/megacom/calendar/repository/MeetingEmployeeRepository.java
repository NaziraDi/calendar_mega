package kg.megacom.calendar.repository;

import kg.megacom.calendar.model.entity.MeetingEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingEmployeeRepository extends JpaRepository<MeetingEmployee, Long> {
}

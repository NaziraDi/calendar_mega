package kg.megacom.calendar.repository;

import kg.megacom.calendar.model.entity.Weekday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeekdayRepository extends JpaRepository<Weekday, Long> {
}

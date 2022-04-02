package kg.megacom.calendar.service;

import kg.megacom.calendar.model.dto.WeekdayDto;
import kg.megacom.calendar.model.entity.Weekday;
import kg.megacom.calendar.model.request.CreateWeekdayRequest;
import org.springframework.stereotype.Service;

@Service
public interface WeekdayService {

    WeekdayDto create(CreateWeekdayRequest request);
    WeekdayDto update(WeekdayDto weekdayDto);
    WeekdayDto findById(Long id);
    void save(Weekday weekday);
}

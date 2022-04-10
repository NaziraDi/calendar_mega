package kg.megacom.calendar.service;

import kg.megacom.calendar.model.dto.ScheduleDto;
import kg.megacom.calendar.model.entity.Schedule;
import kg.megacom.calendar.model.request.CreateScheduleRequest;
import org.springframework.stereotype.Service;

@Service
public interface ScheduleService {

    ScheduleDto create(CreateScheduleRequest request);
    ScheduleDto update(ScheduleDto scheduleDto);
    ScheduleDto findById(Long id);
    ScheduleDto save(ScheduleDto scheduleDto);
}

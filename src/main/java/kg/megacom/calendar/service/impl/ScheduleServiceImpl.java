package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.model.dto.ScheduleDto;
import kg.megacom.calendar.model.entity.Schedule;
import kg.megacom.calendar.model.request.CreateScheduleRequest;
import kg.megacom.calendar.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {
    @Override
    public ScheduleDto create(CreateScheduleRequest request) {
        return null;
    }

    @Override
    public ScheduleDto update(ScheduleDto scheduleDto) {
        return null;
    }

    @Override
    public ScheduleDto findById(Long id) {
        return null;
    }

    @Override
    public void save(Schedule schedule) {

    }
}

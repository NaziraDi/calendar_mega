package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.mapper.EmployeeMapper;
import kg.megacom.calendar.mapper.ScheduleMapper;
import kg.megacom.calendar.model.dto.EmployeeDto;
import kg.megacom.calendar.model.dto.ScheduleDto;
import kg.megacom.calendar.model.entity.Employee;
import kg.megacom.calendar.model.entity.Schedule;
import kg.megacom.calendar.model.request.CreateScheduleRequest;
import kg.megacom.calendar.repository.ScheduleRepository;
import kg.megacom.calendar.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;

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
        Schedule schedule = scheduleRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Schedule with id" + id + "is not found"));
        return ScheduleMapper.INSTANCE.toDto(schedule);
    }

    @Override
    public ScheduleDto save(ScheduleDto scheduleDto) {
        ScheduleDto scheduleDto1 = ScheduleMapper.INSTANCE.toDto(scheduleRepository.save(
                ScheduleMapper.INSTANCE.toEntity(scheduleDto)));

        return scheduleDto1;
    }


}

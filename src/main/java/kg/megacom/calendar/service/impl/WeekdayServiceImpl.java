package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.mapper.EmployeeMapper;
import kg.megacom.calendar.mapper.WeekdayMapper;
import kg.megacom.calendar.model.dto.EmployeeDto;
import kg.megacom.calendar.model.dto.WeekdayDto;
import kg.megacom.calendar.model.entity.Employee;
import kg.megacom.calendar.model.entity.Weekday;
import kg.megacom.calendar.model.request.CreateWeekdayRequest;
import kg.megacom.calendar.repository.WeekdayRepository;
import kg.megacom.calendar.service.WeekdayService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeekdayServiceImpl implements WeekdayService {

    private final WeekdayRepository weekdayRepository;

    @Override
    public WeekdayDto create(CreateWeekdayRequest request) {
        return null;
    }

    @Override
    public WeekdayDto findById(Long id) {
        Weekday weekday = weekdayRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Weekday with id" + id + "is not found"));
        return WeekdayMapper.INSTANCE.toDto(weekday);
    }

    @Override
    public WeekdayDto save(WeekdayDto weekdayDto) {
        WeekdayDto weekdayDto1 = WeekdayMapper.INSTANCE.toDto(weekdayRepository.save(
                WeekdayMapper.INSTANCE.toEntity(weekdayDto)
        ));

        return weekdayDto1;
    }

}

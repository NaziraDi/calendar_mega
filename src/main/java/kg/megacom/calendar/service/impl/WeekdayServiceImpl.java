package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.model.dto.WeekdayDto;
import kg.megacom.calendar.model.entity.Weekday;
import kg.megacom.calendar.model.request.CreateWeekdayRequest;
import kg.megacom.calendar.service.WeekdayService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeekdayServiceImpl implements WeekdayService {
    @Override
    public WeekdayDto create(CreateWeekdayRequest request) {
        return null;
    }

    @Override
    public WeekdayDto update(WeekdayDto weekdayDto) {
        return null;
    }

    @Override
    public WeekdayDto findById(Long id) {
        return null;
    }

    @Override
    public void save(Weekday weekday) {

    }
}

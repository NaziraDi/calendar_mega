package kg.megacom.calendar.mapper;

import kg.megacom.calendar.model.dto.WeekdayDto;
import kg.megacom.calendar.model.entity.Weekday;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WeekdayMapper extends BaseMapper<Weekday, WeekdayDto> {

    WeekdayMapper INSTANCE = Mappers.getMapper(WeekdayMapper.class);
}

package kg.megacom.calendar.mapper;

import kg.megacom.calendar.model.dto.ScheduleDto;
import kg.megacom.calendar.model.entity.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ScheduleMapper extends BaseMapper<Schedule, ScheduleDto> {

    ScheduleMapper INSTANCE = Mappers.getMapper(ScheduleMapper.class);
}

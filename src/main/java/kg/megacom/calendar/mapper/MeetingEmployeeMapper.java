package kg.megacom.calendar.mapper;

import kg.megacom.calendar.model.dto.MeetingEmployeeDto;
import kg.megacom.calendar.model.entity.MeetingEmployee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MeetingEmployeeMapper extends BaseMapper<MeetingEmployee, MeetingEmployeeDto>{

    MeetingEmployeeMapper INSTANCE = Mappers.getMapper(MeetingEmployeeMapper.class);
}

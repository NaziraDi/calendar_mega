package kg.megacom.calendar.mapper;

import kg.megacom.calendar.model.dto.MeetingDto;
import kg.megacom.calendar.model.entity.Meeting;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MeetingMapper extends BaseMapper<Meeting, MeetingDto>{

    MeetingMapper INSTANCE = Mappers.getMapper(MeetingMapper.class);
}

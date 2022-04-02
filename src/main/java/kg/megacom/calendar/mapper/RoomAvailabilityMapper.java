package kg.megacom.calendar.mapper;

import kg.megacom.calendar.model.dto.RoomAvailabilityDto;
import kg.megacom.calendar.model.entity.RoomAvailability;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomAvailabilityMapper extends BaseMapper<RoomAvailability, RoomAvailabilityDto>{

    RoomAvailabilityMapper INSTANCE = Mappers.getMapper(RoomAvailabilityMapper.class);
}

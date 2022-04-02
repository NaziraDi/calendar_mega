package kg.megacom.calendar.mapper;

import kg.megacom.calendar.model.dto.RoomDto;
import kg.megacom.calendar.model.entity.Room;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomMapper extends BaseMapper<Room, RoomDto> {

    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);
}

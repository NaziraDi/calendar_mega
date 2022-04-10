package kg.megacom.calendar.service;

import kg.megacom.calendar.model.dto.RoomDto;
import kg.megacom.calendar.model.entity.Room;
import kg.megacom.calendar.model.request.CreateRoomRequest;
import org.springframework.stereotype.Service;

@Service
public interface RoomService {

    RoomDto create(CreateRoomRequest request);
    RoomDto update(RoomDto roomDto);
    RoomDto findById(Long id);
    RoomDto save(RoomDto roomDto);
}

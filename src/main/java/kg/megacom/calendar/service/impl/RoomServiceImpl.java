package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.model.dto.RoomDto;
import kg.megacom.calendar.model.entity.Room;
import kg.megacom.calendar.model.request.CreateRoomRequest;
import kg.megacom.calendar.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {
    @Override
    public RoomDto create(CreateRoomRequest request) {
        return null;
    }

    @Override
    public RoomDto update(RoomDto roomDto) {
        return null;
    }

    @Override
    public RoomDto findById(Long id) {
        return null;
    }

    @Override
    public void save(Room room) {

    }
}

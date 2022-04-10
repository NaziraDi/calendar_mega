package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.mapper.EmployeeMapper;
import kg.megacom.calendar.mapper.RoomMapper;
import kg.megacom.calendar.model.dto.EmployeeDto;
import kg.megacom.calendar.model.dto.RoomDto;
import kg.megacom.calendar.model.entity.Employee;
import kg.megacom.calendar.model.entity.Room;
import kg.megacom.calendar.model.request.CreateRoomRequest;
import kg.megacom.calendar.repository.RoomRepository;
import kg.megacom.calendar.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

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

        Room room = roomRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Room with id" + id + "is not found"));
        return RoomMapper.INSTANCE.toDto(room);
    }

    @Override
    public RoomDto save(RoomDto roomDto) {

        RoomDto roomDto1 = RoomMapper.INSTANCE.toDto(roomRepository.save(
                RoomMapper.INSTANCE.toEntity(roomDto)
        ));

        return roomDto1;
    }

}

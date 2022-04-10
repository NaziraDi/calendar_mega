package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.mapper.EmployeeMapper;
import kg.megacom.calendar.mapper.RoomAvailabilityMapper;
import kg.megacom.calendar.model.dto.EmployeeDto;
import kg.megacom.calendar.model.dto.RoomAvailabilityDto;
import kg.megacom.calendar.model.entity.Employee;
import kg.megacom.calendar.model.entity.RoomAvailability;
import kg.megacom.calendar.model.request.CreateRoomAvailabilityRequest;
import kg.megacom.calendar.repository.RoomAvailabilityRepository;
import kg.megacom.calendar.service.RoomAvailabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomAvailabilityServiceImpl implements RoomAvailabilityService {

    private final RoomAvailabilityRepository roomAvailabilityRepository;

    @Override
    public RoomAvailabilityDto create(CreateRoomAvailabilityRequest request) {
        return null;
    }

    @Override
    public RoomAvailabilityDto update(RoomAvailabilityDto roomAvailabilityDto) {
        return null;
    }

    @Override
    public RoomAvailabilityDto findById(Long id) {

        RoomAvailability roomAvailability = roomAvailabilityRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("RoomAvailability with id" + id + "is not found"));
        return RoomAvailabilityMapper.INSTANCE.toDto(roomAvailability);
    }

    @Override
    public RoomAvailabilityDto save(RoomAvailabilityDto roomAvailabilityDto) {

        RoomAvailabilityDto roomAvailabilityDto1 = RoomAvailabilityMapper.INSTANCE.toDto(roomAvailabilityRepository.save(
                RoomAvailabilityMapper.INSTANCE.toEntity(roomAvailabilityDto)));
        return roomAvailabilityDto1;
    }

}

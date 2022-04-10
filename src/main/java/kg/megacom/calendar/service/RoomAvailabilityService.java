package kg.megacom.calendar.service;

import kg.megacom.calendar.model.dto.RoomAvailabilityDto;
import kg.megacom.calendar.model.entity.RoomAvailability;
import kg.megacom.calendar.model.request.CreateRoomAvailabilityRequest;
import org.springframework.stereotype.Service;

@Service
public interface RoomAvailabilityService {
    RoomAvailabilityDto create(CreateRoomAvailabilityRequest request);
    RoomAvailabilityDto update(RoomAvailabilityDto roomAvailabilityDto);
    RoomAvailabilityDto findById(Long id);
    RoomAvailabilityDto save(RoomAvailabilityDto roomAvailabilityDto);
}

package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.model.dto.RoomAvailabilityDto;
import kg.megacom.calendar.model.entity.RoomAvailability;
import kg.megacom.calendar.model.request.CreateRoomAvailabilityRequest;
import kg.megacom.calendar.service.RoomAvailabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomAvailabilityServiceImpl implements RoomAvailabilityService {
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
        return null;
    }

    @Override
    public void save(RoomAvailability roomAvailability) {

    }
}

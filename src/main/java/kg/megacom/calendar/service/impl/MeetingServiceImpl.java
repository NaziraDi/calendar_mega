package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.model.dto.MeetingDto;
import kg.megacom.calendar.model.entity.Meeting;
import kg.megacom.calendar.model.request.CreateMeetingRequest;
import kg.megacom.calendar.service.MeetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MeetingServiceImpl implements MeetingService {
    @Override
    public MeetingDto create(CreateMeetingRequest request) {
        return null;
    }

    @Override
    public MeetingDto update(MeetingDto meetingDto) {
        return null;
    }

    @Override
    public MeetingDto findById(Long id) {
        return null;
    }

    @Override
    public MeetingDto delete(Long id) {
        return null;
    }

    @Override
    public void save(Meeting meeting) {

    }
}

package kg.megacom.calendar.service;

import kg.megacom.calendar.model.dto.MeetingDto;
import kg.megacom.calendar.model.entity.Meeting;
import kg.megacom.calendar.model.request.CreateMeetingRequest;
import org.springframework.stereotype.Service;

@Service
public interface MeetingService {

    MeetingDto create(CreateMeetingRequest request);
    MeetingDto update(MeetingDto meetingDto);
    MeetingDto findById(Long id);
    MeetingDto save(MeetingDto meetingDto);
}

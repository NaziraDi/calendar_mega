package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.mapper.EmployeeMapper;
import kg.megacom.calendar.mapper.MeetingMapper;
import kg.megacom.calendar.model.dto.EmployeeDto;
import kg.megacom.calendar.model.dto.MeetingDto;
import kg.megacom.calendar.model.entity.Employee;
import kg.megacom.calendar.model.entity.Meeting;
import kg.megacom.calendar.model.request.CreateMeetingRequest;
import kg.megacom.calendar.repository.MeetingRepository;
import kg.megacom.calendar.service.MeetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MeetingServiceImpl implements MeetingService {

    private final MeetingRepository meetingRepository;

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
        Meeting meeting = meetingRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Meeting with id" + id + "is not found"));
        return MeetingMapper.INSTANCE.toDto(meeting);
    }

    @Override
    public MeetingDto save(MeetingDto meetingDto) {

        MeetingDto meetingDto1 = MeetingMapper.INSTANCE.toDto(meetingRepository.save(
                MeetingMapper.INSTANCE.toEntity(meetingDto)
        ));

        return meetingDto1;
    }

}

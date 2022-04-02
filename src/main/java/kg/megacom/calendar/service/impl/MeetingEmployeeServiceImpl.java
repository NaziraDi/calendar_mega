package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.model.dto.MeetingEmployeeDto;
import kg.megacom.calendar.model.entity.MeetingEmployee;
import kg.megacom.calendar.model.request.CreateMeetingEmployeeRequest;
import kg.megacom.calendar.service.MeetingEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MeetingEmployeeServiceImpl implements MeetingEmployeeService {
    @Override
    public MeetingEmployeeDto create(CreateMeetingEmployeeRequest request) {
        return null;
    }

    @Override
    public MeetingEmployeeDto update(MeetingEmployeeDto meetingDto) {
        return null;
    }

    @Override
    public MeetingEmployeeDto findById(Long id) {
        return null;
    }

    @Override
    public MeetingEmployeeDto delete(Long id) {
        return null;
    }

    @Override
    public void save(MeetingEmployee meetingEmployee) {

    }
}

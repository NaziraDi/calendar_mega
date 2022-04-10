package kg.megacom.calendar.service;


import kg.megacom.calendar.model.dto.MeetingEmployeeDto;
import kg.megacom.calendar.model.entity.MeetingEmployee;
import kg.megacom.calendar.model.request.CreateMeetingEmployeeRequest;
import org.springframework.stereotype.Service;

@Service
public interface MeetingEmployeeService {

    MeetingEmployeeDto create(CreateMeetingEmployeeRequest request);
    MeetingEmployeeDto update(MeetingEmployeeDto meetingDto);
    MeetingEmployeeDto findById(Long id);
    MeetingEmployeeDto save(MeetingEmployeeDto meetingEmployeeDto);
}

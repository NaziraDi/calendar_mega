package kg.megacom.calendar.service.impl;

import kg.megacom.calendar.mapper.EmployeeMapper;
import kg.megacom.calendar.mapper.MeetingEmployeeMapper;
import kg.megacom.calendar.model.dto.EmployeeDto;
import kg.megacom.calendar.model.dto.MeetingEmployeeDto;
import kg.megacom.calendar.model.entity.Employee;
import kg.megacom.calendar.model.entity.Meeting;
import kg.megacom.calendar.model.entity.MeetingEmployee;
import kg.megacom.calendar.model.request.CreateMeetingEmployeeRequest;
import kg.megacom.calendar.repository.MeetingEmployeeRepository;
import kg.megacom.calendar.service.MeetingEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MeetingEmployeeServiceImpl implements MeetingEmployeeService {

    private final MeetingEmployeeRepository meetingEmployeeRepository;

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
        MeetingEmployee meetingEmployee = meetingEmployeeRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("MeetingEmployee with id" + id + "is not found"));
        return MeetingEmployeeMapper.INSTANCE.toDto(meetingEmployee);
    }

    @Override
    public MeetingEmployeeDto save(MeetingEmployeeDto meetingEmployeeDto) {

        MeetingEmployeeDto meetingEmployeeDto1 = MeetingEmployeeMapper.INSTANCE.toDto(meetingEmployeeRepository.save(
                MeetingEmployeeMapper.INSTANCE.toEntity(meetingEmployeeDto)
        ));

        return meetingEmployeeDto1;
    }

}

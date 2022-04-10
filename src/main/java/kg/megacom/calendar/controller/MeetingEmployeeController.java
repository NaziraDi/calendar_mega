package kg.megacom.calendar.controller;

import kg.megacom.calendar.model.dto.MeetingEmployeeDto;
import kg.megacom.calendar.service.MeetingEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/meeting-employee")
public class MeetingEmployeeController {

    private final MeetingEmployeeService meetingEmployeeService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> find(@PathVariable Long id) {
        try {
            return ResponseEntity.ok().body(meetingEmployeeService.findById(id));
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
        }
    }

    @PutMapping("/save")
    public ResponseEntity<?> save(@RequestBody MeetingEmployeeDto meetingEmployeeDto) {
        try {
            return ResponseEntity.ok().body(meetingEmployeeService.save(meetingEmployeeDto));
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
        }
    }
}

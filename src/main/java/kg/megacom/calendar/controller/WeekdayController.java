package kg.megacom.calendar.controller;

import kg.megacom.calendar.model.dto.EmployeeDto;
import kg.megacom.calendar.model.dto.WeekdayDto;
import kg.megacom.calendar.service.WeekdayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/weekday")
public class WeekdayController {

    private final WeekdayService weekdayService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> find(@PathVariable Long id) {
        try {
            return ResponseEntity.ok().body(weekdayService.findById(id));
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
        }
    }

    @PutMapping("/save")
    public ResponseEntity<?> save(@RequestBody WeekdayDto weekdayDto) {
        try {
            return ResponseEntity.ok().body(weekdayService.save(weekdayDto));
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
        }
    }
}

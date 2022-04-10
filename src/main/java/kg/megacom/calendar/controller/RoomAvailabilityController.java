package kg.megacom.calendar.controller;

import kg.megacom.calendar.model.dto.RoomAvailabilityDto;
import kg.megacom.calendar.service.RoomAvailabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/room-availability")
public class RoomAvailabilityController {

    private final RoomAvailabilityService roomAvailabilityService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> find(@PathVariable Long id) {
        try {
            return ResponseEntity.ok().body(roomAvailabilityService.findById(id));
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
        }
    }

    @PutMapping("/save")
    public ResponseEntity<?> save(@RequestBody RoomAvailabilityDto roomAvailabilityDto) {
        try {
            return ResponseEntity.ok().body(roomAvailabilityService.save(roomAvailabilityDto));
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
        }
    }
}

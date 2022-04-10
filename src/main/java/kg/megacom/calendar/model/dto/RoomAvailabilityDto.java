package kg.megacom.calendar.model.dto;

import kg.megacom.calendar.model.entity.Room;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomAvailabilityDto {

    Long id;
    LocalDate roomDate;
    LocalTime availableFrom;
    LocalTime availableTo;
    RoomDto room;
}

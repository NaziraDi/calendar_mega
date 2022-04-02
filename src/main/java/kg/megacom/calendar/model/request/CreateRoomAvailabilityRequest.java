package kg.megacom.calendar.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateRoomAvailabilityRequest {

    LocalDate roomDate;
    LocalTime availableFrom;
    LocalTime availableTo;
    Long roomId;
}

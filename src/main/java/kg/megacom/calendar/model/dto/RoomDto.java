package kg.megacom.calendar.model.dto;

import kg.megacom.calendar.model.entity.Room;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomDto {

    String roomNumber;
    Integer roomCapacity;
    RoomDto room;
}

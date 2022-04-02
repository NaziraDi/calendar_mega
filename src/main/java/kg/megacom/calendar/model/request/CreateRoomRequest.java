package kg.megacom.calendar.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateRoomRequest {

    String roomNumber;
    Integer roomCapacity;
    Long roomId;
}

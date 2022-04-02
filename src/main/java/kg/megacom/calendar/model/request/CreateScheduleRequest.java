package kg.megacom.calendar.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateScheduleRequest {

    Long organizationEmployeeId;
    Long weekdayId;
    LocalTime startTime;
    LocalTime endTime;
}

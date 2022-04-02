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
public class CreateMeetingRequest {
    String meetingTopic;
    String description;
    LocalDate meetingDate;
    LocalTime meetingStartTime;
    LocalTime meetingEndTime;
    LocalTime addDate;
}

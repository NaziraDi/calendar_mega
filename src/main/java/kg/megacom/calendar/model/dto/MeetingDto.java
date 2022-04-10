package kg.megacom.calendar.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MeetingDto {

    Long id;
    String meetingTopic;
    String description;
    LocalDate meetingDate;
    LocalTime meetingStartTime;
    LocalTime meetingEndTime;
    LocalDate addDate;

}

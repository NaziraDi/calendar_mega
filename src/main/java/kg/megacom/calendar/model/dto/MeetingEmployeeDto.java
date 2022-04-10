package kg.megacom.calendar.model.dto;

import kg.megacom.calendar.model.enums.MemberType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MeetingEmployeeDto {

    Long id;
    MeetingDto meeting;
    EmployeeDto employee;
    String meetingStatus;
    String memberType;
}

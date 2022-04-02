package kg.megacom.calendar.model.dto;

import kg.megacom.calendar.model.entity.MemberType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MeetingEmployeeDto {

    MeetingDto meeting;
    EmployeeDto employee;
    String status;
    MemberType memberType;
}

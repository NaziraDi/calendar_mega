package kg.megacom.calendar.model.request;


import kg.megacom.calendar.model.enums.MemberType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateMeetingEmployeeRequest {

    Long meetingId;
    Long employeeId;
    String meetingStatus;
    String memberType;
}

package kg.megacom.calendar.model.request;


import kg.megacom.calendar.model.entity.MemberType;
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
    String status;
    MemberType memberType;
}

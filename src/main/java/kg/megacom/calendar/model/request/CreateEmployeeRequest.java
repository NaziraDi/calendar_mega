package kg.megacom.calendar.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateEmployeeRequest {

    String lastName;
    String firstName;
    String email;
    String msisdn;
    String employeeStatus;
    Long accountId;
    Boolean isActive;
}

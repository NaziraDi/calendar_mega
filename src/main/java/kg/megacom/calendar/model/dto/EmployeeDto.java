package kg.megacom.calendar.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class    EmployeeDto {

    Long id;
    String lastName;
    String firstName;
    String email;
    String msisdn;
    String status;
    String employeeStatus;
    AccountDto account;
    Boolean isActive;
}

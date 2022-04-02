package kg.megacom.calendar.model.dto;

import kg.megacom.calendar.model.entity.Accounts;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDto {
    String lastName;
    String firstName;
    String email;
    String msisdn;
    String status;
    AccountsDto accounts;
    Boolean isActive;
}

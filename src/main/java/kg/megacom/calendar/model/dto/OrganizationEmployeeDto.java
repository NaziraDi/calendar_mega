package kg.megacom.calendar.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationEmployeeDto {

    OrganizationDto organization;
    EmployeeDto employee;
}

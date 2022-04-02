package kg.megacom.calendar.model.dto;

import kg.megacom.calendar.model.entity.Organization;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationDto {

    String title;
    OrganizationDto organization;
}

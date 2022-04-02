package kg.megacom.calendar.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ScheduleDto {

    OrganizationEmployeeDto organizationEmployee;
    WeekdayDto weekday;
    LocalTime startTime;
    LocalTime endTime;
}

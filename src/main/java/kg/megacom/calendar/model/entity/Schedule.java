package kg.megacom.calendar.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.persistence.Entity;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_schedule")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Schedule extends AbstractPersistable<Long> {

    @OneToOne
    @JoinColumn(name = "organization_employee_id", nullable = false)
    OrganizationEmployee organizationEmployee;

    @ManyToOne
    @JoinColumn(name = "weekday_id", nullable = false)
    Weekday weekday;

    @Column(name = "start_time", nullable = false)
    LocalTime startTime;

    @Column(name = "end_time", nullable = false)
    LocalTime endTime;
}

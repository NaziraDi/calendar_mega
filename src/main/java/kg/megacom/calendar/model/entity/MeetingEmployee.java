package kg.megacom.calendar.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "room")
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class MeetingEmployee extends AbstractPersistable {

    @ManyToOne
    @JoinColumn(name = "meeting_id", referencedColumnName = "id")
    Meeting meeting;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    Employee employee;

    @Column(name = "status", nullable = false)
    String status;

    @Transient
    MemberType memberType;
}

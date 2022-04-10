package kg.megacom.calendar.model.entity;

import kg.megacom.calendar.model.enums.MeetingStatus;
import kg.megacom.calendar.model.enums.MemberType;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_meeting_employee")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MeetingEmployee extends AbstractPersistable<Long> {

    @ManyToOne
    @JoinColumn(name = "meeting_id", referencedColumnName = "id")
    Meeting meeting;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    Employee employee;

    @Column(name = "meeting_status", nullable = false)
    MeetingStatus meetingStatus;

    @Transient
    MemberType memberType;
}

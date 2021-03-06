package kg.megacom.calendar.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalTime;


@Getter
@Setter
@Entity
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_meeting")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Meeting extends AbstractPersistable<Long> {

    @Column(name = "meeting_topic", nullable = false)
    String meetingTopic;

    @Column(name = "description", nullable = true)
    String description;

    @Column(name = "meeting_date", nullable = false)
    LocalDate meetingDate;

    @Column(name = "meeting_start_time", nullable = false)
    LocalTime meetingStartTime;

    @Column(name = "meeting_end_time", nullable = false)
    LocalTime meetingEndTime;

    @Column(name = "add_date", nullable = false)
    LocalDate addDate;

}

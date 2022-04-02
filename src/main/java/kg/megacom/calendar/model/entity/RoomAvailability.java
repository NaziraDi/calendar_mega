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
public class RoomAvailability extends AbstractPersistable{

    @Column(name = "room_date", nullable = false)
    LocalDate roomDate;

    @Column(name = "available_from", nullable = false)
    LocalTime availableFrom;

    @Column(name = "available_to", nullable = false)
    LocalTime availableTo;

    @ManyToOne
    @JoinColumn(name = "room_id", referencedColumnName = "id")
    Room room;
}

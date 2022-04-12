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
@Table(name = "tb_room_availability")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomAvailability extends AbstractPersistable<Long>{

    @Column(name = "room_date", nullable = false)
    LocalDate roomDate;

    @Column(name = "available_from", nullable = false)
    LocalTime availableFrom;

    @Column(name = "available_to", nullable = false)
    LocalTime availableTo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id", referencedColumnName = "id")
    Room room;
}

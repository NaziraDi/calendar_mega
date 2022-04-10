package kg.megacom.calendar.model.entity;

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
@Table(name = "room")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Room extends AbstractPersistable<Long> {

    @Column(name = "room_number", nullable = false)
    String roomNumber;

    @Column(name = "room_capacity", nullable = true)
    Integer roomCapacity;

    @OneToOne
    @JoinColumn(name = "room_id", nullable = true)
    Room room;



}

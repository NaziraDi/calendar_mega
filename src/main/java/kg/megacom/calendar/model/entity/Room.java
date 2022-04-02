package kg.megacom.calendar.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.persistence.Entity;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "room")
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class Room extends AbstractPersistable {

    @Column(name = "room_number", nullable = false)
    String roomNumber;

    @Column(name = "room_capacity", nullable = true)
    Integer roomCapacity;

    @OneToOne
    @JoinColumn(name = "room_id", nullable = true)
    Room room;



}

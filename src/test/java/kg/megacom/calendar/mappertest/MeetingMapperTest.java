package kg.megacom.calendar.mappertest;

import kg.megacom.calendar.mapper.MeetingMapper;
import kg.megacom.calendar.model.dto.MeetingDto;
import kg.megacom.calendar.model.entity.Meeting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class MeetingMapperTest {


    @Test
    public void testMeetingMapper() {

        MeetingDto meetingDto = new MeetingDto();
        meetingDto.setId(1L);
        meetingDto.setMeetingTopic("lecture");
        meetingDto.setMeetingDate(LocalDate.of(2022,04,22));
        meetingDto.setMeetingStartTime(LocalTime.of(9,30));
        meetingDto.setMeetingEndTime(LocalTime.of(11, 00));
        meetingDto.setAddDate(LocalDate.of(2022, 04,07));
        meetingDto.setDescription("important");

        Meeting meeting = MeetingMapper.INSTANCE.toEntity(meetingDto);
        MeetingDto result = MeetingMapper.INSTANCE.toDto(meeting);

        assertEquals(meeting.getId(), result.getId());
        assertEquals(meeting.getMeetingTopic(), result.getMeetingTopic());
        assertEquals(meeting.getMeetingDate(), result.getMeetingDate());
        assertEquals(meeting.getMeetingStartTime(), result.getMeetingStartTime());
        assertEquals(meeting.getMeetingEndTime(), result.getMeetingEndTime());
        assertEquals(meeting.getAddDate(), result.getAddDate());
        assertEquals(meeting.getDescription(), result.getDescription());
    }
}

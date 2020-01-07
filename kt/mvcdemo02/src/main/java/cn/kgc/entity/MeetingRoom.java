package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeetingRoom {

    private Integer id;
    private String meetingName;
    private Date meetingOrder;
    private String advanceName;
}

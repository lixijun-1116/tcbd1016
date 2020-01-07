package cn.kgc.controller;

import cn.kgc.entity.MeetingRoom;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;


@Controller
@RequestMapping("meetingRoom")
public class MeetingRoomController {
    @RequestMapping(value = "toAdd")
    public String toAdd(Model model){
        //List<String> list1 = new ArrayList<>();
        String a = "一号会议室";
        String b = "二号会议室";
        String c = "三号会议室";
        Map<String,Object> map = new HashMap<>();
        map.put("a",a);
        map.put("b",b);
        map.put("c",c);
        model.addAttribute("map",map);
        return "add";
    }

    @ResponseBody
    @RequestMapping(value = "addSuccess",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public String addSuccess(){
       // meetingRoom.setId(15);
       // System.out.println(meetingRoom);
        Map<String,Object> map = new HashMap<>();
        map.put("msg","预定成功");
        String json = JSON.toJSONString(map);
        System.out.println("json" + json);
        return json;
    }


    @RequestMapping(value = "queryAll" )
    public String  queryAll(Model model){
        List<MeetingRoom> list = new ArrayList<>();
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = format.parse("2012-12-26");
            Date date2 = format.parse("2012-11-22");
            Date date3 = format.parse("2012-10-18");
            Date date4 = format.parse("2012-10-16");
            Date date5 = format.parse("2012-9-27");

            MeetingRoom m1 = new MeetingRoom(1,"一号会议室",date1,"李兰兰");
            MeetingRoom m2 = new MeetingRoom(2,"二号会议室",date2,"刘晓莉");
            MeetingRoom m3 = new MeetingRoom(3,"三号会议室",date3,"王峰");
            MeetingRoom m4 = new MeetingRoom(4,"一号会议室",date4,"李兰兰");
            MeetingRoom m5 = new MeetingRoom(5,"二号会议室",date5,"文章");

            list.add(m1);
            list.add(m2);
            list.add(m3);
            list.add(m4);
            list.add(m5);
            model.addAttribute("list",list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "query_list";
    }
}

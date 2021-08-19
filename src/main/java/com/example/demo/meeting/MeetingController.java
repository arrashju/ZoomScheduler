package com.example.demo.meeting;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeetingController {

    @Autowired
    MeetingService meetingService;

    @PostMapping("/api/meetings/create")
    public void createMeeting(@RequestBody Meeting newMeeting) throws Exception {
        JSONObject body = new JSONObject();

        body.put("topic", newMeeting.getTopic());
        body.put("start_time", newMeeting.getStart_time());
        body.put("duration", 22);
        body.put("timezone", newMeeting.getTimezone());
        body.put("password", newMeeting.getPassword());
        body.put("agenda", newMeeting.getAgenda());

        System.out.println(body);

        MeetingService.sendRequest(body);
    }
}
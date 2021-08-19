package com.example.demo.meeting;

import java.time.LocalDateTime;

public class Meeting {

    private String topic;
    private Integer type;
    private LocalDateTime start_time;
    private Integer duration;
    private String timezone;
    private String password;
    private String agenda;

    public Meeting (String topic,
                    Integer type,
                    LocalDateTime start_time,
                    Integer duration,
                    String timezone,
                    String password,
                    String agenda) {
        super();
        this.topic = topic;
        this.type = type;
        this.start_time = start_time;
        this.duration = duration;
        this.timezone = timezone;
        this.password = password;
        this.agenda = agenda;
    }

    public String getTopic() {
        return topic;
    }

    public Integer getType() {
        return type;
    }

    public LocalDateTime getStart_time() {
        return start_time;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getPassword() {
        return password;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setStart_time(LocalDateTime start_time) {
        this.start_time = start_time;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }
}
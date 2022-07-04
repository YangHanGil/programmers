package com.codility.tasks.spring.healthcheck;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import java.util.TimeZone;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.time.ZonedDateTime;

@RestController
class HealthcheckController {

    @GetMapping(value = "/healthcheck")
    public classDto healthcheck(@RequestParam("format") String format) {

        ClassDto classDto = new ClassDto();
        if(format == "short"){
            classDto.setStatus("OK");
        } else if (format == "full"){
            TimeZone timezone = TimeZone.getTimeZone("UTC");
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
            dateFormat.setTimeZone(timezone);
            String iso8601 = dateFormat.format(new Date());
            classDto.setCurrentTime(iso8601);
            classDto.setStatus("OK"); 
        } else {
            classDto.setStatus("400");
        }

        return iso8601;
    }

    @PutMapping(value = "/healthcheck")
    public classDto healthcheckPut() {
        classDto.setStatus("405");
        return classDto;
    }

    @PostMapping(value = "/healthcheck")
    public classDto healthcheckPost() {
        classDto.setStatus("405");
        return classDto;
    }


    @DeleteMapping(value = "/healthcheck")
    public classDto healthcheckDelete() {
        classDto.setStatus("405");
        return classDto;
    }

}

public class ClassDto{
    private String status;
    private String currentTime;

    public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

    public String getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
}
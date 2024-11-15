package com.mysite.sbb;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.TimeZone;

@SpringBootApplication
public class SbbApplication {

    // 서버 시간과 관련없이 한국 시간으로 맞추기 위한 설정
    @PostConstruct
    public void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.println("현재시각 : " + new Date());
    }

    public static void main(String[] args) {
        SpringApplication.run(SbbApplication.class, args);
    }

}

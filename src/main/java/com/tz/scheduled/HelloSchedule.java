package com.tz.scheduled;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Rod Johnson
 * @create 2022-09-28 0:20
 */
@Slf4j
@Component
@EnableAsync
@EnableScheduling
public class HelloSchedule {


    @Async
    @Scheduled(cron = "* * * ? * 3 ")
    public void hello() throws InterruptedException {
        log.info("hello...");
        Thread.sleep(3000);
    }

}

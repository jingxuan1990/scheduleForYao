package com.jingxuan.is.yao.schedule;

import com.jingxuan.is.yao.compontent.SmsUtil;
import com.jingxuan.is.yao.config.ReminderConfig;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 定时任务.
 * Created by andy on 2017/9/17.
 */
@Component
@Log4j
public class RemindTask {

    @Autowired
    private SmsUtil smsUtil;
    @Autowired
    private ReminderConfig reminderConfig;

    @Scheduled(cron = "0 0/30 9,21 * * *")
    public void doIt() {
        int count = 0;
        boolean sendBool = smsUtil.sendSms(reminderConfig.getTelPhone());
        while (!sendBool && count < 3) {
            log.warn("重试发送sms中... count=" + count);

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                // ignore
            }

            sendBool = smsUtil.sendSms(reminderConfig.getTelPhone());
            count++;
        }
    }
}

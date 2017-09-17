package com.jingxuan.is.yao.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 提醒信息配置.
 * Created by andy on 2017/9/17.
 */
@Data
@ConfigurationProperties(prefix = "reminder")
@Configuration
public class ReminderConfig {
    private String username;
    private String password;
    private String telPhone;
}

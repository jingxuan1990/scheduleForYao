package com.jingxuan.is.yao.init;

import com.jingxuan.is.yao.ChiYaoApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * war包的启动.
 * Created by andy on 2017/9/17.
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ChiYaoApplication.class);
    }
}

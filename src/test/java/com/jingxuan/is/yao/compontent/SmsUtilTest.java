package com.jingxuan.is.yao.compontent;

import com.jingxuan.is.yao.AbstractJUnit4Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by andy on 2017/9/17.
 */
public class SmsUtilTest extends AbstractJUnit4Test {

    @Autowired
    private SmsUtil smsUtil;

    @Test
    public void send() throws Exception {
        smsUtil.sendSms("17767264190");
    }

}
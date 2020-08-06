package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Ning Baoqi
 * @date 2019/11/14 15:27
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/sms/")
public class SendController {
    @Autowired
    private RestTemplate restTemplateForHttps;

    @PostMapping("sendSms11")
    public Object sendSms(){
        DmsHistoryResult dmsHistoryResult=new DmsHistoryResult();
        dmsHistoryResult.setResult("0");
        dmsHistoryResult.setSubmitSequenceNumber("F0rgh2SHnOHGMmCyQ1573181707075");
        Object a=restTemplateForHttps.postForEntity("https://active.10010.com/dms/record",dmsHistoryResult,Object.class);
        return a;
    }
}

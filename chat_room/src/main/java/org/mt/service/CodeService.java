package org.mt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanghaiguang on 2022/5/13 上午10:11
 */
@Component
public class CodeService {
    public String test01() throws IOException {
//        StringWriter writer = new StringWriter();
//        Configuration cfg = new Configuration();
//        ClassPathResource resource = new ClassPathResource("templates/");
//        InputStream inputStream = resource.getInputStream();
//        File file = resource.getFile();
////        FileTemplateLoader loader = new FileTemplateLoader(new File("src/main/resources/templates"));
//        FileTemplateLoader loader = new FileTemplateLoader(file);
//        cfg.setTemplateLoader(loader);
//
//        Template template = cfg.getTemplate("demo01.ftl");
//        Map<String,Object> dataModel = new HashMap<String, Object>();
//        dataModel.put("username","kakakaka");
//
//        template.process(dataModel,writer);
//        return writer.toString();
        return null;
    }

}

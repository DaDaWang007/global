package org.mt.web.controller.test;

import org.mt.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by wanghaiguang on 2022/6/17 下午5:07
 */
@RequestMapping("/test")
@RestController
public class TestController {
    @Autowired
    CodeService codeService;

    @RequestMapping("/code")
    public String test1() {
        try {
            return codeService.test01();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}

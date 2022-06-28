package test.java.org.mt.freemarker;

import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanghaiguang on 2022/5/13 上午10:11
 */
public class demo01 {
    @Test
    public void test01() throws IOException, TemplateException {
        Configuration cfg = new Configuration();
        FileTemplateLoader loader = new FileTemplateLoader(new File("templates"));
        cfg.setTemplateLoader(loader);

        Template template = cfg.getTemplate("demo01.ftl");
        Map<String,Object> dataModel = new HashMap<String, Object>();
        dataModel.put("username","kakakaka");

        template.process(dataModel,new FileWriter(new File("/Users/wanghaiguang/IdeaProjects/codeUtils/sourceFile/a.txt")));
    }
}

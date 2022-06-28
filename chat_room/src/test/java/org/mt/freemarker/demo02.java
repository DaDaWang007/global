package test.java.org.mt.freemarker;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanghaiguang on 2022/5/16 下午7:22
 */
public class demo02 {
    @Test
    public void test() throws Exception {
        StringWriter writer = new StringWriter();

        Configuration cfg = new Configuration();

        cfg.setTemplateLoader(new StringTemplateLoader());

        String tem = "framework ${test}";

        Template template = new Template("name1", new StringReader(tem), cfg);

        Map<String,Object> map = new HashMap();

        map.put("test", "execute");

        template.process(map, writer);
        System.out.println(writer.toString());
//        System.out.println("======");
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        System.out.println(a.toString());
    }
}

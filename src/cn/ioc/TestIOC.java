package cn.ioc;
import cn.property.PropertyDemo1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sheng on 2018/4/9.
 */
public class TestIOC {
    @Test
    public void testUser(){
        //1加载spring配置文件，根据配置创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        //2得到配置创建的对象
        PropertyDemo1 user= (PropertyDemo1)context.getBean("PropertyDemo1");

        user.methodd();
    }
}

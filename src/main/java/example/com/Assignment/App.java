package example.com.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Drawing d = (Drawing) applicationContext.getBean("DrawingService");
        d.drawShape();

    }
}

package USTBatchNo3.di_setter_injection;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
    	Roles r=context.getBean("Role1",Roles.class);
    	r.display();
    	
    	Roles r1=context.getBean("name",Roles.class);
    	r1.display();
    }
}

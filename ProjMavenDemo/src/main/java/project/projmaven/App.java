package project.projmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory=new AnnotationConfigApplicationContext(Appconfig.class);
        
        Employee emp=(Employee) factory.getBean("employee");
        
        System.out.print(emp);
    }
}

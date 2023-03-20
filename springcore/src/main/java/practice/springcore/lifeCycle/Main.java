package practice.springcore.lifeCycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws Exception{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("practice/springcore/lifeCycle/config.xml");
		context.registerShutdownHook();
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1);
	}
}

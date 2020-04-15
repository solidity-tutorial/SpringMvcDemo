
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public Driver() {
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("webDemo.xml");
        Sim sim = (Sim)context.getBean("sim", Airtel.class);
        sim.calling();
    }
}

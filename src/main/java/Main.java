import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"model","controller","Service","Dto"})
@EntityScan(basePackages = {"Entity"})
public class Main {
    public static void main(String[] args) {
        try {
            SpringApplication.run(Main.class, args);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

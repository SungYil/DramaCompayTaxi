import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"model","controller","Service","Dto"})
@EntityScan(basePackages = {"Entity"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Main {
    public static void main(String[] args) {
        try {
            SpringApplication.run(Main.class, args);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

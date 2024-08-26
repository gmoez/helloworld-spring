package learn.springboot.helloworld;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
/**
 * Created by mac on 2016/12/29.
 */
@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    public String home() {
        return "<h1 style=\"text-align: center; background-color: green;\">Hello World from feat2</h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

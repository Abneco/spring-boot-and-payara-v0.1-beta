package x.x.demospring.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/messages")
@RestController
public class HomeRestController {

    @Value("${var1.name:valeurdefaut}")
    private String var1;

    @RequestMapping("/")
    public String home() {
        return "Hello " + var1;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "<strong>Hello, Welcome to Spring Boot!</strong>";
    }

}

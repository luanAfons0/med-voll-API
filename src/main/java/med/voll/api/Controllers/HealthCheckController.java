package med.voll.api.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/health-check")
public class HealthCheckController {

    @GetMapping
    public String getHealthCheck(){
        return "API is up and running!";
    }
}

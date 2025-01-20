package med.voll.api.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import med.voll.api.Records.Pacient.CreatePacientRecord;

@RestController
@RequestMapping("/pacient")
public class PacientController {

    @PostMapping
    public void createPacient(@RequestBody CreatePacientRecord body){
        System.out.println(body);
    }
}

package med.voll.api.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import med.voll.api.Records.Medic.CreateMedicRecord;

@RestController
@RequestMapping("/medic")
public class MedicController {

    @PostMapping
   public void createMedic(@RequestBody CreateMedicRecord newMedicInfos){
        System.out.println(newMedicInfos);
   }
}

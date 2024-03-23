package enset.ma.hopital.web;

import enset.ma.hopital.entities.Patient;
import enset.ma.hopital.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;
    @GetMapping("/index")
    public String index(Model model){
        List<Patient> patientList=patientRepository.findAll();
        model.addAttribute("listPatients",patientList);
        return "patients";
    }
}

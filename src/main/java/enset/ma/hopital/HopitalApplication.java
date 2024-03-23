package enset.ma.hopital;

import enset.ma.hopital.entities.Patient;
import enset.ma.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        patientRepository.save(new Patient(null, "Mohammed",new Date(),false,34) );
        patientRepository.save(new Patient(null,"Hanane",new Date(),false,34) );
        patientRepository.save(new Patient(null,"Lisa",new Date(),true,34) );

    }
}
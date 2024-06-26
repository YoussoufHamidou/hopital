package enset.ma.hopital;

import enset.ma.hopital.entities.Patient;
import enset.ma.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
        patientRepository.save(new Patient(null,"Hanane",new Date(),false,4271) );
        patientRepository.save(new Patient(null,"Lisa",new Date(),true,34) );
        patientRepository.save(new Patient(null, "Mohammed",new Date(),false,35) );
        patientRepository.save(new Patient(null,"Hanane",new Date(),false,4271) );
        patientRepository.save(new Patient(null,"Lisa",new Date(),true,35) );
        patientRepository.save(new Patient(null, "Mohammed",new Date(),false,36) );
        patientRepository.save(new Patient(null,"Hanane",new Date(),false,4272) );
        patientRepository.save(new Patient(null,"Lisa",new Date(),true,36) );
        patientRepository.save(new Patient(null, "Mohammed",new Date(),false,37) );
        patientRepository.save(new Patient(null,"Hanane",new Date(),false,4273) );
        patientRepository.save(new Patient(null,"Lisa",new Date(),true,37) );
        patientRepository.save(new Patient(null, "Mohammed",new Date(),false,38) );
        patientRepository.save(new Patient(null,"Hanane",new Date(),false,4271) );
        patientRepository.save(new Patient(null,"Lisa",new Date(),true,38) );
    }
}

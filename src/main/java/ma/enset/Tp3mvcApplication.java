package ma.enset;

import ma.enset.entities.Patient;
import ma.enset.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Tp3mvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp3mvcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {
            patientRepository.save(
                    new Patient(null,"Hassan",new Date(),false,12));
            patientRepository.save(
                    new Patient(null,"Mohammed",new Date(),true,321));
            patientRepository.save(
                    new Patient(null,"Karim",new Date(),false,65));
            patientRepository.save(
                    new Patient(null,"Karima",new Date(),false,15));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });

        };
    }

}

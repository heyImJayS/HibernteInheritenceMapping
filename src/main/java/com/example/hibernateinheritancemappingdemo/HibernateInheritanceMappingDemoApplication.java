package com.example.hibernateinheritancemappingdemo;

import com.example.hibernateinheritancemappingdemo.models.Mentor;
import com.example.hibernateinheritancemappingdemo.repository.MentorRepository;
import jakarta.persistence.Entity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HibernateInheritanceMappingDemoApplication implements CommandLineRunner {
    private MentorRepository mentorRepository;

    public HibernateInheritanceMappingDemoApplication(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Mentor mentor = new Mentor();
        mentor.setName("Salman");
        mentor.setEmail("sallu@school.com");
        mentor.setAvgRating(5.63f);
        mentorRepository.save(mentor);
    }

    public static void main(String[] args) {
        SpringApplication.run(HibernateInheritanceMappingDemoApplication.class, args);
    }

}

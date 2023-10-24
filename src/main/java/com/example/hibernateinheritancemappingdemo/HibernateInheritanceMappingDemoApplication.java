package com.example.hibernateinheritancemappingdemo;

//import com.example.hibernateinheritancemappingdemo.singleTable.Mentor;
//import com.example.hibernateinheritancemappingdemo.singleTable.MentorRepository;
//import com.example.hibernateinheritancemappingdemo.singleTable.UserRepository;

//import com.example.hibernateinheritancemappingdemo.tablePerClass.Mentor;
//import com.example.hibernateinheritancemappingdemo.tablePerClass.MentorRepository;
//import com.example.hibernateinheritancemappingdemo.tablePerClass.User;
//import com.example.hibernateinheritancemappingdemo.tablePerClass.UserRepository;

import com.example.hibernateinheritancemappingdemo.joinedTable.Mentor;
import com.example.hibernateinheritancemappingdemo.joinedTable.MentorRepository;
import com.example.hibernateinheritancemappingdemo.joinedTable.User;
import com.example.hibernateinheritancemappingdemo.joinedTable.UserRepository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class HibernateInheritanceMappingDemoApplication implements CommandLineRunner {
    private MentorRepository mentorRepository;
    private UserRepository userRepository;

    public HibernateInheritanceMappingDemoApplication(@Qualifier("jt_mentor_repo") MentorRepository mentorRepository, @Qualifier("jt_user_repo")UserRepository userRepository) {
        this.mentorRepository = mentorRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Mentor mentor = new Mentor();
        mentor.setName("Salman");
        mentor.setEmail("sallu@school.com");
        mentor.setAvgRating(5.63f);
        mentorRepository.save(mentor);

        User user = new User();
        user.setName("Sidarth");
        user.setEmail("sidarth.sukla@school.com");
        userRepository.save(user);

        List<User> users= userRepository.findAll();
        for(User u: users){
            System.out.println(u);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(HibernateInheritanceMappingDemoApplication.class, args);
    }

}

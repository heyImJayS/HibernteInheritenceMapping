package com.example.hibernateinheritancemappingdemo.tablePerClass;

//import com.example.hibernateinheritancemappingdemo.singleTable.Mentor;
import com.example.hibernateinheritancemappingdemo.tablePerClass.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpc_mentor_repo")
public interface MentorRepository extends JpaRepository<Mentor, Long> {
    @Override
    <S extends Mentor> S save(S entity);
}

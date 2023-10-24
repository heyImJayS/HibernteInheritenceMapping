package com.example.hibernateinheritancemappingdemo.singleTable;

import com.example.hibernateinheritancemappingdemo.singleTable.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("st_mentor_repo")
public interface MentorRepository extends JpaRepository<Mentor, Long> {
    @Override
    <S extends Mentor> S save(S entity);
}

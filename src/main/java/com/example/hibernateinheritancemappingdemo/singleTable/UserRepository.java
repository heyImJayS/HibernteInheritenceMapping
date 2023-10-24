package com.example.hibernateinheritancemappingdemo.singleTable;
import com.example.hibernateinheritancemappingdemo.tablePerClass.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("st_user_repo")
public interface UserRepository extends JpaRepository<com.example.hibernateinheritancemappingdemo.tablePerClass.User, Long> {
    @Override
    <S extends User> S save(S entity);
}

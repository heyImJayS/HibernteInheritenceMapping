package com.example.hibernateinheritancemappingdemo.tablePerClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.hibernateinheritancemappingdemo.tablePerClass.User;


@Repository("tpc_user_repo")
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    <S extends User> S save(S entity);
}

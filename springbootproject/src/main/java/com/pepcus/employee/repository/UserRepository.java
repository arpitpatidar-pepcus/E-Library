package com.pepcus.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pepcus.employee.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  // value="update USER_REGISTRATION set password = :password WHERE user_name =
  // :user_name and email = :email",nativeQuery=true)
  @Query(value = "update LibraryUser set deregister ='YES' where id = :id", nativeQuery = true)
  public void updateDeregister(@Param("id") int id);

}

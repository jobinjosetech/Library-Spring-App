package com.nest.LibraryApp.dao;

import com.nest.LibraryApp.model.UserModel;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends CrudRepository<UserModel,Integer> {
    @Query(value = "SELECT `id`, `aadhar_number`, `address`, `dob`, `email`, `name`, `password`, `phone`, `pin`, `username` FROM `user` WHERE `username`= :username", nativeQuery = true)
    List<UserModel> FindUserLogin(@Param("username") String username);

    @Query(value = "SELECT `id`, `aadhar_number`, `address`, `dob`, `email`, `name`, `password`, `phone`, `pin`, `username` FROM `user` WHERE `username`= :username AND `password`= :password", nativeQuery = true)
    List<UserModel> GetLoginCreds(@Param("username") String username,@Param("password") String password);
}

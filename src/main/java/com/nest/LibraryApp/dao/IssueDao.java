package com.nest.LibraryApp.dao;

import com.nest.LibraryApp.model.IssueModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IssueDao extends CrudRepository<IssueModel,Integer> {
    @Query(value = "SELECT `id`, `book_id`, `date`, `user_email`, `user_id`, `user_name`, `book_name`, `book_image`, `book_price`FROM `issuebooks` WHERE `user_id`= :userId", nativeQuery = true)
    List<IssueModel> GetUserIssues(@Param("userId") Integer userId);
}

package com.vinay.SpringTodo.Repository;

import com.vinay.SpringTodo.Entity.TodoClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface TodoRepository extends JpaRepository<TodoClass,Integer> {
    @Transactional
    @Modifying
    @Query("update TodoClass t set t.name = :name, t.description = :description where t.id=:id")
    Integer updateTodo(@Param("name") String name, @Param("description") String description ,@Param("id") Integer id);
}

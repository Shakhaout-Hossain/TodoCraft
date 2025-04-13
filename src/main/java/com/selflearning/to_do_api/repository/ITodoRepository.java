package com.selflearning.to_do_api.repository;

import com.selflearning.to_do_api.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITodoRepository extends JpaRepository<Todo, Long> {
}

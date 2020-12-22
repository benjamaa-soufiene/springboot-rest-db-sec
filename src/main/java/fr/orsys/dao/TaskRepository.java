package fr.orsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.model.Task;


public interface TaskRepository extends JpaRepository<Task, Long> {

}

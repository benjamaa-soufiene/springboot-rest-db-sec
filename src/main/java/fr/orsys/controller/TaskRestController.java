package fr.orsys.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.orsys.dao.TaskRepository;
import fr.orsys.model.Task;


@RestController
public class TaskRestController {
	@Autowired
	private TaskRepository taskRepository;
	
	@GetMapping("/tasks")
	public List<Task> getListTasks(){
		return taskRepository.findAll();
	}
	@PostMapping("/tasks")
	public Task save(@RequestBody Task t) {
		return taskRepository.save(t);
	}
	
	@PutMapping("/tasks")
	public Task update(@RequestBody Task t) {
		return taskRepository.save(t);
	}
	
	@DeleteMapping("/tasks")
	public void delete(@RequestBody Task t) {
		 taskRepository.delete(t);
	}
}

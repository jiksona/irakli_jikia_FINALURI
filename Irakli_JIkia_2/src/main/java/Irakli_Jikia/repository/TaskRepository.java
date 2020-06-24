package Irakli_Jikia.repository;

import Irakli_Jikia.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task,Long> {
}

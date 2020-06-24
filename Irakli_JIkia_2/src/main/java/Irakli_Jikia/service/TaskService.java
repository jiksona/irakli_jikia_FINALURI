package Irakli_Jikia.service;

import Irakli_Jikia.dto.*;

public interface TaskService {
    AddTaskOutput addTask(AddTaskInput addTaskInput);
    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);
    GetTasksOutput getTasks(GetTasksInput getTasksInput);
}

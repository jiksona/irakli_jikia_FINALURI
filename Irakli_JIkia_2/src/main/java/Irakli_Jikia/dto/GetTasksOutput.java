package Irakli_Jikia.dto;

import lombok.Data;

import java.util.List;

@Data
public class GetTasksOutput {
    private List<TaskDTO> tasks;
}

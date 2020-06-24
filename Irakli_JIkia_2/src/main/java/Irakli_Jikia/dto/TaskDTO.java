package Irakli_Jikia.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TaskDTO {
    Long id;
    String title;
    String description;
    Date startDate;
    Date endDate;
}

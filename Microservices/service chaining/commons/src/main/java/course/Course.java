package course;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Course {
    @Id
    private int id;
    private String name;
    private int credits;
}

package enroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Enroll {
    @Id
    private int id;
    private int studentId;
    private int courseId;
}

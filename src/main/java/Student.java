import javax.persistence.*;

/**
 * Created by saazimi on 09/08/2018.
 */
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Student_id;
    private String username;
    @OneToOne
    @JoinColumn(name = "vehicle_ID")

    private Vehicle Student_vehicle;

    public Vehicle getStudent_vehicle() {
        return Student_vehicle;
    }

    public void setStudent_vehicle(Vehicle student_vehicle) {
        Student_vehicle = student_vehicle;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public Student() {
    }
}

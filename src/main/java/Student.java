import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by saazimi on 09/08/2018.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Student_id;
    private String username;
    @ManyToMany
    @JoinColumns({@JoinColumn(name = "Student_vehicles")})
    private Collection<Vehicle> Student_vehicles = new ArrayList<Vehicle>();



    public Collection<Vehicle> getStudent_vehicles() {
        return Student_vehicles;
    }

    public void setStudent_vehicles(Collection<Vehicle> student_vehicles) {
        Student_vehicles = student_vehicles;
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

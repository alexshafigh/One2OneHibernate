import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

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
//    @OneToMany
//    @JoinTable(name = "User_Vehicle" ,
//            joinColumns = @JoinColumn(name = "USER_ID"),
//            inverseJoinColumns = @JoinColumn (name = "Vhicle_Id")
//    )
//    private Collection<Vehicle> Student_vehicles = new ArrayList<Vehicle>();
//

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

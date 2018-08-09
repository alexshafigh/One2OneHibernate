import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by saazimi on 09/08/2018.
 */
@Entity
public class Vehicle {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int VID;
    private String VName;
    @ManyToMany(mappedBy = "Student_vehicles")
    private Collection<Student> owner = new ArrayList<Student>();





    public void setOwner(Collection<Student> owner) {
        this.owner = owner;
    }

    public Collection getOwner() {
        return owner;
    }

    public int getVID() {
        return VID;
    }

    public void setVID(int VID) {
        this.VID = VID;
    }

    public String getVName() {
        return VName;
    }

    public void setVName(String VName) {
        this.VName = VName;
    }

    public Vehicle() {
    }
}

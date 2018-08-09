import javax.persistence.*;

/**
 * Created by saazimi on 09/08/2018.
 */
@Entity
public class Vehicle {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int VID;
    private String VName;

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

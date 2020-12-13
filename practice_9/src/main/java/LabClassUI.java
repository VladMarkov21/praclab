import java.util.ArrayList;
import java.util.Collection;

public interface LabClassUI  {
    public void addPerson(String name,String sername, String middle_name,int inn) throws NumberFormatException;
    public void sort( int low, int high);
    public boolean find(int inn);
    public void delete();
    public int size();

}

import java.util.ArrayList;
import java.util.Collection;

public class LabClassDriver implements LabClassUI {
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Integer> inn_list= new ArrayList<Integer>();

    public LabClassDriver(){
       inn_list.add(100000);
       inn_list.add(100001);
       inn_list.add(100002);
       inn_list.add(100003);
    }
    @Override
    public String toString() {
        String stroka = "";
        for (Student st : students) {
            stroka += st.toString() + "\n";
        }
        return stroka;
    }


    public void addPerson(String name, String sername, String middle_name, int inn)throws NumberFormatException {
        students.add(new Student(name, sername, middle_name, inn));
    }

    public void sort(int low, int high) {
        if (students.size() == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = students.get(middle).getInn();

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (students.get(i).getInn() < opora) {
                i++;
            }

            while (students.get(j).getInn() > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            sort(low, j);

        if (high > i)
            sort(i, high);

    }



    public boolean find( int inn) {
      for(int list:inn_list){
          if(inn_list.contains(inn)) return true;
      }
        return false;
    }

    public void delete() {
        /*



         */

    }

    public int size() {
        return students.size();
    }


}

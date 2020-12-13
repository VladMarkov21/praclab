public class Student {
    private String name;
    private String sername;
    private String middle_name;
    private int inn;

    public String getName() {
        return name;
    }

    public String getSername() {
        return sername;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public int getInn() {
        return inn;
    }



    public Student(String name, String sername, String middle_name, int inn) {
        this.name = name;
        this.sername = sername;
        this.middle_name = middle_name;
        this.inn = inn;
    }
    public boolean check_student(Student student, int inn) {
        if(student.getInn()==inn) return true;
        else return  false;
    }

    @Override
    public String toString() {
        return "Новый заказ : "+this.name+"/"+this.sername+"/"+this.middle_name+"-"+this.inn;
    }
}

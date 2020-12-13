import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SortingStudentsByGPA sortingStudentsByGPA= new SortingStudentsByGPA();
        ArrayList<Student> list= new ArrayList<Student>();
        list.add(new Student("Alex","Borisov",110));
        list.add(new Student("Oleg","Erofeev",99));
        list.add(new Student("Misha","Gorohov",150));
        list.add(new Student("Nina","Egorova",88));
        list.add(new Student("Inna","Loseva",190));
        sortingStudentsByGPA.outDan(list,1);
        int low=0;
        int hight=list.size()-1;
        sortingStudentsByGPA.quickSort(list,low,hight);
        System.out.println("Sorted List : ");
        sortingStudentsByGPA.outDan(list,-1);
    }
}

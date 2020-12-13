import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA  {



    public void quickSort(ArrayList<Student> list,int low,int high){
        if (list.size() == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = list.get(middle).getBall();

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (list.get(i).getBall() < opora) {
                i++;
            }

            while (list.get(j).getBall() > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = list.get(i);
                list.set(i,list.get(j));
                list.set(j,temp);
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(list, low, j);

        if (high > i)
            quickSort(list, i, high);

    }


    public void outDan(ArrayList<Student> list,int por){
        if(por>0) {
            for (Student student : list) {
                student.out();
            }
        } else{
            Collections.reverse(list);
            for (Student student : list) {
                student.out();
            }
        }
    }
}

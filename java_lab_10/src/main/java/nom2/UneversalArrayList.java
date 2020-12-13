package nom2;

public class UneversalArrayList<T> implements IUneversalArrayList{
    private T arr[];

    public Object getByIndex(int i) {
        return arr[i];
    }

    public void setArray(Object[] arr) {
        this.arr= (T[]) arr;
    }


    public void out() {
        for(T el: arr){
            System.out.print(el+ " ");
        }
        System.out.println();

    }
}

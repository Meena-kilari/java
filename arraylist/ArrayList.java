package arraylist;

public class ArrayList {
    private static int[] arr;
    private static int n,c=10;
    ArrayList(){
        arr=new int[c];
        n=0;
    }
    private  void resize(){
        if(n==c){
            c*=1.5;
            int[] narr=new int[c];
            for(int i=0;i<n;i++){
                narr[i]=arr[i];
            }
            arr=narr;
        }
    }
    public  boolean add(int i, int x){
        if (i < 0 || i > n) return false;
        resize();

        for(int j = n - 1; j >= i; j--) {
            arr[j + 1] = arr[j];
        }
        arr[i] = x;
        n++;
        return true;
    }
    public  boolean add(int x) {
        resize();
        arr[n] = x;
        n++;
        return true;
    }
    public boolean remove(int index) {
        if (index < 0 || index >= n) {
            return false;
        }
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
        return true;
    }
    public  int size() {
        return n;
    }
    public boolean contains(int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }
    public boolean addFirst(int x){
        resize();
        for (int i = n - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = x;
        n++;
        return true;
    }
    public  boolean addLast(int x) {
        resize();
        arr[n] = x;
        n++;
        return true;
    }
}

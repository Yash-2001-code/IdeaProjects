public class Main {
    public static void main(String[] args) {
        int v = 5;
        int i = 1;
        while(v>0)
        {
            i*=v;
            v-=1;
        }
        System.out.println(i);
    }
}
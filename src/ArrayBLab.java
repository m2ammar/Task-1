import java.util.Scanner;

public class ArrayBLab {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=1;

        int[] count=new int[4];

        int[] counts={1,2,3,4};
        System.out.println(counts[2]);
        System.out.println(counts[0]);

        counts[0]=7;
        counts[1]++;
        System.out.println(counts[0]);
//        System.out.println(counts[1]);

        for(int i =0; i<count.length; i++){
            count[i]=counts[i];
            System.out.println(count[i]);
        }
    }
}

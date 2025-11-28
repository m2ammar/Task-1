public class ArrayBLab2 {
    public static void main(String[] args){
        //Task: a program, take contains at least 10 prime number as array
        //List, then use this array to count the sum of mentioned prime number

            int[] prime = {2,3,5,7,11,13,17,19,23,29};
            int sum = 0;
            for(int i=0;i<prime.length;i++){
             sum+=prime[i];
        }
        System.out.println(sum);
    }
}

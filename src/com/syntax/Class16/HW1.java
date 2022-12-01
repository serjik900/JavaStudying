package Class16;

public class HW1 {
    int sumArr(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        HW1 obj=new HW1();
        System.out.println(obj.sumArr(new int[]{4,2,4,2}));
    }
}

package september30;

public class Arrays {
    public static void main(String[]args){
        int [] arr = new int[10];
        arr[1] =10;
        arr[2] =30;
        arr[3] =20;
        arr[4] =60;
        arr[5] =40;
        arr[6] =60;
        arr[7] =70;
        arr[8] =80;
        arr[9] =70;
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

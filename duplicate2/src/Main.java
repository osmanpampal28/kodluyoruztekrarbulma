public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] list={10, 20, 20, 10, 10, 20, 5, 20};
        System.out.print("Dizi : [");
        for(int i=0;i< list.length;i++){
            if(i==list.length-1)
                System.out.println(list[i]+"]");
            else
                System.out.print(list[i]+",");
        }
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            if(!anyHere(duplicate,list[i]))
                duplicate[startIndex++]=list[i];
        }
        System.out.println("Tekrar sayıları: ");
        for (int value : duplicate){
            if (value != 0){
                System.out.println(value+" sayısı "+howMany(list,value)+" kere tekrar edildi");
            }
        }
    }
    public static boolean anyHere(int[] arr,int value){
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static int howMany(int[] arr,int value){
        int sayac=0;
        for(int i:arr){
            if(i==value)
                sayac++;
        }

        return sayac;
    }
}

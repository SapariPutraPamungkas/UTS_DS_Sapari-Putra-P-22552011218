public class soal1 {
    public static void main(String[] args) {
        int [] bil = {3, 9, 12, 67, 19, 11, 19, 29, 74, 67, 15, 54, 28, 54, 39};
        System.out.print("Bilangan Genap  :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2 == 0) {
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2!= 0){
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println("");
    }
}
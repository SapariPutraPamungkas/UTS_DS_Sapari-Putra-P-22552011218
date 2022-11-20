import java.util.Scanner;
public class soal2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int Nmaks=100;
        //  int larik[100];
        int jumdata,j,temp;

        Scanner scan=new Scanner(System.in);
        System.out.print("MASUKAN JUMLAH DATA ABSEN : ");
        jumdata=scan.nextInt();

        int arrayNilai[]= new int[jumdata];

        for (int i = 0; i < jumdata; i++) {
            System.out.print("Masukkan data ke-"+i+" : ");
            arrayNilai[i]=scan.nextInt();
        }

        System.out.println("\nDATA ABSEM SEBELUM DIURUTKAN :");
        for (int i=0; i<jumdata; i++) {
            System.out.println(arrayNilai[i]+" ");
        }

        for(int a=0;a<arrayNilai.length;a++){
            for(int b=0;b<arrayNilai.length-1;b++){
                if(arrayNilai[b]>arrayNilai[b+1]){
                    temp = arrayNilai[b];
                    arrayNilai[b]=arrayNilai[b+1];
                    arrayNilai[b+1]=temp;
                }
            }
        }
        System.out.println("\n");
        System.out.print("DATA ABSEN SETELAH DIURUTKAN :");
        for(int c=0; c<jumdata;c++)
        {
            System.out.println(arrayNilai[c]+" ");
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("DATA ABSEN SETELAH DI URUTKAN SESUAI GANJIL GENAP");
        System.out.print("Data absen Ganjil :  ");
        for (int i = 0; i < jumdata; i++){
            if (arrayNilai [i] % 2!= 0){
                System.out.print(arrayNilai[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Data absen Genap  :  ");

        for (int i = 0; i < jumdata; i++){
            if (arrayNilai [i] % 2 == 0) {
                System.out.print(arrayNilai[i] + " ");
            }
        }

        System.out.println("");
    }

}
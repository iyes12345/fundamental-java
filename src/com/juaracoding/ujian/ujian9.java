import java.util.Scanner;

public class ujian9 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        String nama = scanner.nextLine();
        String nim = scanner.nextLine();

        String tahunmasuk;
        String kalimat= "2019 2020";



        System.out.println("Nama: "+nama.toUpperCase());
        System.out.println("NIM: "+nim);

        System.out.println(kalimat.substring(0,9));



    }
}
import java.util.*;  /*memanggil library untuk fungsi scanner yang berguna untuk inputan*/
import org.lwjgl.LWJGLException; /*memanggil library untuk menjalankan fungsi 
                                    pengecualian pada 'lwjgl'*/
public class LineMaker {

    public static void main(String[] args) throws LWJGLException{
    int pil; /*mendefinisikan variabel pil untuk menerima inputan pilihan user nantinya*/
    Scanner input = new Scanner(System.in); /*membuat fungsi inputan menggunakan fungsi scanner*/
    System.out.println("========Aplikasi Pembuat Garis========"); /*<----|*/ 
    System.out.println("1. Membuat Garis Vertical"); /*<-----------------|*/
    System.out.println("2. Membuat Garis Horizontal"); /*<--membuat teks untuk menu pilihan*/
    System.out.println("3. Membuat Garis Diagonal"); /*<-----------------|*/
    System.out.print("Silahkan Masukan Pilihan yang diinginkan : ");/*<--|*/
    pil = input.nextInt(); /*Menerima inputan user dan memasukannya kedalam variabel 'pil'*/
    switch(pil){  /*memilih kondisi pada 'case' berdasarkan inputan user (misal : 1 untuk case 1)*/
        case 1:
            Vertikal vet = new Vertikal(); /*memanggil class 'Vertikal'*/
            vet.layar(); /*menjalankan fungsi 'layar' pada class 'Vertikal'*/
            break; /*memberhentikan kondisi*/
        case 2:
            Horizontal hoz = new Horizontal(); /*memanggil class 'Horizontal'*/
            hoz.layar(); /*menjalankan fungsi 'layar' pada class 'Horizontal'*/
            break;
        case 3:
            Diagonal dig = new Diagonal(); /*memanggil class 'Diagonal*/
            dig.layar(); /*menjalankan fungsi 'layar' pada class 'Diagonal*/
            break;
        default:
            System.out.println("Pilihan yang anda pilih salah!!"); /*memunculkan pesan apabila input 
            pada pil tidak sesuai dengan case yang ada*/
        }
    }
}

    
    
    


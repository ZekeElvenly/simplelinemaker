import org.lwjgl.LWJGLException; /*memanggil library untuk menjalankan fungsi pengecualian pada lwjgl*/
import org.lwjgl.opengl.*; /*memanggil library 'lwjgl' untuk menjalankan renderer opengl*/
import java.util.*; /*memanggil library untuk fungsi scanner yang berguna untuk inputan*/

public class Diagonal {
    
    public void layar() throws LWJGLException {
    
        int a,kordin1,kordin2; /*mendefinisikan variabel 'a,kordin1,dan kordin2'*/
        Scanner putin = new Scanner(System.in); /*mendefinisikan fungsi Scanner pada 'putin' untuk menerima input user*/
        System.out.print("Masukan titik awal (x) : ");
        kordin1 = putin.nextInt(); /*input koordinat x*/
        System.out.print("Masukan titik awal (y) : ");
        kordin2 = putin.nextInt(); /*input koordinat y*/
        System.out.print("Masukan Panjang garis yang diinginkan (dalam Pixel) : ");
        a = putin.nextInt(); /*menerima input user dan memasukannya kedalam variabel 'a' yang akan digunakan sebagai panjang
                               dari garis yang akan dibuat*/
        
        try {
	    Display.setDisplayMode(new DisplayMode(300,300)); /*membuat sebuah jendela rendering dengan seting 
                                                                luas layar = 300x300*/
            Display.setTitle("Garis Diagonal"); /*mengubah nama jendela rendering menjadi "Garis Diagonal"*/
	    Display.create(); /*membuat jendela rendering*/
	} catch (LWJGLException e) {
	    System.exit(0); /*mencegah jendela rendering tertutup apabila tidak ada aktivitas pada library LWJGL*/
	}
        GL11.glMatrixMode(GL11.GL_PROJECTION);
	GL11.glLoadIdentity();                  /*memanggil opengl sebagai renderer (bagian ini gak yakin sih -_-)*/  
	GL11.glOrtho(0, 800, 0, 600, 1, -1);
	GL11.glMatrixMode(GL11.GL_MODELVIEW);
        
        while (!Display.isCloseRequested()) { /*mencegah jendela renderer tertutup kecuali ditutup sendiri oleh user*/
            
          GL11.glBegin(GL11.GL_QUADS);
	        GL11.glVertex2f(kordin1,kordin2); /*titik awal*/
		GL11.glVertex2f(kordin1-5,kordin2); /*titik awal, pada sumbu x sengaja diberi jeda untuk mempertebal garis*/
		GL11.glVertex2f(kordin1+a-5,kordin2+a); /*titik akhir, pada sumbu x dan y variabel akan ditambahkan 'a' yang 
                                                        sesuai dengan inputan user dan pada sumbu x sengaja diberi jeda untuk
                                                        mempertebal garis*/
		GL11.glVertex2f(kordin1+a,kordin2+a); /*titik akhir, pada sumbu x dan y variabel akan ditambahkan 'a' yang 
                                                        sesuai dengan inputan user*/
	    GL11.glEnd();  /*mengakhiri proses render*/
            Display.update();
        }
    }
}
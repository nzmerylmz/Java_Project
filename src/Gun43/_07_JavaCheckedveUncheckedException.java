package Gun43;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _07_JavaCheckedveUncheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara Unchecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hata
        // durumlarına CHECKED yani kontrol ettiğim hatalar denir.

        FileInputStream file = new FileInputStream("liste.txt");

//        try {
//            FileInputStream file = new FileInputStream("liste.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("e.getMessage() = " + e.getMessage());
//        }
//        //bu komut dosya okuma işlemini başlatır, dosyayı açar
        dosyaAc();
    }
    public static void dosyaAc() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("liste.txt");
    }
}

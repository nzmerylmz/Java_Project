package Gun30.PrivateErisim;

public class Calisan {
    int id;
    String name;
    String surName;
    private String password;

    public void sifreAta(String sifre) {
        if (sifre.length() < 8) {
            System.out.println("Lütfen kurala uygun şifre giriniz");
        } else {
            this.password = sifre;
            System.out.println("Şifre başarıyla atandı");
        }
    }
    public void sifreGoster(){
        System.out.println("****"+password.substring(4));
    }
}

package Gun32._02_Ornek;

public class Soru {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.ADMIN yetkili kullanıcıya
    // SILME işlemi kontrolü yapınız bir metod için.
    public static void main(String[] args) {
        User user1=new User("İsmet",Status.AKTIF,Role.ADMIN);
        User user2=new User("Ahmet",Status.PASIF,Role.PERSONEL);
        User user3=new User("Ayşe",Status.AKTIF,Role.MUDUR);

        UserSil(user1);
    }
    public static void UserSil(User user){
        if (user.role == Role.ADMIN){
            System.out.println("Admin silinemez");
        }
    }

}

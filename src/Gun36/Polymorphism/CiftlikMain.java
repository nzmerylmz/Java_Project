package Gun36.Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("karabas");
        Kedi kedi1=new Kedi("kopuk");

        Hayvan kopek2=new Kopek("rodi");
        Hayvan kedi2=new Hayvan("tekir");

        kopek1.ses();      //gerçekten kopek
        kopek1.kokladi();  //gerçekten kopek

        kopek2.ses();     //hayvan gibi görünüyor, ama kopek
        hayvanSes(kopek1);
        hayvanSes(kedi1);
    }
    public static void hayvanSes( Hayvan h){
        h.ses();
    }
}

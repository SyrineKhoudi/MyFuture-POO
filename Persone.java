//declaration d'une classe
public class Persone{
    private int cin;
    private String nom;
    private String prènom;
    private String adresse;
    private int age;
//construteur paramètre
public Persone(int cin, String nom, String prènom, String adresse, int age){
    this.cin=cin;
    this.nom=nom;
    this.prènom=prènom;
    this.adresse=adresse;
    this.age=age;
}
public int getcin(){
    return cin;
}
public void setcin(int cin){
    this.cin=cin;
}
public void afficher(){
    System.out.println(cin);
    System.out.println(nom);
    System.out.println(prènom);
    System.out.println(adresse);
    System.out.println(age);
}
}
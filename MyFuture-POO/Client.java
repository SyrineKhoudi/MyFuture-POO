public class Client {
    private String cin;
    private String nom;
    private String prenom;
    private String telephone;

    public Client(String cin, String nom, String prenom, String telephone){
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
        this.telephone=telephone;
    }
    public String getcin() {
        return cin;
    }
    public String getnom() {
        return nom;
    }
    public String getprenom() {
        return prenom;
    }
    public String gettelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone=telephone;
    }
    public void afficherClient(){
        System.out.println("[cin:"+ cin + "] nom" + nom + " prenom "+ prenom + "num tel" + telephone);
    }

}

package .vscode.Java.progetto1;

public class studente {
    private String nome;
    private String cognome;
    int eta;
    
    public studente(String nome,String cognome,int eta ){
        this.nome=nome;
        this.cognome=cognome;
        this.eta=eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
    public void stampa(){
        System.out.println("studente:"+nome+cognome+eta);
    }
    
}
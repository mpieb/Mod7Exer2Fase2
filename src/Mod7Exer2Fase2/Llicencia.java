
package Mod7Exer2Fase2;

public class Llicencia {
    private String id;
    private String tipusLlicencia;
    private String nomComplet;
    private String dataCaducitat;
    
    public Llicencia(String id, String tipusLlicencia, String nomComplet, String dataCaducitat){
        this.id = id;
        this.tipusLlicencia = tipusLlicencia;
        this.nomComplet = nomComplet;
        this.dataCaducitat = dataCaducitat;
    }
    
    public void setId (String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setNomComplet(String nomComplet){
        this.nomComplet = nomComplet;
    }
    
    public String getNomComplet(){
        return nomComplet;
    }
    
    public void setDataCaducitat(String dataCaducitat){
        this.dataCaducitat = dataCaducitat;
    }
    
    public String getDataCaducitat(){
        return dataCaducitat;
    }
}
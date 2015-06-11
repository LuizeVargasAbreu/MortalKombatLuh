
package mortalkombatluh;


public class LutaReptileScorpion {
    
    private String cenario;
    private Reptile personagem1;
    private Scorpion personagem2;
    private Integer dano;
    private Integer danocombo;

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) {
        this.cenario = cenario;
    }

    public Reptile getPersonagem1() {
        return personagem1;
    }

    public void setPersonagem1(Reptile personagem1) {
        this.personagem1 = personagem1;
    }

    public Scorpion getPersonagem2() {
        return personagem2;
    }

    public void setPersonagem2(Scorpion personagem2) {
        this.personagem2 = personagem2;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getDanocombo() {
        return danocombo;
    }

    public void setDanocombo(Integer danocombo) {
        this.danocombo = danocombo;
    }
    
        public LutaReptileScorpion ()
    {
        this.cenario = "Casa do Goro";
        this.personagem1 = new Reptile ();
        this.personagem2 = new Scorpion ();
        this.dano = 5;
        this.danocombo = 20;
    }
    
    public void acertaGolpe (String lutador)
    {
        if (lutador.equals("p1"))
        {
         this.personagem2.setVida(this.personagem2.getVida()- this.dano);
        }
        else 
        {          
        this.personagem1.setVida(this.personagem1.getVida()- this.dano);  
        }
    }
    
    public void acertaCombo (String lutador)
    {
        if (lutador.equals("p1"))
        {            
        this.personagem2.setVida(this.personagem2.getVida()- this.danocombo);
        }
        else 
        {            
        this.personagem1.setVida(this.personagem1.getVida()- this.danocombo);
        }
    }
}

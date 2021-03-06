package mortalkombatluh;

public class Scorpion {

    private String socoforte;
    private String socofraco;
    private String chuteforte;
    private String chutefraco;
    private String defesa;
    private String agarra;
    private String especial;
    private Integer vida;

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
    
    public String getSocoforte()    {
        return socoforte;
    }

    public void setSocoforte(String socoforte) {
        this.socoforte = socoforte;
    }

    public String getSocofraco() {
        return socofraco;
    }

    public void setSocofraco(String socofraco) {
        this.socofraco = socofraco;
    }

    public String getChuteforte() {
        return chuteforte;
    }

    public void setChuteforte(String chuteforte) {
        this.chuteforte = chuteforte;
    }

    public String getChutefraco() {
        return chutefraco;
    }

    public void setChutefraco(String chutefraco) {
        this.chutefraco = chutefraco;
    }

    public String getDefesa() {
        return defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getAgarra() {
        return agarra;
    }

    public void setAgarra(String agarra) {
        this.agarra = agarra;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public Scorpion ()
    {
        this.agarra= null;
        this.chuteforte = null;
        this.chutefraco = null;
        this.defesa = null;
        this.especial = null;
        this.socoforte = null;
        this.socofraco = null;
        this.vida = 100;
                
    }
    public String spear()
    {
        return "Trás - Trás - " + chutefraco;
    }
    public String teleport()
    {
        return "Baixo - Trás - " + chuteforte;
    }
    public String takedown()
    {
        return "Baixo - Trás - " + socoforte;
    }
    public String combo1 ()
    {
        return defesa ;
    }
    public String combo2 ()
    {
        return "L2 - "+ especial ;
    }
    public String fatality1 ()
    {
        return "Frente - Baixo - Frente - " + socofraco;
    }
    public String fatality2 ()
    {
        return "Trás - Frente - Trás - " + chuteforte;
    }
    private String airdeamon ()
    {
        return  "Baixo - Trás - " + socofraco;
    }
}
/*Scorpion
Spear: Trás - Trás - Quadrado
Demon Fire: Baixo - Trás - Triângulo
Teleport: Baixo - Trás - [X]
Take Down: Baixo - Trás - Bolinha
Air Throw: Defesa (no ar)
X-Ray Move Scorpion Sting: L2 + R2
Fatality 1 > Split Decision: Frente - Baixo - Frente - Triângulo (encostado)
Fatality 2 > Nether-Gate: Trás - Frente - Trás - [X] (encostado)
Fatality 3 > Toasty: Baixo - Cima - Cima - Triângulo (a um pulo) *Scorpion versão MK1
Stage Fatality: Frente - Cima - Cima - Quadrado
Babality: Baixo - Trás - Frente - Baixo - Triângulo (a um pulo)*/
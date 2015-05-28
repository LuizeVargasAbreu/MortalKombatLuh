/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mortalkombatluh;

/**
 *
 * @author Familia Bookafé
 */
public class Scorpion {

    private String socoforte;
    private String socofraco;
    private String chuteforte;
    private String chutefraco;
    private String defesa;
    private String agarra;
    private String especial;
    private Integer vida;

    //MÉTODOS GETTER E SETTER
    //GET(pego o valor do meu atributo, retorno ele
    //SET(eu atribuo um novo valor para o meu produto)
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
    public String invisivel()
    {
        return "Baixo - Cima - " + socoforte;
    }
    public String acido()
    {
        return "Baixo - Trás - " + socofraco;
    }
    public String bolarapida()
    {
        return "Trás - Trás - " + chuteforte;
    }
    public String bolalenta ()
    {
        return "Trás - Trás - " + chutefraco;
    }
    public String combo1 ()
    {
        return "Trás - Frente - " + socofraco;
    }
    public String combo2 ()
    {
        return "L2 - "+ especial ;
    }
    public String fatality1 ()
    {
        return "Frente - Frente - Baixo - Cima - " + chuteforte + " (a um passo)";
    }
    public String fatality2 ()
    {
        return "Baixo - Baixo - Frente - Trás - " + chutefraco + "(a um passo)";
    }
    private String bolaultrasonica ()
    {
        return bolarapida() + chuteforte ;
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
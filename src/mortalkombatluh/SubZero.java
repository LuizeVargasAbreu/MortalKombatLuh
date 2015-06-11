package mortalkombatluh;

public class SubZero {

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

    public SubZero ()
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
    public String gelofrente()
    {
        return "Baixo - Frente - Trás - " + socoforte;
    }
    public String gelochao()
    {
        return "Baixo - Trás - " + chuteforte;
    }
    public String slide()
    {
        return "Trás - Frente - " + socoforte;
    }
    public String combo1 ()
    {
        return  chuteforte + " - " + chuteforte + " - Trás - " + chuteforte  ;
    }
    public String combo2 ()
    {
        return socoforte + " - " + socoforte + " - " + socofraco + " - Trás - " + chuteforte;
    }
    public String fatality1 ()
    {
        return "Trás - Frente - Baixo - Frente - " + socoforte;
    }
    public String fatality2 ()
    {
        return "Baixo - Trás - Baixo - Frente - " + socofraco;
    }
    private String supergelo ()
    {
        return  defesa + " - Trás - Baixo - " + socoforte + " - Frente - Frente - " + chuteforte;
    }
}
/*Sub-Zero
Iceball: Baixo - Frente - [X]
Slide: Trás - Frente - Bolinha
Ice Clone: Baixo - Trás - Quadrado
Ice Puddle: Baixo - Trás - [X]
X-Ray Move Deep Freeze: L2 + R2
Fatality 1 > Have an Ice Day: Trás - Frente - Baixo - Frente - Bolinha (a um passo)
Fatality 2 > Spinal Smash: Baixo - Trás - Baixo - Frente - Triângulo (a um passo)
Fatality 3 > Spine Rip: Frente - Baixo - Frente - Triângulo (encostado) *Sub-Zero versão MK1
Stage Fatality: Frente - Baixo - Trás - Triângulo
Babality: Baixo - Trás - Baixo - Bolinha (a um pulo)



SUB-ZERO


Magias:
Banho de Gelo - B, F, SA 
Banho de Gelo para Frente - B, F, T, SA
Banho de Gelo para Trás - B, T, F, SA 
Clone de Gelo - B, T, SB (Vale no ar)
Congelar - B, F, SB 
Rasteira Deslizante - segure T, e aperte SB + CB

Combos:
3 Golpes - CA, CA, T, + CA 
4 Golpes - SA, SA, SB, T + CA
6 Golpes - SA, SA, SB, CB, CA, T, + CA 

Movimentos Finais:
FATALITY 1 (Congelar e Quebrar ao Meio) - BL, BL, CR, BL, CR (Perto) 
FATALITY 2 (Congelamento Profundo) - T, T, B, T, CR (A dois passos)
FRIENDSHIP (Boneco de Neve) - CB, CR, CR, C, (Livre) 
BABALITY (Transformação em Bebê) - B, T, T, CA (Livre)
ANIMALITY (Urso Polar) - segure BL, F, C, C, (Perto) 
STAGE FATALITY (Metrô/Torre/Abismo) - T, B, F, F, CA (Perto)
*/

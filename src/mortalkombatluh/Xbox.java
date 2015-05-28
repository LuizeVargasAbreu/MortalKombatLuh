/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mortalkombatluh;

/**
 *
 * @author Familia Bookafé
 */
public class Xbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reptile p1 = new Reptile();
        /*Reptile
         Slow Force Ball: Trás - Trás - Quadrado
         Fast Force Ball: Trás - Trás - [X]
         Slide: Trás - Frente - Bolinha
         Acid Hand: Baixo - Trás - Triângulo
         Invisibility: Baixo - Cima - Bolinha
         Acid Spit: Baixo - Frente - Quadrado
         Elbow Dash: Trás - Frente - Triângulo
         X-Ray Move Tricky Lizard: L2 + R2
         Fatality 1 > Acid Yak: Frente - Frente - Baixo - Cima - [X] (a um passo)
         Fatality 2 > Weight Loss: Baixo - Baixo - Frente - Trás - Quadrado (a um passo)
         Fatality 3 > Yummy!: Trás - Trás - Frente - Baixo - Defesa (a um pulo) *Reptile versão MK1
         Stage Fatality: Frente - Baixo - Baixo - Defesa
         Babality: Trás - Frente - Trás - Baixo - [X] (a um pulo)*/
        p1.setSocoforte("B");
        p1.setSocofraco("A");
        p1.setChuteforte("Y");
        p1.setChutefraco("X");
        p1.setDefesa("R1");
        p1.setAgarra("L1");
        p1.setEspecial("RT");
        
        System.out.println("          XBOX           ");
        System.out.println("**********Configuração dos Botões***********");
        System.out.println("Soco Forte:" + p1.getSocoforte());
        System.out.println("Soco Fraco:" + p1.getSocofraco());
        System.out.println("Chute Forte:" + p1.getChuteforte());
        System.out.println("Chute Fraco:" + p1.getChutefraco());
        System.out.println("Defesa:" + p1.getDefesa());
        System.out.println("Agarra:" + p1.getAgarra());
        System.out.println("Especial:" + p1.getEspecial());

        System.out.println("\n**********Comandos Especiais***********");
        System.out.println("Invísivel: " + p1.invisivel());
        System.out.println("Ácido: " + p1.acido());
        System.out.println("Bola Rápida: "+ p1.bolarapida() );
        System.out.println("Bola Lenta: "+ p1.bolalenta());
        System.out.println("Combo 1: "+ p1.combo1());
        System.out.println("Combo 2: "+ p1.combo2());
        System.out.println("Fatality 1: "+ p1.fatality1());
        System.out.println("Fatality 2: "+ p1.fatality2());


    }
}

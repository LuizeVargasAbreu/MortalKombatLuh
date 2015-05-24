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
        Reptile person1 = new Reptile();
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
        person1.setSocoforte("Bolinha");
        person1.setSocofraco("Triângulo");
        person1.setChuteforte("X");
        person1.setChutefraco("Quadrado");
        person1.setDefesa("R1");
        person1.setAgarra("L1");
        person1.setEspecial("R2");
        
        System.out.println("          XBOX           ");
        System.out.println("**********Configuração dos Botões***********");
        System.out.println("Soco Forte:" + person1.getSocoforte());
        System.out.println("Soco Fraco:" + person1.getSocofraco());
        System.out.println("Chute Forte:" + person1.getChuteforte());
        System.out.println("Chute Fraco:" + person1.getChutefraco());
        System.out.println("Defesa:" + person1.getDefesa());
        System.out.println("Agarra:" + person1.getAgarra());
        System.out.println("Especial:" + person1.getEspecial());

        System.out.println("**********Comandos Especiais***********");
        System.out.println("Invísivel: " + person1.invisivel());
        System.out.println("Ácido: " + person1.acido());
        System.out.println("Bola Rápida: "+ person1.bolarapida() );
        System.out.println("Bola Lenta: "+ person1.bolalenta());
        System.out.println("Defesa:" );
        System.out.println("Agarra:" );
        System.out.println("Especial:");

    }
}

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
        person1.socoforte = "Quadrado";
        person1.socofraco = "Bolinha";
        person1.chuteforte = "Triângulo";
        person1.chutefraco = "X";
        person1.defesa = "R1";
        person1.agarra = "L1";
        person1.especial = "L2";

        System.out.println("**********Configuração dos Botões***********");
        System.out.println("Soco Forte:" + person1.socoforte);
        System.out.println("Soco Fraco:" + person1.socofraco);
        System.out.println("Chute Forte:" + person1.chuteforte);
        System.out.println("Chute Fraco:" + person1.chutefraco);
        System.out.println("Defesa:" + person1.defesa);
        System.out.println("Agarra:" + person1.agarra);
        System.out.println("Especial:" + person1.especial);

        System.out.println("**********Comandos Especiais***********");
        System.out.println("Soco Forte:" + person1.socoforte);
        System.out.println("Soco Fraco:" + person1.socofraco);
        System.out.println("Chute Forte:" + person1.chuteforte);
        System.out.println("Chute Fraco:" + person1.chutefraco);
        System.out.println("Defesa:" + person1.defesa);
        System.out.println("Agarra:" + person1.agarra);
        System.out.println("Especial:" + person1.especial);

    }
}

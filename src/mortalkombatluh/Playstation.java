/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mortalkombatluh;

/**
 *
 * @author Familia Bookafé
 */
public class Playstation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reptile person1 = new Reptile();
        // ARRUMAR OS BOTÕES DE ACORDO COM OS DO PLAYSTATION
        person1.setSocoforte("Bolinha");
        person1.setSocofraco("Triângulo");
        person1.setChuteforte("X");
        person1.setChutefraco("Quadrado");
        person1.setDefesa("R1");
        person1.setAgarra("L1");
        person1.setEspecial("R2");
        
        System.out.println("          PLAYSTATION          ");
        System.out.println("**********Configuração dos Botões***********");
        System.out.println("Soco Forte:" + person1.getSocoforte());
        System.out.println("Soco Fraco:" + person1.getSocofraco());
        System.out.println("Chute Forte:" + person1.getChuteforte());
        System.out.println("Chute Fraco:" + person1.getChutefraco());
        System.out.println("Defesa:" + person1.getDefesa());
        System.out.println("Agarra:" + person1.getAgarra());
        System.out.println("Especial:" + person1.getEspecial());

        System.out.println("\n**********Comandos Especiais***********");
        System.out.println("Invísivel: " + person1.invisivel());
        System.out.println("Ácido: " + person1.acido());
        System.out.println("Bola Rápida: "+ person1.bolarapida() );
        System.out.println("Bola Lenta: "+ person1.bolalenta());
        System.out.println("Combo 1: "+ person1.combo1());
        System.out.println("Combo 2: "+ person1.combo2());
        System.out.println("Fatality 1: "+ person1.fatality1());
        System.out.println("Fatality 2: "+ person1.fatality2());

    }
}

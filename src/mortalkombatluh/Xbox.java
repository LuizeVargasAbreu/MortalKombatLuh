
package mortalkombatluh;

public class Xbox {

    public static void main(String[] args) {
        Reptile p1 = new Reptile();
        
        p1.setSocoforte("B");
        p1.setSocofraco("Y");
        p1.setChuteforte("A");
        p1.setChutefraco("X");
        p1.setDefesa("R1");
        p1.setAgarra("L1");
        p1.setEspecial("RT");
        
        Scorpion p2 = new Scorpion();

        p2.setSocoforte("B");
        p2.setSocofraco("Y");
        p2.setChuteforte("A");
        p2.setChutefraco("X");
        p2.setDefesa("R1");
        p2.setAgarra("L1");
        p2.setEspecial("RT");
        
        SubZero p3 = new SubZero();

        p3.setSocoforte("B");
        p3.setSocofraco("Y");
        p3.setChuteforte("A");
        p3.setChutefraco("X");
        p3.setDefesa("R1");
        p3.setAgarra("L1");
        p3.setEspecial("RT");
        
        // Configurações dos botões do XBOX
        
        System.out.println("              XBOX           ");
        System.out.println("**********Configuração dos Botões***********");
        System.out.println("Soco Forte:" + p1.getSocoforte());
        System.out.println("Soco Fraco:" + p1.getSocofraco());
        System.out.println("Chute Forte:" + p1.getChuteforte());
        System.out.println("Chute Fraco:" + p1.getChutefraco());
        System.out.println("Defesa:" + p1.getDefesa());
        System.out.println("Agarra:" + p1.getAgarra());
        System.out.println("Especial:" + p1.getEspecial());

        // Comandos Especias de cada personagem
        
        System.out.println("\n**********Comandos Especiais - REPTILE ***********");
        System.out.println("Invísivel: " + p1.invisivel());
        System.out.println("Ácido: " + p1.acido());
        System.out.println("Bola Rápida: "+ p1.bolarapida() );
        System.out.println("Bola Lenta: "+ p1.bolalenta());
        System.out.println("Combo 1: "+ p1.combo1());
        System.out.println("Combo 2: "+ p1.combo2());
        System.out.println("Fatality 1: "+ p1.fatality1());
        System.out.println("Fatality 2: "+ p1.fatality2());
        
        System.out.println("\n**********Comandos Especiais - SCORPION ***********");
        System.out.println("Spear: " + p2.spear());
        System.out.println("Teleport: " + p2.teleport());
        System.out.println("Take Down: " + p2.takedown());
        System.out.println("Combo 1: " + p2.combo1());
        System.out.println("Combo 2: " + p2.combo2());
        System.out.println("Fatality 1: " + p2.fatality1());
        System.out.println("Fatality 2: " + p2.fatality2());
        
        System.out.println("\n**********Comandos Especiais - SUB ZERO ***********");
        System.out.println("Spear: " + p3.gelochao());
        System.out.println("Teleport: " + p3.gelofrente());
        System.out.println("Slide: " + p3.slide());
        System.out.println("Combo 1: " + p3.combo1());
        System.out.println("Combo 2: " + p3.combo2());
        System.out.println("Fatality 1: " + p3.fatality1());
        System.out.println("Fatality 2: " + p3.fatality2());
        
        // Luta entre o Reptile e o Scorpion
        LutaReptileScorpion lutars = new LutaReptileScorpion();
          
        lutars.setCenario("Inferno");
        lutars.setPersonagem1(p1); // Reptile
        lutars.setPersonagem2(p2); // Scorpion
        
        lutars.acertaGolpe("p1");
        System.out.println("Personagem 1 - Acertou golpe");
        System.out.println("Personagem 1: " + lutars.getPersonagem1().getVida() +
                "\nPersoangem 2: " + lutars.getPersonagem2().getVida() +"\n");
        lutars.acertaCombo("p1");
        System.out.println("Personagem 1 - Acertou combo");
        System.out.println("Personagem 1: " + lutars.getPersonagem1().getVida() +
                "\nPersoangem 2: " + lutars.getPersonagem2().getVida() +"\n");
        
         lutars.acertaGolpe("p2");
        System.out.println("Personagem 2 - Acertou golpe");
        System.out.println("Personagem 2: " + lutars.getPersonagem1().getVida() +
                "\nPersoangem 1: " + lutars.getPersonagem2().getVida() +"\n");
        

    }
}

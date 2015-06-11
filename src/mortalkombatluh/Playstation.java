
package mortalkombatluh;
public class Playstation {

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
        
        Scorpion person2 = new Scorpion();

        person2.setSocoforte("Bolinha");
        person2.setSocofraco("Triângulo");
        person2.setChuteforte("X");
        person2.setChutefraco("Quadrado");
        person2.setDefesa("R1");
        person2.setAgarra("L1");
        person2.setEspecial("R2");
    
        SubZero person3 = new SubZero();

        person3.setSocoforte("Bolinha");
        person3.setSocofraco("Triângulo");
        person3.setChuteforte("X");
        person3.setChutefraco("Quadrado");
        person3.setDefesa("R1");
        person3.setAgarra("L1");
        person3.setEspecial("R2");
        
        System.out.println("          PLAYSTATION          ");
        System.out.println("**********Configuração dos Botões***********");
        System.out.println("Soco Forte:" + person1.getSocoforte());
        System.out.println("Soco Fraco:" + person1.getSocofraco());
        System.out.println("Chute Forte:" + person1.getChuteforte());
        System.out.println("Chute Fraco:" + person1.getChutefraco());
        System.out.println("Defesa:" + person1.getDefesa());
        System.out.println("Agarra:" + person1.getAgarra());
        System.out.println("Especial:" + person1.getEspecial());

        System.out.println("\n**********Comandos Especiais - REPTILE ***********");
        System.out.println("Invísivel: " + person1.invisivel());
        System.out.println("Ácido: " + person1.acido());
        System.out.println("Bola Rápida: "+ person1.bolarapida() );
        System.out.println("Bola Lenta: "+ person1.bolalenta());
        System.out.println("Combo 1: "+ person1.combo1());
        System.out.println("Combo 2: "+ person1.combo2());
        System.out.println("Fatality 1: "+ person1.fatality1());
        System.out.println("Fatality 2: "+ person1.fatality2());
        
                System.out.println("\n**********Comandos Especiais - SCORPION ***********");
        System.out.println("Spear: " + person2.spear());
        System.out.println("Teleport: " + person2.teleport());
        System.out.println("Take Down: " + person2.takedown());
        System.out.println("Combo 1: " + person2.combo1());
        System.out.println("Combo 2: " + person2.combo2());
        System.out.println("Fatality 1: " + person2.fatality1());
        System.out.println("Fatality 2: " + person2.fatality2());
        
        System.out.println("\n**********Comandos Especiais - SUB ZERO ***********");
        System.out.println("Spear: " + person3.gelochao());
        System.out.println("Teleport: " + person3.gelofrente());
        System.out.println("Slide: " + person3.slide());
        System.out.println("Combo 1: " + person3.combo1());
        System.out.println("Combo 2: " + person3.combo2());
        System.out.println("Fatality 1: " + person3.fatality1());
        System.out.println("Fatality 2: " + person3.fatality2());

    }
}

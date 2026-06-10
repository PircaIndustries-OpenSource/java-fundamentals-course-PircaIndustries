import java.util.Scanner;

class Hero {
    String heroName;

    public void useQuirk() {
        System.out.println(heroName + " dice: ¡Poder activado! ¡Listo para proteger a todos!");
    }
}

public class Main {
    
    public static void greet() {
        System.out.println("¡Hola! Bienvenido a la academia de programación orientada a objetos.");
    }

    public static void main(String[] args) {
        
        greet();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Cuál es tu nombre de estudiante?");
        String userName = scanner.nextLine();
        
        System.out.println("¡Gusto en conocerte, " + userName + "!");

        System.out.println("\n¡Es hora de registrar tu perfil de héroe!");
        
        Hero myHero = new Hero();
        
        System.out.println("¿Qué nombre de héroe quieres usar? (Ejemplo: Eraserhead, Loud Cloud)");
        myHero.heroName = scanner.nextLine();
        
        System.out.println("¡Espectacular! Tu registro como " + myHero.heroName + " ha sido completado.");
        
        myHero.useQuirk();
    }
}
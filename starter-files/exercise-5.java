// 1. Cree la clase principal (Padre) llamada Personaje
class Personaje {
    
    // 2. Defina los atributos privados: nombre (String) y nivel (int)
    
    
    // 3. Inicialice el constructor pasándole los parámetros correspondientes (nombre y nivel)
    
    
    // 4. Cree el Getter para obtener el nombre (Acceso a nombre)
    
    
    // 5. Cree el Getter para obtener el nivel (Acceso a nivel)
    
    
    // 6. Defina un método público llamado 'atacar' que imprima en consola: 
    // "El personaje " + [Nombre] + " está realizando un ataque básico."
    
    
}


// 7. Aplique la herencia: Cree la clase Hija llamada Guerrero que extienda (extends) de Personaje


    // 8. Defina un atributo privado exclusivo de la clase hija: arma (String)
    
    
    // 9. Cree el constructor de la clase hija (debe recibir nombre, nivel y arma)
    
        // 10. Dentro del constructor, use 'super' para llamar al constructor del padre pasándole nombre y nivel
        
        // 11. Asigne el valor del parámetro arma al atributo de la clase
        
    
    // 12. Cree el Getter para acceder al atributo arma
    
    
    // 13. Defina un método propio de la clase hija llamado 'usarHabilidad' 
    // que imprima en consola: "El guerrero ataca fuertemente usando su " + [arma]
    
    



public class Main {
    public static void main(String[] args) {
        
        // 14. Instancie un objeto de la clase Padre (Personaje) 
        // Asigne un nombre (ej. "Aldeano") y un nivel (ej. 1)
        
        
        // 15. Invoque el método 'atacar' de su objeto Personaje
        
        
        // 16. Imprima en consola el nivel del Personaje utilizando su respectivo Getter
        
        
        // 17. Instancie un objeto de la clase Hija (Guerrero) 
        // Asigne un nombre (ej. "Arthur"), un nivel (ej. 15) y un arma (ej. "Espada Larga")
        
        
        // 18. Invoque el método 'usarHabilidad' de su objeto Guerrero
        
        
        // 19. Imprima en consola el nombre del Guerrero utilizando el Getter que heredó del Padre
        
        
    }
}

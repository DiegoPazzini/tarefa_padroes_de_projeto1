package tarefa_padroes_de_projeto_1;

/**
 * Classe que fornece uma fábrica com base na escolha fornecida.
 */
public class FactoryProvider {
    /**
     * Obtém uma fábrica com base na escolha do tipo.
     */
    public static AbstractFactory getFactory(String choice){
        if("Car".equalsIgnoreCase(choice)){
            return new CarFactory(); // Retorna uma instância de CarFactory se a escolha for "Car"
        }
        if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory(); // Retorna uma instância de ColorFactory se a escolha for "Color"
        }
        return  null; // Retorna null se o tipo não for reconhecido
    }
}
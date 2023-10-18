package tarefa_padroes_de_projeto_1;

/**
 * Classe principal que contém o método main para execução do programa.
 */
public class Main {
    /**
     * Método principal que executa o programa.
     */
    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        // Obtém uma fábrica de carros
        abstractFactory = FactoryProvider.getFactory("Car");
        // Cria um carro específico usando a fábrica e atribui à variável 'car'
        Car car = (Car) abstractFactory.create("Fiat");

        // Obtém uma fábrica de cores
        abstractFactory = FactoryProvider.getFactory("Color");
        // Cria uma cor específica usando a fábrica e atribui à variável 'color'
        Color color = (Color) abstractFactory.create("White");

        // Gera uma string contendo informações sobre o carro e a cor selecionados
        String result = "Carro selecionado: " + car.getCar() + ", com motor: " + car.goEngine() + " e de cor: " + color.getColor();;

        // Imprime o resultado no console
        System.out.println(result);
    }
}
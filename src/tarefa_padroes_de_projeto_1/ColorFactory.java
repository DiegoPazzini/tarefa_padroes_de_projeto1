package tarefa_padroes_de_projeto_1;

/**
 * Implementa a interface AbstractFactory para criar instâncias de objetos Color.
 */
public class ColorFactory implements AbstractFactory <Color> {
    /**
     * Cria um objeto Color com base no tipo fornecido.
     */
    public Color create(String type) {
        if("Red".equalsIgnoreCase(type)){
            return new Red(); // Retorna uma instância de Red se o tipo for "Red"
        }

        if("White".equalsIgnoreCase(type)){
            return new White(); // Retorna uma instância de White se o tipo for "White"
        }

        return null; // Retorna null se o tipo não for reconhecido
    }
}
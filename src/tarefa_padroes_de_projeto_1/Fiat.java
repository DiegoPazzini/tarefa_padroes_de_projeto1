package tarefa_padroes_de_projeto_1;

/**
 * Implementação da interface Car para representar o fabricante Fiat.
 */
public class Fiat implements Car {
    /**
     * Obtém o modelo do carro.
     * @return O nome do modelo do carro (no caso, "Uno").
     */
    @Override
    public String getCar() {
        return "Uno";
    }

    /**
     * Obtém o tipo de motor do carro.
     * @return O tipo de motor do carro (no caso, "Fire-com-escada").
     */
    @Override
    public String goEngine() {
        return "Fire-com-escada";
    }
}
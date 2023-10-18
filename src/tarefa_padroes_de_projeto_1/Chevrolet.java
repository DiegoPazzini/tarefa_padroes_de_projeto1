package tarefa_padroes_de_projeto_1;

/**
 * Implementação da interface Car para o fabricante Chevrolet.
 */
public class Chevrolet implements Car{
    @Override
    public String getCar() {
        return "Onix";
    }

    @Override
    public String goEngine() {
        return "Underground";
    }
}
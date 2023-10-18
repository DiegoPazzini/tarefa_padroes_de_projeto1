package tarefa_padroes_de_projeto_1;

/**
 * Interface para a criação de uma fábrica abstrata que produz objetos de um tipo genérico T.
 * Em Java, o "tipo T" é um parâmetro genérico que representa um tipo de dados não específico. Ele é usado para tornar as classes ou interfaces mais genéricas e reutilizáveis, permitindo que diferentes tipos de dados sejam usados com a mesma estrutura.
 * Ao utilizar "T" como um parâmetro genérico em uma interface ou classe genérica, você está essencialmente criando um marcador que pode ser substituído por qualquer tipo de objeto específico quando a classe ou a interface é implementada ou usada.
 */
public interface AbstractFactory <T>{
    /**
     * Cria um objeto do tipo T com base no tipo fornecido.
     */
    T create(String type);
}

package tarefa_padroes_de_projeto_1;


/**
 * Uma fábrica concreta que implementa a interface AbstractFactory para criar instâncias de objetos Car.
 */
public class CarFactory implements AbstractFactory <Car> {
    /**
     * Cria um objeto Car com base no tipo fornecido. 
     */
    @Override
    public Car create(String type) {
        if("Chevrolet".equalsIgnoreCase(type)){ //o trecho de código dentro do bloco if verifica se o valor da string type é "Chevrolet" independentemente de estar em letras maiúsculas ou minúsculas, usando o método equalsIgnoreCase. Se essa condição for verdadeira, o código cria uma nova instância do objeto Chevrolet
            return new Chevrolet();
        }

        if("Hyundai".equalsIgnoreCase(type)){
            return new Hyundai();
        }

        if("Fiat".equalsIgnoreCase(type)){
            return new Fiat();
        }
        return null;
    }
}
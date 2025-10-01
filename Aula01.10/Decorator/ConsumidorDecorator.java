package Decorator;

public class ConsumidorDecorator {

    public static void main(String[] args) {

        iBebida cafe = new Cafe();
//        System.out.println("Descrição: " + cafe.Descricao());
//        System.out.println("Preço: " + cafe.Preco());

        //ADD Leite ao cafe
        cafe = new AcucarDecorador(cafe);

//        System.out.println("Descrição: " + cafe.Descricao());
//        System.out.println("Preço: " + cafe.Preco());

        cafe = new AcucarDecorador(cafe);

        System.out.println("Descrição: " + cafe.Descricao());
        System.out.println("Preço: " + cafe.Preco());

    }
}

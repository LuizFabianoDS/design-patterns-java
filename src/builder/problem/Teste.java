package builder.problem;

public class Teste
{
    public static void main(String[] args) {

        Animais animal = new Animais.AnimalBuilder().nome("rex").dono("Luiz").raca("Pitbull").builder();
        System.out.println(animal);
    }
}

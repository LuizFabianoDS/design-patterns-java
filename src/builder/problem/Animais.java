package builder.problem;


public class Animais
{
    private String nome;
    private String dono;
    private String raca;

    private Animais(String nome, String dono, String raca) {
        this.nome = nome;
        this.dono = dono;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public String getDono() {
        return dono;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return "Animais{" +
                "nome='" + nome + '\'' +
                ", dono='" + dono + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }

    public static class AnimalBuilder
    {
        private String nome;
        private String dono;
        private String raca;

        public AnimalBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

            public AnimalBuilder dono(String dono) {
            this.dono = dono;
            return this;
        }

        public AnimalBuilder raca(String raca) {
            this.raca = raca;
            return this;
        }

        public Animais builder()
        {
            return new Animais(nome,dono,raca);
        }
    }
}

public class TestarCarro {
    public static void main(String args[]) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.motor = "2.0";
        c1.cor = "Prata";
        c1.marca = "Citroen";

        c2.motor = "1.6";
        c2.cor = "Vermelho";
        c2.marca = "Ford";

        System.out.println("Carro 1:");
        System.out.println("Motor: " + c1.motor);
        System.out.println("Cor: " + c1.cor);
        System.out.println("Marca: " + c1.marca);

        System.out.println();

        System.out.println("Carro 2:");
        System.out.println("Motor: " + c2.motor);
        System.out.println("Cor: " + c2.cor);
        System.out.println("Marca: " + c2.marca);
    }
}

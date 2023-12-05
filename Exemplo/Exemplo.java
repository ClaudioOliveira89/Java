class Exemplo {
    public static void main(String args[]) {
        int i, total = 0;
        int N[] = new int[10];

        if (args.length > 0) {
            try {
                for (i = 0; i < args.length; i++) {
                    N[i] = Integer.parseInt(args[i]);
                    total = total + N[i];
                }
                System.out.println("O Total de números digitados na ordem inversa é: ");
                for (i = args.length - 1; i >= 0; i--) {
                    System.out.print(N[i] + " ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Os argumentos devem ser números inteiros");
            }
        } else {
            System.out.println("Digite pelo menos um número");
        }
    }
}

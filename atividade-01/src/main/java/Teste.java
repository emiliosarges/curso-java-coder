import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Veiculo[] veiculos = new Veiculo[5];

        for (int i = 0; i < veiculos.length; i++) {
            System.out.println("\nCadastro do veículo " + (i + 1));
            Veiculo veiculo = new Veiculo();

            System.out.print("Placa: ");
            veiculo.setPlaca(entrada.nextLine());

            System.out.print("Marca: ");
            veiculo.setMarca(entrada.nextLine());

            System.out.print("Modelo: ");
            veiculo.setModelo(entrada.nextLine());

            System.out.print("Cor: ");
            veiculo.setCor(entrada.nextLine());

            System.out.print("Velocidade máxima (km/h): ");
            veiculo.setVelocMax(entrada.nextFloat());
            entrada.nextLine();
            
            System.out.print("Quantidade de rodas: ");
            veiculo.setQtdRodas(entrada.nextInt());
            entrada.nextLine();
            
            System.out.print("Motor - Quantidade de pistões: ");
            veiculo.setMotorQtdPist(entrada.nextInt());
            entrada.nextLine();
            
            System.out.print("Motor - Potência (cv): ");
            veiculo.setMotorPotencia(entrada.nextInt());
            entrada.nextLine();
            
            veiculos[i] = veiculo;
        }

        System.out.println("\nVeículos cadastrados:");
        for (int i = 0; i < veiculos.length; i++) {
            System.out.println((i + 1) + "º " + veiculos[i]);
        }

        entrada.close();
    }
}

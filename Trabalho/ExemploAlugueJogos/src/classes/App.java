package classes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalSystem rentalSystem = new RentalSystem();

        GameLibrary gameLibrary = new GameLibrary();

        // Adiciona alguns jogos à biblioteca inicial
        gameLibrary.addGame(new Game("The Legend of Zelda", "Nintendo Switch"));
        gameLibrary.addGame(new Game("Super Mario Bros.", "Xbox Series X"));
        gameLibrary.addGame(new Game("Minecraft", "PlayStation 4"));
        // Adicione mais jogos conforme necessário

        // Adiciona alguns clientes ao sistema inicial
        rentalSystem.addCustomer(new Customer("Cliente1"));
        rentalSystem.addCustomer(new Customer("Cliente2"));
        rentalSystem.addCustomer(new Customer("Cliente3"));
        // Adicione mais clientes conforme necessário

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Realizar Aluguel");
            System.out.println("2. Devolver Jogo");
            System.out.println("3. Listar Jogos Disponíveis e Alugados");
            System.out.println("4. Exibir Biblioteca de Jogos");
            System.out.println("5. Incluir Cliente");
            System.out.println("6. Incluir Jogo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Digite o título do jogo a ser alugado: ");
                    String gameTitleToRent = scanner.nextLine();

                    Customer rentCustomer = findCustomer(rentalSystem, customerName);
                    Game rentGame = findGame(gameLibrary, gameTitleToRent);

                    if (rentCustomer != null && rentGame != null) {
                        rentCustomer.rentGame(rentGame);
                        System.out.println("Aluguel realizado com sucesso!");
                    } else {
                        System.out.println("Cliente ou jogo não encontrado. Verifique os nomes.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome do cliente: ");
                    String returnCustomerName = scanner.nextLine();
                    System.out.print("Digite o título do jogo a ser devolvido: ");
                    String gameTitleToReturn = scanner.nextLine();

                    Customer returnCustomer = findCustomer(rentalSystem, returnCustomerName);
                    Game returnGame = findGame(gameLibrary, gameTitleToReturn);

                    if (returnCustomer != null && returnGame != null) {
                        returnCustomer.returnGame(returnGame);
                        System.out.println("Devolução realizada com sucesso!");
                    } else {
                        System.out.println("Cliente ou jogo não encontrado. Verifique os nomes.");
                    }
                    break;
                case 3:
                    System.out.println("Jogos Disponíveis para Aluguel:");
                    gameLibrary.displayAvailableGames();
                    System.out.println("\nJogos Atualmente Alugados:");
                    gameLibrary.displayRentedGames();
                    break;
                case 4:
                    gameLibrary.displayGames();
                    break;
                case 5:
                    System.out.print("Digite o nome do novo cliente: ");
                    String newCustomerName = scanner.nextLine();
                    rentalSystem.addCustomer(new Customer(newCustomerName));
                    System.out.println("Cliente adicionado com sucesso!");
                    break;
                case 6:
                    System.out.print("Digite o título do novo jogo: ");
                    String newGameTitle = scanner.nextLine();
                    System.out.print("Digite o console do novo jogo: ");
                    String newGameConsole = scanner.nextLine();
                    gameLibrary.addGame(new Game(newGameTitle, newGameConsole));
                    System.out.println("Jogo adicionado com sucesso!");
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static Customer findCustomer(RentalSystem rentalSystem, String customerName) {
        for (Customer customer : rentalSystem.getCustomers()) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }

    private static Game findGame(GameLibrary gameLibrary, String gameTitle) {
        for (Game game : gameLibrary.getGames()) {
            if (game.getTitle().equalsIgnoreCase(gameTitle)) {
                return game;
            }
        }
        return null;
    }
}

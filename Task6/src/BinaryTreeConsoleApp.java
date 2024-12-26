import java.util.Scanner;

// Основной класс приложения
public class BinaryTreeConsoleApp {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Binary Search Tree Console App");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert element");
            System.out.println("2. Delete element");
            System.out.println("3. Search for element");
            System.out.println("4. Display tree (In-order traversal)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                // Вставка
                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    tree.insert(insertValue);
                    System.out.println("Value inserted.");
                    break;
                // Удаление
                case 2:
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();
                    tree.delete(deleteValue);
                    System.out.println("Value deleted (if it existed).");
                    break;
                // Поиск
                case 3:
                    System.out.print("Enter value to search for: ");
                    int searchValue = scanner.nextInt();
                    boolean found = tree.search(searchValue);
                    System.out.println(found ? "Value found in the tree." : "Value not found.");
                    break;
                // Обход дерева
                case 4:
                    System.out.println("Tree (In-order traversal):");
                    tree.inOrderTraversal();
                    break;
                // Выход
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
public class App {
    public static void main(String[] args) {
        // Création d'une instance de StorageGenerique pour stocker des entiers
        StorageGenerique<Integer> storageInt = new StorageGenerique<>();

        // Ajout d'éléments
        storageInt.addElement(10);
        storageInt.addElement(20);
        storageInt.addElement(30);

        // Récupération et affichage d'un élément
        System.out.println("Element at index 1: " + storageInt.getElement(1));

        // Suppression d'un élément
        storageInt.removeElement(1);

        // Vérification de la taille
        System.out.println("Size after removal: " + storageInt.getSize());


        // Création d'une instance de StorageGenerique pour stocker des chaînes de caractères
        StorageGenerique<String> storageString = new StorageGenerique<>();

        // Ajout d'éléments
        storageString.addElement("Hello");
        storageString.addElement("World");

        // Récupération et affichage d'un élément
        System.out.println("Element at index 0: " + storageString.getElement(0));

        // Vérification de la taille
        System.out.println("Size: " + storageString.getSize());
    }
}
public class Main {
    public static void main(String[] args){
        Inventory inventory = new ShopInventory(10);
        boolean exit = false;
        while (!exit){
            exit = inventory.runMenu();
        }
    }
}

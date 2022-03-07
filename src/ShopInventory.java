import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopInventory implements Inventory{
    private List<ShopItems> shopItemsList;
    private int maxItems;

    public ShopInventory(int itemsList) {
        super();
        this.shopItemsList = new ArrayList<ShopItems>();
        this.maxItems = itemsList;
    }

    @Override
    public void addItem(ShopItems items) {
        if (shopItemsList.size() < this.maxItems){
            this.shopItemsList.add(items);
        } else{
            System.out.println("Store is full");
        }
    }

    @Override
    public void printItemList() {
        for (ShopItems obj:shopItemsList){
            if (obj instanceof Biscuits){
                System.out.println("Category : Biscuit \nBrand : "+obj.getBrand()+"\nType : "+((Biscuits) obj).getType()+
                        "\nAvailable capacity: "+obj.capacity());
            }
            if (obj instanceof Drinks){
                System.out.println("Category : Biscuit \nBrand : "+obj.getBrand()+"\nType : "+((Drinks) obj).getType()+
                        "\nAvailable capacity: "+obj.capacity());
            } else {
                System.out.println("Error: Request Not Found");
            }
        }
    }

    @Override
    public boolean runMenu() {
        boolean exit = false;
        System.out.println("[1] Add new Item");
        System.out.println("[2] View all Items");
        System.out.println("[3] Exit");
        System.out.print("Enter your choice: ");

        Scanner sc =  new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.print("Enter Dealer Name: ");
                Scanner dn = new Scanner(System.in);
                String dealer = dn.next();

                System.out.println("[1] Add Biscuits");
                System.out.println("[2] Add Drinks");
                System.out.print("Enter your choice: ");
                int choice2 = sc.nextInt();

                System.out.print("Enter product brand name: ");
                String brand = dn.next();

                ShopItems obj = null;
                switch (choice2){
                    case 1:
                        System.out.print("Enter Biscuit type: ");
                        String Btype = dn.next();
                        System.out.print("Enter weight of a one pack: ");
                        int Bweight = sc.nextInt();
                        System.out.print("Enter no of packs issuing: ");
                        int Bamount = sc.nextInt();

                        obj = new Biscuits(brand, dealer, Btype, Bweight, Bamount);

                        break;

                    case 2:
                        System.out.print("Enter Drink type: ");
                        String Dtype = dn.next();
                        System.out.print("Enter volume of a one bottle: ");
                        int Dvolume = sc.nextInt();
                        System.out.print("Enter no of bottles issuing: ");
                        int Damount = sc.nextInt();

                        obj = new Biscuits(brand, dealer, Dtype, Dvolume, Damount);

                        break;

                    default:
                        System.out.println("Please Insert a Valid Response");
                }
                if (obj != null){
                    addItem(obj);
                    System.out.println("Product Added Successfully");
                    System.out.println("No of remaining space: "+(maxItems - shopItemsList.size()) );
                } else {
                    System.out.println("Product Not Added! Please recheck the process");
                }
                break;

            case 2:
                printItemList();
                break;
            case 3:
                exit = true;
                System.out.println(">>>>>>>> Moving out of the application >>>>>>>>");
                break;

            default:
                System.out.println("Please Insert a Valid Response");

        }
        return exit;
    }
}

public class Main {

    public static void main(String[] args) throws EmptySaleException {

        Item item1 = new Item("Snacks" , 3);
        Item item2 = new Item("Cola" , 1);
        Item item3 = new Item("Meat" , 20);

        Sale sale1 = new Sale();
        sale1.setItems(item1);
        sale1.setItems(item2);
        sale1.setItems(item3);

        Sale sale2 = new Sale();

        sale1.calculateTotalPrice();
        sale2.calculateTotalPrice();

        try{
            sale1.getItems().get(10);
        } catch(IndexOutOfBoundsException e){
            System.out.println("The ArrayList size is not long enought");
        }

    }
}
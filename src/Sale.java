import java.util.ArrayList;

public class Sale {

    private ArrayList<Item> items;

    public Sale(){
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    public void setItems(Item item) {
        this.items.add(item);
    }

    public void calculateTotalPrice() throws EmptySaleException{
        int total = 0;

        if(!items.isEmpty()){
            for (Item item : items) {
                total += item.getPrice();
            }
            System.out.println("Total price of the sale is " + total + " €");
        }else{
            throw new EmptySaleException();
        }
    }
}

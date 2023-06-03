public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This notebook is very cheap.");
        }else if(this.price > 600 && this.price > 1000) {
            System.out.println("This price is good");
        }else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight >= 700) {
            System.out.println("This notebook is light");
        }else if (this.weight >= 700 && this.weight <= 1300) {
            System.out.println("This notebook is quite heavy");
        } else {
            System.out.println("This notebook is very heavy");

        }
    }
    public void checkYear() {
        if (this.year >= 2018) {
            System.out.println("This notebook is new");
        }else if (this.year < 2018 && this.year >=2015) {
            System.out.println("This notebook is a little old");
        }else {
            System.out.println("this note book is old");
        }

    }

    public void checkPriceandYear() {
        if (this.year >=2018 && this.price >= 1500) {
            System.out.println("This notebook is new and expensive");
        }else if(this.year <2018 && this.price >=1000) {
            System.out.println("Notebook has good price and It is a little old ");
        }else {
            System.out.println("Notebook is old and quite heavy");
        }
    }
}

public class FirstClass {
    public static void main(String[]args) {
        Notebook notebook = new Notebook(600, 1000, 2015);
        System.out.println(notebook.weight +" "+  notebook.price +" "+ notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkPriceandYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2018);
        System.out.println(heavyNotebook.weight +" "+ heavyNotebook.price +" "+ heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.checkPriceandYear();


        Notebook oldNotebook = new Notebook(1200, 500, 2010);
        System.out.println(oldNotebook.weight +" "+ oldNotebook.price +" "+ oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.checkPriceandYear();
        }
    }

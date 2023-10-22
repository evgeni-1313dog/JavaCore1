package Add;

import Controller.NameController;
import Name.Cons;
import java.util.Scanner;

public class product {
    private NameController nameController;
    private void createName() {

        nameController.saveUser(inputUser());
    }

    private Cons inputUser(){
        String name;
        String price;

            name = prompt("Имя: ");
            price = prompt("Цена: ");

        return  new Cons( name, price);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

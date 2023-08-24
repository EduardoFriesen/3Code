import util.*;

public class Eje1{
    public static void main(String[] args) {
        try {
            Menu menu = new Menu();
            menu.menu();
        } catch (Exception e) {
            System.out.println("Hubo un error");
        }
        
    }
}
import java.util.*;

public class Program {
    public static void main(String[] args) {
        //declarations
        Scanner sc = new Scanner(System.in);
        var list = new BasicSinglyLinkedList();
        String input = "";

        while(true) {
            //if list is empty
            System.out.println("--------------------------------------");
            if(list.isEmpty()) {
                System.out.println("Empty");
            }
            else {
                list.printWholeList();
                System.out.println("");
            }
            System.out.println("--------------------------------------");
            //print menu options and check input
            System.out.println("Menu Options:");
            System.out.println("a - append");
            System.out.println("i - insert");
            System.out.println("r - remove");
            System.out.println("q - quit");
            input = sc.nextLine();
            if(input.equals("q")) {
                break;
            }
            else if(input.equals("a")) {
                //input value and append to end
                System.out.println("Enter value to append:");
                input = sc.nextLine();
                list.append(input);
            }
            else if(input.equals("i")) {
                //declarations
                Node n = list.getFirst();
                int pos;

                //input index of insert and value to insert
                System.out.println("Enter position to insert after (ex. 1 for first position):");
                pos = Integer.parseInt(sc.nextLine());
                System.out.println("Enter value to insert:");
                input = sc.nextLine();

                //loop through to find corresponding node to position
                if(pos == 1) {
                    list.insert(n, input); 
                }
                else {
                    for(int i = 0; i < pos; i++) {
                        n = n.next;
                    }
                    list.insert(n, input);
                }
            }
            else if(input.equals("r")) {
                //delcarations
                Node n = list.getFirst();
                int pos;

                System.out.println("Enter position to remove after:");
                pos = Integer.parseInt(sc.nextLine());
                
                //loop through to find corresponding node to position
                if(pos == 1) {
                    list.removeAfter(n); 
                }
                else {
                    for(int i = 0; i < pos; i++) {
                        n = n.next;
                    }
                    list.removeAfter(n);
                }
            }
        }
        sc.close();
    }
}

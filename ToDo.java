import java.util.*;
public class ToDo {
    public static void main(String[] args) {
    
        Scanner sc =new Scanner(System.in);
        List<String> n =new ArrayList<>();
        int choice;

        do{
            System.out.println("\n1.Add\n2.remove\n3.view\n4.exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                case 1:
                System.out.println("Enter task: ");
                String task=sc.nextLine();
                n.add(task);
                break;

                case 2:
                System.out.println("Enter task to be removed: ");
                String removetask=sc.nextLine();
                n.remove(removetask);
                break;

                case 3:
                System.out.println("Your Tasks: ");
                for(String tasklist:n){
                System.out.println("--"+tasklist);
                }
                break;

                case 4:
                System.out.println("Exiting......");
                break;
        
     default: System.out.println("Plese Enter Valid Option! ");
            }
        }while(choice !=4);
    }
}

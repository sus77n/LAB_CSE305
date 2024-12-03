
import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int type;

        while (true) {
            System.out.println("Please choose your Priority Type: [1] Low  [2] Medium   [3] High");
            type = sc.nextInt();
            sc.nextLine();
            switch (type) {
                case 1:
                    IrequestCreator creator1 = new lowPriorityConcreteCreator();
                    request request1 = creator1.createRequest();
                    break;
                case 2:
                    creator1 = new midPriorityConcreteCreator();
                    request request2 = creator1.createRequest();
                    break;
                case 3:
                    creator1 = new highPriorityConcreteCreator();
                    request request3 = creator1.createRequest();
                    break;
            }
            break;
        }
    }
}

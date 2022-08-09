import ru.netology.sqr.task_6_1_java.services.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int top_border = 1000;
        int bottom_border = 20000;
        int x = service.calcSqr(bottom_border, top_border);
        System.out.print("Count = " + x);
    }
}

import java.util.Scanner;

public class LineRequest {

    String question;
    String answer;
    boolean isValid;

    public LineRequest(String question) {
        this.question = question;
        this.isValid = false;
        this.answer = "";
    }

    public void askQuestion() {
        System.out.println(this.question);
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (checkValidity(answer)) {
            this.answer = answer;
            this.isValid = true;
        }
    }

    private boolean checkValidity(String answer) {
        if (!answer.isEmpty() && answer != null && answer != "\n" && answer != "") {
            return true;
        }
        return false;
    }


}

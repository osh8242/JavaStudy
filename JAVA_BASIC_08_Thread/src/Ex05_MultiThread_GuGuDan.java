import java.util.ArrayList;
import java.util.List;

class QuizInfo {
    String question;
    int answer;
    String result;

    public QuizInfo(String question, int answer, String result) {
        this.question = question;
        this.answer = answer;
        this.result = result;
    }

    public String toString() {
        return "문제:" + this.question + " 답:" + this.answer + "결과:" + this.result;
    }
}

public class Ex05_MultiThread_GuGuDan {

    public static void main(String[] args) {
        List<QuizInfo> QuizUserInfo = new ArrayList<QuizInfo>();

        //hint_2



        for (int i = 0; i < QuizUserInfo.size(); i++) {
            System.out.println(QuizUserInfo.get(i).toString());
        }

    }

}


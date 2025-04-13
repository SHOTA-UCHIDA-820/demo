public class ConditionBranch {

    public void outputScore(int score) {
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public void outputMenu(int menuNo) {
        switch (menuNo) {
            case 10:
                System.out.println("うどん");
                break;
            case 20:
                System.out.println("そば");
                break;
            case 30:
                System.out.println("パスタ");
                break;
            case 40:
                System.out.println("ご飯");
                break;
            default:
                System.out.println("その他");
                break;
        }
    }
}

public class pendivision {
    public static void main(String[] args) {
        int totalpens = 14;
        int students = 3;

        int pensPerStudent = totalpens / students;
        int remainingPens = totalpens % students;

        System.out.println("the pen per student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}

package pro.studios_21.ocp_17_prep.learning;

public class Chapter01 {
    private int numForks;
    String color;
    long age;

    public void Chapter01() {
        color = "blue";
        age = 1200;
    }

    public static void main(String[] args) {
        var c01 = new Chapter01();
        c01.q07_StringTripleQuotationProblem();

    }

    private void q07_StringTripleQuotationProblem() {
        int numKnives;
        System.out.println("""
                "# forks = " + numForks +
                    "# knives = " + numKnives +
                # cups = 0""");
    }

    private void q08_VarCompilationProblem() {
//        var spring = null;
        var fall = "leaves";
//        var evening = 2; evening = null;
        var night = Integer.valueOf(3);
        var day = 1/0;
//        var winter = 12, cold = 13;
        var morning = ""; morning = null;
    }

    private void q10_VarNumberUnderscorePlacementProblem() {
        var magic = 3_1;
//        var magic2 = 1_329_.0;
//        var magic3 = 3_13.0_
//        var magic4 = 5_291._2;
        var magic5 = 2_234.0_0;
        var magic6 = 9____6;
//        var magic7 = _1_3_5_0;
    }

    private void q19_VarWrappers() {
        var num1 = Long.parseLong("100");
        var num2 = Long.valueOf("100");
    }

    private void q20_InstantiationTrickery() {}


}

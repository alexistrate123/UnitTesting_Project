package classes;

public class Credits {
    public static String approveCredit(int creditScore) {
        return creditScore < 550 ? "Declined" : creditScore >= 550 && creditScore <= 675 ? "Maybe" : creditScore > 675 ?
                "We look forward to doing business with you!": "Acestea sunt litere nu cifre";
    }


}

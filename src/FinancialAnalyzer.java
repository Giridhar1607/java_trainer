public class FinancialAnalyzer {
    public double calculateinterest(double principal,double rate, int years){
        return (principal* rate * years)/100.0;
    }
    public double applyBonus(double interest,boolean isLoyal) {
            return isLoyal ? interest + 50.0 : interest;
    }
    public void  displayMetrics(double finalAmount){
        System.out.println(finalAmount);
    }

    public static void main(String[] args){
        FinancialAnalyzer analyzer = new FinancialAnalyzer();
        double principal =1000.0;
        double rate=5.0;
        int years= 3;
        boolean isLoyal=true;

        double interest = analyzer.calculateinterest(principal,rate,years);
        double finalAmount =analyzer.applyBonus(interest,isLoyal);
        analyzer.displayMetrics(finalAmount);
    }
}

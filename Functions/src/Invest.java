public class Invest {
    public static void main(String[] args) {

        double investPrice = 1000d;
        double interestPercentPerYear = 10d;
        int years = 5;
        double yearFutureValueOfInvestment = getFutureInvestmentYearBase(investPrice, interestPercentPerYear);
        double totalFutureValueOfInvestment = yearFutureValueOfInvestment * years;

        System.out.println("Invest price is " + investPrice + ", interest is " + interestPercentPerYear + ", years are " + years);
        System.out.println("Investment price for 1 month is " + (yearFutureValueOfInvestment / 12));
        System.out.println("Investment price for 1 years is " + (yearFutureValueOfInvestment));
        System.out.println("Investment price for " + years + " years is " + totalFutureValueOfInvestment);


    }

    private static double getFutureInvestmentYearBase(double investPrice, double increasePercentPerYear) {
        return investPrice + ((increasePercentPerYear / 100) * investPrice);
    }


}
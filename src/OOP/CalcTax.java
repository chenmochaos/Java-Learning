package OOP;

public class CalcTax {
    public static void main(String[] args) {
        Income[] incomes = new Income[]{
                new Royalty(3000),
                new Salary(7500)
        };
        System.out.println(CalcTax(incomes));
    }

    public static double CalcTax(Income... incomes) {
        double Tax = 0;
        for (Income income : incomes) {
            Tax += income.getTax();
        }
        return Tax;
    }
}

interface Income {
    double getTax();
}

class Salary implements Income {
    double income;

    public Salary(double income) {
        this.income = income;
    }

    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class Royalty implements Income {
    double income;

    public Royalty(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.3;
    }
}
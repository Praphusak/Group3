package utility;

/**
 * Created by CHEULONG on 3/11/2017.
 */
public class Currency {

    public double exchange(String sourceCurrrency, double amount, String targetCurrency) {
        double exchangeCurrency = 0.0;
        if (!sourceCurrrency.equalsIgnoreCase("USD") && (!targetCurrency.equalsIgnoreCase("USD"))) {
            if (sourceCurrrency.equalsIgnoreCase("THB")) {
                exchangeCurrency = (amount / 33) * 1.01;
            } else exchangeCurrency = (amount / 1.01) * 33;
        } else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("THB")) {
            exchangeCurrency = amount * 33;
<<<<<<< HEAD
            // target currency is EUR
        } else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("EUR"))
            exchangeCurrency = amount * 1.01;

            // source currency is THB
        else if (sourceCurrrency.equalsIgnoreCase("THB") && (targetCurrency.equalsIgnoreCase("USD")))
            exchangeCurrency = amount / 33;

            // target currency is THB
        else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("THB")) {
            exchangeCurrency = amount * 33;
=======
<<<<<<< HEAD
>>>>>>> ced373e2c83d14b2202fca95c000e74b0b1b3ae7
            // target currency is EUR
        } else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("EUR"))
            exchangeCurrency = amount * 1.01;

            // source currency is THB
<<<<<<< HEAD
=======
        else if (sourceCurrrency.equalsIgnoreCase("THB") && (targetCurrency.equalsIgnoreCase("USD")))
            exchangeCurrency = amount / 33;

            // target currency is THB
        else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("THB")) {
            exchangeCurrency = amount * 33;
=======
>>>>>>> 5d1e79dc72f3a9fa26df5454d69f558b4e4388c8
            // target currency is EUR
        } else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("EUR"))
            exchangeCurrency = amount * 1.01;

            // source currency is THB
<<<<<<< HEAD
>>>>>>> ced373e2c83d14b2202fca95c000e74b0b1b3ae7
        else if (sourceCurrrency.equalsIgnoreCase("THB") && (targetCurrency.equalsIgnoreCase("USD"))) {
            exchangeCurrency = amount / 33;

            // source currency is EUR
        } else if (sourceCurrrency.equalsIgnoreCase("EUR") && (targetCurrency.equalsIgnoreCase("USD")))
            exchangeCurrency = amount / 1.01;
        return exchangeCurrency;


    }
=======
        else if (sourceCurrrency.equalsIgnoreCase("THB") && (targetCurrency.equalsIgnoreCase("USD")))
            exchangeCurrency = amount / 33;
>>>>>>> 5d1e79dc72f3a9fa26df5454d69f558b4e4388c8

            // target currency is THB
       else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("THB")) {
                exchangeCurrency = amount * 33;
                // target currency is EUR
            } else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("EUR"))
                exchangeCurrency = amount * 1.01;

<<<<<<< HEAD


=======
<<<<<<< HEAD
=======
                // source currency is THB
            else if (sourceCurrrency.equalsIgnoreCase("THB") && (targetCurrency.equalsIgnoreCase("USD"))) {
                exchangeCurrency = amount / 33;

                // source currency is EUR
            } else if (sourceCurrrency.equalsIgnoreCase("EUR") && (targetCurrency.equalsIgnoreCase("USD")))
                exchangeCurrency = amount / 1.01;
            return exchangeCurrency;


        }
>>>>>>> 5d1e79dc72f3a9fa26df5454d69f558b4e4388c8


<<<<<<< HEAD
=======
}

>>>>>>> 5d1e79dc72f3a9fa26df5454d69f558b4e4388c8
>>>>>>> ced373e2c83d14b2202fca95c000e74b0b1b3ae7

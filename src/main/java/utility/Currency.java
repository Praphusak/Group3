package utility;

/**
 * Created by CHEULONG on 3/11/2017.
 */
public class Currency {
    public double exchange(String sourceCurrrency,double amount,String targetCurrency) {
        double exchangeCurrency=0.0;

    // target currency is THB
        if(targetCurrency.equalsIgnoreCase("THB")){
        exchangeCurrency=amount*33;
        // target currency is EUR
    }else exchangeCurrency=amount*1.01;
        return exchangeCurrency;
    }
}

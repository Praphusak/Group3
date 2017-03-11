package utility;

/**
 * Created by CHEULONG on 3/11/2017.
 */
public class Currency {
    public double exchange(String sourceCurrrency,double amount,String targetCurrency){
        double exchangeCurrency=0.0;
        // source currency is THB
        if(sourceCurrrency.equalsIgnoreCase("THB")){
           exchangeCurrency=amount/33;
            // source currency is EUR
        }else exchangeCurrency=amount/1.01;
        return exchangeCurrency;
    }
}

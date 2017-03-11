package utility;

/**
 * Created by CHEULONG on 3/11/2017.
 */
public class Currency {
<<<<<<< HEAD
    public double exchange(String sourceCurrrency,double amount,String targetCurrency) {
        double exchangeCurrency=0.0;

    // target currency is THB
        if(targetCurrency.equalsIgnoreCase("THB")){
        exchangeCurrency=amount*33;
        // target currency is EUR
    }else exchangeCurrency=amount*1.01;
=======
    public double exchange(String sourceCurrrency,double amount,String targetCurrency){
        double exchangeCurrency=0.0;
        // source currency is THB
        if(sourceCurrrency.equalsIgnoreCase("THB")){
           exchangeCurrency=amount/33;
            // source currency is EUR
        }else exchangeCurrency=amount/1.01;
>>>>>>> e825af2d6faeeb35738cd6cc039344abdffa8ec4
        return exchangeCurrency;
    }
}

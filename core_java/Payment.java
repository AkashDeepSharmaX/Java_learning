abstract class PaymentMeth{
    public void validation(){
        System.out.println("validating....");
    }
    public abstract void executePayment(int amount);
}
class CreditCard extends PaymentMeth{
    @Override
    public void executePayment(int amount){
        System.out.println("Crdit card Payment $" +amount);
    }
}
    class Paypal extends PaymentMeth{
        @Override
    public void executePayment(int amount){
        System.out.println("PayPal Payment $" +amount);
    }
}
public class Payment{
    public static void main(String []args){
        PaymentMeth payment=new CreditCard();
        payment.validation();
        payment.executePayment(100);
        
                PaymentMeth payment1=new Paypal();
   payment1.validation();
        payment1.executePayment(170);


    }
}

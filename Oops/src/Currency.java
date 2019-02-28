@FunctionalInterface
public interface Currency {
double dollarValue();
static  void convert(Currency source,Currency target,double amount) {
	double rate= target.dollarValue()/source.dollarValue();
	System.out.println("result:"+(amount*rate));
}
static Currency INR=()->70.50;
static Currency USD=()->1.0;



}

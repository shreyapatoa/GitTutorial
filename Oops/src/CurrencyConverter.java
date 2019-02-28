
public class CurrencyConverter {
public void convert(Currency source,Currency target,double amount) {
	double rate= target.dollarValue()/source.dollarValue();
	System.out.println("result:"+(amount*rate));
}
}

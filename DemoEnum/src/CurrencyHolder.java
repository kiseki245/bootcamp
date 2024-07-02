public class CurrencyHolder {
  private String currency;
	private int DBValue;
	
	public CurrencyHolder(String currency, int DBValue){
		this.currency = currency;
		this.DBValue = DBValue;
}

public boolean isHKD(String currency){
	return "HKD".equals(this.currency);
}


public static void main(String[] args){
  //1. Cannot guarrantee there is ONLY one HKD object in memory
	CurrencyHolder h1 = new CurrencyHolder("HKD", 1);
	CurrencyHolder h1 = new CurrencyHolder("USD", 2);

  //2. String is not a good idea to represent a parameter that with finite numbers of object

  // valueOf
}


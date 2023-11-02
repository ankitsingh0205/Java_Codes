// Binary to Decimal
class Binary{
	public static void bintodec(int binnum){
	int power=0;
	int decimal=0;

	while(binnum>0){
	int lastdigit=binnum%10;
	decimal=decimal+(lastdigit*(int)Math.pow(2,pow));
	pow++;
	binnum=binnum/10;
	}
	System.out.println("decimal of"+binnum+"="+decimal);
	}
	public static void main (String[]args){
		bintodec(101);
	}
}
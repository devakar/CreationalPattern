package builder;

public class LunchOrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LunchOrder.Builder builder = new LunchOrder.Builder();
		
		builder.bread("wheat").condiments("lettuce").dressing("moyo").meat("turkey");
		
		LunchOrder lunchOrder=builder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
		
	}

}

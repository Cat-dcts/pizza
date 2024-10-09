package pizza;

public class Delivered extends Pizza{

	public static final int DELIVERED = 2;
	
	public boolean deliver() {

		if (state == COOKED) {
			return false; // Can't deliver a pizza not baked yet;
		} else if (state == BAKED) {
			state = DELIVERED;
		} else if (state == DELIVERED) {
			return false; // Can't deliver a pizza already delivered;
		}

		return true;
	}
}

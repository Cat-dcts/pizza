package pizza;

public class Baked extends Pizza{

	public static final int BAKED = 1;
	
	public boolean bake() {

		if (state == COOKED) {
			state = BAKED;
		} else if (state == BAKED) {
			return false; // Can't bake a pizza already baked !
		} else if (state == DELIVERED) {
			return false; // Can't bake a pizza already delivered !
		}

		return true;

	}
}


public class AlreadyReservedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "The ticket is already reserved.\n";
	}
	

}

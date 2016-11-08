package rblemmatizer;

import java.util.HashMap;
import java.util.Map;

/**
 * Exceptions of noun types.
 * 
 * @author themis
 */
public class NounExceptions {

	/**
	 * Exceptions of noun types.
	 */
	public static final Map<String, String> exceptions;
	static {
		exceptions = new HashMap<String, String>();
		exceptions.put("men", "man");
		exceptions.put("women", "woman");
		exceptions.put("children", "child");
	}

}

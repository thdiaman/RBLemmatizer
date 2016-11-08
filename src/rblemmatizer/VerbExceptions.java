package rblemmatizer;

import java.util.HashMap;
import java.util.Map;

/**
 * Exceptions of verb types.
 * 
 * @author themis
 */
public class VerbExceptions {

	/**
	 * Exceptions of verb types.
	 */
	public static final Map<String, String> exceptions;
	static {
		exceptions = new HashMap<String, String>();
		exceptions.put("caught", "catch");
		exceptions.put("been", "be");
		exceptions.put("thought", "think");
		exceptions.put("told", "tell");
		exceptions.put("spoke", "speak");
		exceptions.put("stood", "stand");
		exceptions.put("led", "lead");
		exceptions.put("lost", "lose");
		exceptions.put("drawn", "draw");
		exceptions.put("ran", "run");
		exceptions.put("went", "go");
		exceptions.put("broke", "break");
		exceptions.put("began", "begin");
		exceptions.put("made", "make");
		exceptions.put("left", "leave");
		exceptions.put("gave", "give");
		exceptions.put("brought", "bring");
		exceptions.put("hoped", "hope");
		exceptions.put("fell", "fall");
		exceptions.put("found", "find");
		exceptions.put("known", "know");
		exceptions.put("came", "come");
		exceptions.put("grown", "grow");
		exceptions.put("meant", "mean");
		exceptions.put("broken", "break");
		exceptions.put("bought", "buy");
		exceptions.put("knew", "know");
		exceptions.put("taught", "teach");
		exceptions.put("understood", "understand");
		exceptions.put("did", "do");
		exceptions.put("begun", "begin");
		exceptions.put("had", "have");
		exceptions.put("got", "get");
		exceptions.put("ate", "eat");
		exceptions.put("shown", "show");
		exceptions.put("won", "win");
		exceptions.put("written", "write");
		exceptions.put("took", "take");
		exceptions.put("wrote", "write");
		exceptions.put("felt", "feel");
		exceptions.put("done", "do");
		exceptions.put("sent", "send");
		exceptions.put("gone", "go");
		exceptions.put("chosen", "choose");
		exceptions.put("were", "be");
		exceptions.put("eaten", "eat");
		exceptions.put("became", "become");
		exceptions.put("died", "die");
		exceptions.put("chose", "choose");
		exceptions.put("said", "say");
		exceptions.put("met", "meet");
		exceptions.put("heard", "hear");
		exceptions.put("sold", "sell");
		exceptions.put("built", "build");
		exceptions.put("sat", "sit");
		exceptions.put("spent", "spend");
		exceptions.put("saw", "see");
		exceptions.put("kept", "keep");
		exceptions.put("grew", "grow");
		exceptions.put("drew", "draw");
		exceptions.put("fallen", "fall");
		exceptions.put("paid", "pay");
		exceptions.put("spoken", "speak");
	}

}

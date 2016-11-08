package rblemmatizer;

/**
 * Tests the lemmatizer class.
 * 
 * @author themis
 */
public class LemmatizerTest {

	/**
	 * Provides tests for the lemmatizer class.
	 * 
	 * @param args unused parameter.
	 */
	public static void main(String[] args) {
		String exampleNoun = "businesses";
		System.out.println(exampleNoun + " --> " + Lemmatizer.getLemmaOfNoun(exampleNoun));
		String exampleVerb = "creating";
		System.out.println(exampleVerb + " --> " + Lemmatizer.getLemmaOfVerb(exampleVerb));
	}
}

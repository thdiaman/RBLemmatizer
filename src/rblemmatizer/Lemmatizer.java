package rblemmatizer;

/**
 * A lemmatizer for english language words.
 * 
 * @author themis
 */
public class Lemmatizer {

	/**
	 * Finds the lemma of a noun given as input.
	 * 
	 * @param word the noun to be lemmatized.
	 * @return the lemma of the noun.
	 */
	public static String getLemmaOfNoun(String word) {
		word = word.toLowerCase();
		int wordLength = word.length();
		if (NounExceptions.exceptions.containsKey(word))
			return NounExceptions.exceptions.get(word);
		else if (word.endsWith("sses") || word.endsWith("xes") || word.endsWith("shes") || word.endsWith("ches")
				|| word.endsWith("lles"))
			return word.substring(0, wordLength - 2);
		else if (word.endsWith("ces") || word.endsWith("ses") || word.endsWith("tes") || word.endsWith("nges")
				|| word.endsWith("mes") || word.endsWith("nes") || word.endsWith("des") || word.endsWith("ges")
				|| word.endsWith("les"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("ves"))
			return word.substring(0, wordLength - 3) + "fe";
		else if (word.endsWith("yes"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("ies"))
			return word.substring(0, wordLength - 3) + "y";
		else if (word.endsWith("ues"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("es"))
			return word.substring(0, wordLength - 2);
		else if (word.endsWith("ss"))
			return word;
		else if (word.endsWith("s"))
			return word.substring(0, wordLength - 1);
		else
			return word;
	}

	/**
	 * Finds the lemma of a verb given as input.
	 * 
	 * @param word the verb to be lemmatized.
	 * @return the lemma of the verb.
	 */
	public static String getLemmaOfVerb(String word) {
		word = word.toLowerCase();
		int wordLength = word.length();
		if (VerbExceptions.exceptions.containsKey(word))
			return VerbExceptions.exceptions.get(word);
		else if (word.endsWith("ied"))
			return word.substring(0, wordLength - 3) + "y";
		else if (word.endsWith("ssed") || word.endsWith("xed") || word.endsWith("shed") || word.endsWith("ched")
				|| word.endsWith("lled"))
			return word.substring(0, wordLength - 2);
		else if (word.endsWith("eed"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("ed") // Handles double consonants, e.g. stopped --> stop
				&& wordLength > 4 && word.substring(wordLength - 4, wordLength - 3)
						.equals(word.substring(wordLength - 3, wordLength - 2)))
			return word.substring(0, wordLength - 3);
		else if (word.endsWith("eeded") || word.endsWith("nted") || word.endsWith("rted") || word.endsWith("sted")
				|| word.endsWith("red") || word.endsWith("yed") || word.endsWith("wed") || word.endsWith("ned")
				|| word.endsWith("ked") || word.endsWith("med") || word.endsWith("ped") || word.endsWith("oed"))
			return word.substring(0, wordLength - 2);
		else if (word.endsWith("ed"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("en"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("ies"))
			return word.substring(0, wordLength - 3) + "y";
		else if (word.endsWith("sses") || word.endsWith("xes") || word.endsWith("shes") || word.endsWith("ches")
				|| word.endsWith("lles") || word.endsWith("oes"))
			return word.substring(0, wordLength - 2);
		else if (word.endsWith("s"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("ssing") || word.endsWith("xing") || word.endsWith("shing") || word.endsWith("ching")
				|| word.endsWith("lling") || word.endsWith("oing") || word.endsWith("eeing") || word.endsWith("inging"))
			return word.substring(0, wordLength - 3);
		else if (word.endsWith("ing") // Handles double consonants, e.g. stopping --> stop
				&& wordLength > 5 && word.substring(wordLength - 5, wordLength - 4)
						.equals(word.substring(wordLength - 4, wordLength - 3)))
			return word.substring(0, wordLength - 4);
		else if (word.endsWith("eaking"))
			return word.substring(0, wordLength - 3);
		else if (word.endsWith("aking") || word.endsWith("ating") || word.endsWith("iking") || word.endsWith("iting"))
			return word.substring(0, wordLength - 3) + "e";
		else if (word.endsWith("eeding") || word.endsWith("nting") || word.endsWith("rting") || word.endsWith("sting")
				|| word.endsWith("ring") || word.endsWith("ying") || word.endsWith("wing") || word.endsWith("ning")
				|| word.endsWith("king") || word.endsWith("oing") || word.endsWith("oping") || word.endsWith("lping")
				|| word.endsWith("eting") || word.endsWith("uting") || word.endsWith("iting") || word.endsWith("ating")
				|| word.endsWith("lding") || word.endsWith("nding") || word.endsWith("ading") || word.endsWith("eeming")
				|| word.endsWith("eeping"))
			return word.substring(0, wordLength - 3);
		else if (word.endsWith("ing"))
			return word.substring(0, wordLength - 3) + "e";
		return word;
	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestRepeatedSubstring {

	static int matchedPrefixCount(String a, String b) {
		int count = 0;
		int l = Math.min(a.length(), b.length());
		for (int i = 0; i < l; i++) {
			if (a.charAt(i) == b.charAt(i)) {
				count++;
			} else {
				break;
			}
		}
		return count;
	}

	public static void main(String args[]) {

		System.out.println("Longest Repeated Substring = " + longestReaptedSubstring("ABRACADABRA"));
		System.out.println();
		System.out.println("Longest Repeated Substring = " + longestReaptedSubstring("ABABBAABAA"));

	}

	private static String longestReaptedSubstring(String s) {
		System.out.println("String = " + s);
		List<String> suffix = new ArrayList<>();
		for (int i = s.length() - 1; i >= 0; i--) {
			suffix.add(s.substring(i));
		}
		Collections.sort(suffix);
		List<Integer> lcp = new ArrayList<>();
		lcp.add(0);
		int maxLen = 0;
		for (int i = 1; i < suffix.size(); i++) {
			lcp.add(matchedPrefixCount(suffix.get(i), suffix.get(i - 1)));
			maxLen = Math.max(maxLen, lcp.get(i));
		}
		String longestRepeatedSubstring = "";
		System.out.println("LCP | SUFFIX");
		for (int i = 0; i < suffix.size(); i++) {
			System.out.println(lcp.get(i) + " | " + suffix.get(i));
			if (lcp.get(i) == maxLen) {
				longestRepeatedSubstring = suffix.get(i).substring(0, maxLen);
			}
		}
		return longestRepeatedSubstring;
	}
}

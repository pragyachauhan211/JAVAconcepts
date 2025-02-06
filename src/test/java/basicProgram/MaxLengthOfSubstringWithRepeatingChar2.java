package basicProgram;

public class MaxLengthOfSubstringWithRepeatingChar2 {

	// first non repeating character in a string

	public void shift() {
		String name = "abcccccdefgh";

		int result = 0;

		//for (int i = 0; i < name.length(); i++) {
			boolean[] visited = new boolean[256];
			for (int j = 0; j < name.length(); j++) {

				if (visited[name.charAt(j)]) {
					// If current character is visited,
					// Break the loop
					// System.out.println(name.charAt(j));
					break;

				} else {
					// Else update the result if this
					// window is larger, and mark current
					// character as visited.
					result = Math.max(result, j  + 1);
					visited[name.charAt(j)] = true;

				}
			}
		//}
		System.out.println(result);
	}

	public static void main(String[] args) {
		MaxLengthOfSubstringWithRepeatingChar2 p = new MaxLengthOfSubstringWithRepeatingChar2();
		p.shift();

	}

}

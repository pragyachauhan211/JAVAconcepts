package basicProgram;

public class MaxLengthOfSubstringWithRepeatingChar1 {

	public void shift() {
		String name = "my name is pragya kumari";

		int result = 0;

		for (int i = 0; i < name.length(); i++) {
			boolean[] visited = new boolean[256];
			for (int j = i; j < name.length(); j++) {

				if (visited[name.charAt(j)]) {
					// If current character is visited,
					// Break the loop
					// System.out.println(name.charAt(j));
					break;

				} else {
					// Else update the result if this
					// window is larger, and mark current
					// character as visited.
					result = Math.max(result, j - i + 1);
					visited[name.charAt(j)] = true;
				}
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		MaxLengthOfSubstringWithRepeatingChar1 p = new MaxLengthOfSubstringWithRepeatingChar1();
		p.shift();

	}

}

public class API {
	public static void main(String[] args) {
		int[] heights = {20, 10, 40, 30};
		java.util.Arrays.sort(heights); // Javaが備えている並べ替えの命令
		for (int a : heights) {
			System.out.println(a);
		}
	}
}

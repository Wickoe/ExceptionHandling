package opgave5;

public class TestFilUtil {
	public static void main(String[] args) {
		System.out.println("Maximum of all integers in file containing 10 integers");
		System.out.println(FilUtil.max("fileNameSmall.txt"));
		System.out.println("--------------------------------------------------------");
		System.out.println("Minimum of all intergs in file containing 10 integers");
		System.out.println(FilUtil.min("fileNameSmall.txt"));
		System.out.println("--------------------------------------------------------");
		System.out.println("Average of all integers in file containing 10 integers");
		System.out.println(FilUtil.gennemsnit("fileNameSmall.txt"));
		System.out.println("--------------------------------------------------------");
		System.out.println("Maximum of all integers in file containing 2500 integers");
		System.out.println(FilUtil.max("fileNameLarge.txt"));
		System.out.println("--------------------------------------------------------");
		System.out.println("Minimum of all intergs in file containing 2500 integers");
		System.out.println(FilUtil.min("fileNameLarge.txt"));
		System.out.println("--------------------------------------------------------");
		System.out.println("Average of all integers in file containing 2500 integers");
		System.out.println(FilUtil.gennemsnit("fileNameLarge.txt"));
	}
}
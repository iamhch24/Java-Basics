package loopeaxample;

public class ChristmasTree {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String star ="*";
		String line ="";
		
		for(int i= 1;i<=5;i++) {
			line ="";
			for(int j=0;j<=5-i;j++) {
				line += "  ";
			}
			System.out.println(line+star+line);
			star += " * *";
			
		}

		for(int z= 1;z<=3;z++) {
			System.out.println("         | |");
		}
		
	}

}

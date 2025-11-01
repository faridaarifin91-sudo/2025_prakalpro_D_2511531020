package pekan5;

public class tugasnastedfor {
	public static void main(String[] args) {
		
        int n = 4; 
        for(int i = 0; i < n * 2 + 2; i++){
            for(int j = 0; j < n * 4 + 2; j++){
                if(i < 1 || i > n * 2){
                    if(j < 1 || j > n * 4){
                        System.out.print("#");
                    }
                    else{
                        System.out.print("=");
                    }
                }
                else{
                   if(j < 1 || j > n * 4){
                        System.out.print("|");
                    }
                    else{
                        int d = Math.min(i,2 * n - i + 1);
                        if(j == 2 * n - 2 * d + 1 || j == 2 * n + 2 * d - 1){
                            System.out.print("<>");
                            j++;
                        }
                        else if(j > 2 * n - 2 * d + 2 && j < 2 * n + 2 * d - 1){
                            System.out.print(".");
                        }
                        else{
                            System.out.print(" ");
                        }
                    } 
                }
            }
            System.out.print("\n");
        }
  }
}



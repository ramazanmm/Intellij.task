//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n=5;

        for (int i=4; 0<=i ; i--){
            for (int a=n-i; a>1; a--){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
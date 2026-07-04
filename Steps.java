public class Steps {

    public static void printSteps(int n , String path){
        if(n<1){
            System.out.println(path);
            return;
        }

        printSteps(n-1 , path+"1");
        printSteps(n-2 , path+"2");
        
    }

    public static void main(String[] args){
        int steps = 5;
        printSteps(steps , "");
    }
}

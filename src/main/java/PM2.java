public class PM2{
    public static void main(String[] args){
        System.out.println("Running….");
        for (int i =0; i <10000000000L; i++) {
            System.out.println("Step: "+ i);
        }
        try{
            Thread.sleep(1000*10);
        }catch (Exception e) {
            System.out.println("Error");
        }
    }
}
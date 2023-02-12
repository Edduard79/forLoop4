public class CustomNumber {
    private double number;

    public CustomNumber() {

        int max = 12;
        int min = 1;

        this.number = Math.floor(Math.random() * (max - min + 1) + min);  //Random generator

        System.out.println("\nRandom num: " + this.number + "\n");
    }

    public void getMultiplicationTable(){

        for(int i = 12; i >= 1; i--){

            System.out.println("Molt: " + i * this.number);

        }
    }
}

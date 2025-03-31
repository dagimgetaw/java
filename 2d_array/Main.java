public class Main {
    public static void main(String[] args) {

        String[][] collections = {{"ferrari","g wagon", "bugatti","rolls royce"},
                                  {"bmw","ford"},
                                  {"tesla","kia"}};
        
        for (String[] cars : collections) {
            for (String car : cars) {
                System.out.print(car + " ");
            }
            System.out.println("");
        }
    }
}
public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 5.5;
        double lattePrice = 6.5;
        double cappuccinoPrice = 4.2;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(displayTotalMessage + dripCoffeePrice);
    	// ** Your customer interaction print statements will go here ** //

        System.out.println(generalGreeting + customer4); // Displays "Welcome to Cafe Java, Noah"
            if(isReadyOrder4) {
                System.out.println(pendingMessage);
            }
            else {
                System.out.println(customer4 + readyMessage);
            }


        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + lattePrice * 2); 
            if (isReadyOrder3) {
                System.out.println(customer2 + pendingMessage);
            }
            else {
                System.out.println(customer2 + readyMessage);
            }

        System.out.println(displayTotalMessage + (lattePrice -= dripCoffeePrice)); 

    }
}
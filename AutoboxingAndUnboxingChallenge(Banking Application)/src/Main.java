public class Main {
    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("National Australia Bank");

        if(bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide ", "Harry", 60.40);
        bank.addCustomer("Adelaide", "Mike", 165.87);
        bank.addCustomer("Adelaide", "Abdoulie", 1234.53);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Mike", 345.98);

        bank.addCustomerTransaction("Adelaide", "Mike", 55.43);
        bank.addCustomerTransaction("Adelaide", "Abdoulie", 13.44);
        bank.addCustomerTransaction("Adelaide", "Harry", 25.43);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brain", 4.55));
        {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 54.66));
        System.out.println("Customer does not exist at branch");

        if(!bank.addCustomer("Adelaide", "Abdoulie", 13.45)) {
            System.out.println("Customer Abdoulie already exists");
        }







    }
}

/*
 * For this exercise, you will be completing the Account class, which simulates a regular bank account, 
 * then using overrides and calls to the superclass to create a StudentAccount.

 * Student accounts differ from regular accounts in that they get a bonus $1 for every deposit, 
 * but a $2 fee for every withdrawal. You will override the methods in the StudentAccount by calling 
 * the superclass methods with the additonal amount or fee incorporated since the balance is not directly stored in the StudentAccount object.

 * You will also update the toString, as outlined in the comments.

 * When completed, create one student account and one regular account for testing. Deposit and withdraw money and print the results.

 */

 public class BankTester
{
    public static void main(String[] args)
    {
        Account a1 = new Account("Bobby", 30.00);
        Account a2 = new StudentAccount("Milly", 20.00);
        
        a1.deposit(120.00);
        a2.deposit(30.00);
        
        a1.withdrawal(40.00);
        a2.withdrawal(15.00);
        
        System.out.println(a1);
        System.out.println(a2);
    }
}
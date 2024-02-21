/*
 * Your company is doing some data cleanup, and notices that the email list of all users has been getting outdated. For one, there are some users with repeat email addresses, and some of the email accounts no longer exist.

 * Your job is to create a series of methods that can purge some of the old data from the existing email list.

 * Create static methods in the DataPurge class that can do the following:

    ** removeDuplicates This method takes an email list, and removes the duplicate email values. It also prints to the console which duplicate emails have been removed.
    
    ** removeAOL This method removes all email addresses from a list that are from aol.com. It notifies the user which email addresses are being removed as well.
    
    ** containsOnlyEmails This method returns true if all of the data in the email list is actually an email address. We will define something as an email address if it contains the characters @ and .

 * Test your methods out in the DataPurgeTester file. You don’t have to change anything there, but the methods should work accordingly!

 */

import java.util.ArrayList;

public class UserDataCleanupTester
{
    public static void main(String[] args)
    {
        ArrayList<String> emails = new ArrayList<String>();
        addEmails(emails);
        System.out.println("List is all emails: " + DataPurge.containsOnlyEmails(emails));
        DataPurge.removeAOL(emails);
        DataPurge.removeDuplicates(emails);
        System.out.println(emails);
    }
    
    
    
    public static void addEmails(ArrayList<String> emails)
    {
        emails.add("improv@gmail.com");
        emails.add("tbmaddux@icloud.com");
        emails.add("rfisher@outlook.com");
        emails.add("anicolao@verizon.net");
        emails.add("openldap@me.com");
        emails.add("improv@gmail.com");
        emails.add("improv@gmail.com");
        emails.add("improv@gmail.com");
        emails.add("alias@sbcglobal.net");
        emails.add("portele@me.com");
        emails.add("doormat@icloud.com");
        emails.add("mailarc@aol.com");
        emails.add("portele@me.com");
        emails.add("rmcfarla@optonline.net");
        emails.add("chrisk@verizon.net");
        emails.add("gordonjcp@aol.com");
        emails.add("improv@gmail.com");
    }
}
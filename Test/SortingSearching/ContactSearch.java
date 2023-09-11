/*Contact Search
You are working on a simple contact management program in Java. Your program allows users to add and search
for contacts by their names. For the search functionality, you decide to use the linear search algorithm to find a
contact's details based on their name.
You have a list of contacts represented by a custom Contact class with attributes ' name' , 'phoneNumber', and
'email'. You also have an array of these Contact objects called contactsArray, which holds all the contacts in
the system.
Your task is to implement the linear search algorithm to find a contact's details by their name. If the contact is found,
return the contact's information; otherwise, return a message indicating that the contact does not exist in the list.
Input format
The first line of input should contain an integer numberOfContacts, representing the total number of contacts in the
system.
contact
The first string is the contact's name.
The second string is the contact's phone number.
The third string is the contact's email.
The next numberOfContacts lines should each contain three space-separated strings representing the details of a
Output format
If the contact with the specified name is found in the contact list, the output will be the details of the contact in the
following format:
«Name>
«Phone Number>
<Email>
If the contact with the specified name is not found in the contact list, the output will be -1.
NOTE: Solve the code with steps mentioned above, submitted code will be verified, don't use any pre-
defined methods.
Sample Input
2
Awdhut 9999999999 Awdhut@gmail.com
sagar 9988776644 sagar@gmail.com
Awdhut
Sample Output
Awdhut
999999999
Awdhut@gmail.com */
package Test.SortingSearching;
import java.util.*;
public class ContactSearch {
        @SuppressWarnings ("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Contact[] contactsArray = new Contact[n];
            for(int i=0;i<n;i++){
                String name = sc.next();
                long phoneNumber = sc.nextLong();
                String email = sc.next();
                contactsArray[i]= new Contact(name,phoneNumber,email);
            }
            String key = sc.next();
            boolean flag = false;
            for(int i=0;i<n;i++){
                if(contactsArray[i].name.equals(key)){
                    contactsArray[i].display();
                    flag = true;
                    break;
                }
            }
            if(flag==false){
                System.out.println("-1");
            }
    }
};
class Contact{
        String name;
        long phoneNumber;
        String email;
        Contact(String name, long phoneNumber, String email){
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }
        String keyy(){
            return name;
        }
        void display(){
            System.out.println(name);
            System.out.println(phoneNumber);
            System.out.println(email);
        }
}
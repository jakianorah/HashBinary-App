/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author jakianorah
 */
public class hashTable {
    // JN 13 buckets in the bucket hash structure
    private final hashTableNode[] buckets = new hashTableNode[13];
    
 //JN insert contact into hash table
    public void insert (String firstName, String lastName, String phoneNumber, String emailAddress) {
        Data addEntry = new Data(firstName, lastName, phoneNumber, emailAddress);
        String key = generateKey(firstName,lastName);
        int bucketLocation = getBucket(key);
        //JN if the bucket is empty enter the new contact otherwise if bucket already has a contact entry enter the new contact in front of the first contact
        if (buckets[bucketLocation] == null) {
            hashTableNode newNode = new hashTableNode(key, addEntry);
            buckets[bucketLocation] = newNode;
        } else {
            hashTableNode firstNode = buckets[bucketLocation];
            hashTableNode newNode = new hashTableNode(key, addEntry, firstNode);
            buckets[bucketLocation] = newNode;
        }
        //JN show confirmation that the contact was inserted
        System.out.println("Contact added to Hash table: " + firstName + " " + lastName);
    }
    //JN lookup a contact in the hash table
 public void lookup(String firstName, String lastName) {
        Data currentEntry = getContact(firstName, lastName);
        if (currentEntry == null) {
            //JN do this if the contact isn't found in the hash table
            System.out.println("Contact" + firstName + " " + lastName + "not found in hash table.");
        } else {
            //JN return the results using the displayData function if the contact is found
            System.out.println("Hash Table Lookup results:");
            currentEntry.displayData();
        }
    }
    //JN remove a contact from the hash table
    public void remove (String firstName, String lastName) {
        boolean found = false;
        String key = generateKey(firstName,lastName);
        int bucketLocation = getBucket(key);
        hashTableNode thisNode = buckets[bucketLocation];
        hashTableNode prevNode = null;
        //JN loop through hash table to find matching key
        while (!found && thisNode != null) {
            //JN if this key matches then return true
            if (thisNode.getKey().equals(key)) {
                found = true;
                //JN this code will remove the contact from the hash table
                if (prevNode != null) {
                    //JN if the previous node is not null set it's next node pointer 
                    prevNode.setNextNode(thisNode.getNextNode());
                } else {
                    //JN if the previous node is null then set the next node to be in the first position in the bucket location
                    buckets[bucketLocation] = thisNode.getNextNode();
                }
                //JN displays confirmation that the contact was removed
                System.out.println("Contact removed from Hash Table: " + firstName + " " + lastName);
            } else {
                //JN if the key doesn't match then loop to the next node
                prevNode = thisNode;
                thisNode = thisNode.getNextNode();
            }
        }
    }
    
    //JN get a contact from the hash table
    private Data getContact (String firstName, String lastName) {
        String key = generateKey(firstName,lastName);
        int bucketLocation = getBucket(key);
        hashTableNode thisNode = buckets[bucketLocation];
        //JN loops through to find non null bucket locations if the key matches stop loop and return that contact
        while (thisNode != null) {
            if (thisNode.getKey().equals(key)) {
                return thisNode.getValue();
            } else {
                thisNode = thisNode.getNextNode();
            }
        }
        //JN do this is we can't find the contact in the hash table
        return null;
    }
    
   //JN returns bucket location within the 13 bucket hash structure
    private int getBucket(String key) {
        int hash = key.hashCode();
        int bucketLocation = hash % 13;
        //JN makes sure bucket location isn't a negative number
        if (bucketLocation < 0) {
            bucketLocation = bucketLocation + 13;
        }
        return bucketLocation;
    }
    
  // JN make first letter of name uppercase
    private String generateKey(String firstName, String lastName) {
        return firstName.toUpperCase()+lastName.toUpperCase();
    }
    
    
 

}


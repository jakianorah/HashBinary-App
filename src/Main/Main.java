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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hashTableTest();
        runHashTable();
        //binaryTreeTest();
        //runBinaryTree();
    }
    //JN test out the hash table
    private static void hashTableTest() {
        hashTable table = new hashTable();
        table.insert("ThisIa","Atest1","504-555-5555","test@test.com");
        table.lookup("ThisIa","Atest1");
        table.remove("ThisIa","Atest1");
    }
    //JN run the hash table test cases
    private static void runHashTable() {
        hashTable table = new hashTable();
        System.out.println("Hash Table Test Cases");
        table.insert("Bob","Smith","555-235-1111","bsmith@somewhere.com");
        table.insert("Jane","Williams","555-235-1112","jw@something.com");
        table.insert("Mohammed","al-Salam","555-235-1113","mas@someplace.com");
        table.insert("Pat","Jones","555-235-1114","pjones@homesweethome.com");
        table.insert("Billy","Kidd","555-235-1115","billy_the_kid@nowhere.com");
        table.insert("H.","Houdini","555-235-1116","houdini@noplace.com");
        table.insert("Jack","Jones","555-235-1117","jjones@hill.com");
        table.insert("Jill","Jones","555-235-1118","jillj@hill.com");
        table.insert("John","Doe","555-235-1119","jdoe@somedomain.com");
        table.insert("Jane","Doe","555-235-1120","jdoe@somedomain.com");
        table.lookup("Pat","Jones");
        table.lookup("Billy","Kidd");
        table.remove("John","Doe");
        table.insert("Test","Case","555-235-1121","Test_Case@testcase.com");
        table.insert("Bob","Smith","555-235-1122","test@gmail.com");
        table.insert("Jo","Wu","555-235-1123","wu@h.com");
        table.insert("Beyonce","Carter-Knowles","555-235-1124","beyonce.com ");
        table.insert("Bob","vanDyke","555-235-1125","vandyke@gmail.com");
        table.insert("Smith","Jackson","555-235-1126","smithjackson@emailus.com");
        table.lookup("Jennifer","Jones");
        table.lookup("Jack","Jones");
        table.lookup("Amy","Jackson");
        table.remove("Jill","Jones");
        table.lookup("John","Doe");
        table.lookup("Jill","Jones");
        table.lookup("John","Doe");
        table.lookup("Smith","Jackson");
        table.lookup("Beyonce","Carter-Knowles"); 
    }
    // JN testing area for binary tree
    private static void binaryTreeTest() {
        binaryTree tree = new binaryTree();
        tree.insert("ThisIsa","Atest2","504-555-5555","test1@test.com");
        tree.insert("ThisIsa","Atest3","504-555-5555","test2@test.com");
        tree.lookup("ThisIsa","Atest2");
        tree.remove("ThisIsa", "Atest3");
    }
//JN run the binary tree test cases
    private static void runBinaryTree() {
        binaryTree tree = new binaryTree();
        System.out.println("Binary Tree Test Cases");
        tree.insert("Bob","Smith","555-235-1111","bsmith@somewhere.com");
        tree.insert("Jane","Williams","555-235-1112","jw@something.com");
        tree.insert("Mohammed","al-Salam","555-235-1113","mas@someplace.com");
        tree.insert("Pat","Jones","555-235-1114","pjones@homesweethome.com");
        tree.insert("Billy","Kidd","555-235-1115","billy_the_kid@nowhere.com");
        tree.insert("H.","Houdini","555-235-1116","houdini@noplace.com");
        tree.insert("Jack","Jones","555-235-1117","jjones@hill.com");
        tree.insert("Jill","Jones","555-235-1118","jillj@hill.com");
        tree.insert("John","Doe","555-235-1119","jdoe@somedomain.com");
        tree.insert("Jane","Doe","555-235-1120","jdoe@somedomain.com");
        tree.lookup("Pat","Jones");
        tree.lookup("Billy","Kidd");
        tree.remove("John","Doe");
        tree.insert("Test","Case","555-235-1121","Test_Case@testcase.com");
        tree.insert("Bob","Smith","555-235-1122","test@gmail.com");
        tree.insert("Jo","Wu","555-235-1123","wu@h.com");
        tree.insert("Beyonce","Carter-Knowles","555-235-1124","beyonce.com ");
        tree.insert("Bob","vanDyke","555-235-1125","vandyke@gmail.com");
        tree.insert("Smith","Jackson","555-235-1126","smithjackson@emailus.com");
        tree.lookup("Jennifer","Jones");
        tree.lookup("Jack","Jones");
        tree.lookup("Amy","Jackson");
        tree.remove("Jill","Jones");
        tree.lookup("John","Doe");
        tree.lookup("Jill","Jones");
        tree.lookup("John","Doe");
        tree.lookup("Smith","Jackson");
        tree.lookup("Beyonce","Carter-Knowles"); 
    }

}

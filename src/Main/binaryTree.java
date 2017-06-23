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
public class binaryTree
{
    private binaryTreeNode root;
    
//JN insert contact into Binary tree
    public void insert (String firstName, String lastName, String phone, String email) {
        Data addEntry = new Data(firstName, lastName, phone, email);
        //JN Create hash
        String key = generateKey(firstName,lastName);
        if (this.root == null) {
            this.root = new binaryTreeNode(key, addEntry);
            System.out.println(" Contact added to Binary Tree: " + firstName + " " + lastName);
        } else {
            root.insert(key, addEntry);
        }
    }
    //JN lookup contact in binary tree
       public void lookup (String firstName, String lastName) {
        String key = generateKey(firstName,lastName);
        binaryTreeNode node = null;
        //Check to see if binary tree is empty the looks for contact
        if (root != null)
            node = root.find(key);
        if (node != null) {
            System.out.println("Binary Tree Lookup results:");
            node.getValue().displayData();
        } else {
            //JN if the searched contact isn't found
            System.out.println("User " + firstName + " " + lastName + " not found in Binary Tree. ");
        }
    }
    //JN remove a contact from the binary tree
    public void remove (String firstName, String lastName) {
        String key = generateKey(firstName,lastName);
        binaryTreeNode current = this.root;
        binaryTreeNode parent = this.root;
        boolean isLeftChild = false;
        
            //JN if the binary tree has no contacts display empty message
        if (current == null) {
            System.out.println(" Binary Tree is empty ");
        } else {
            //JN if current node is not null and the key is 0 the current key is the parent
            while (current != null && current.getKey().compareTo(key) == 0) {
                parent = current;
                //JN if the key is greater than 0 its the left child
                if (current.getKey().compareTo(key) > 0) {
                    current = current.getLeftChild();
                    isLeftChild = true;
                } else {
                    //JN if the key is less than 0 its the right child
                    current = current.getRightChild();
                    isLeftChild = false;
                }
            }
            
            if (current == null) {
                //JN contact not found
                System.out.println("Contact not found: " + firstName + " " + lastName );
            } else {
                //JN if left and right child are null 
                if (current.getLeftChild() == null && current.getRightChild() == null) {
                    //JN and the current node is not the root 
                    if (current != root) {
                        //JN and the current node is not the root and is the left child set the parent's left child to null otherwise set the right child to null
                        if (isLeftChild)
                            parent.setLeftChild(null);
                        else
                            parent.setRightChild(null);
                    } else {
                        //JN if current node is the root set it to null
                        root = null;
                    }
                    //JN confirmation that contact was removed from the binary tree
                    System.out.println(" Contact removed from Binary Tree: " + firstName + " " + lastName );
                //JN current node does not have a right child
                } else if (current.getRightChild() == null) {
                    //JN if current node is not the root and it is the left child set the parent's left child as the left child of the current node otherwise set the parent's right child as the left child of the current node
                    if (current != root) {
                        if (isLeftChild) {
                            parent.setLeftChild(current.getLeftChild());
                        } else {
                            parent.setRightChild(current.getLeftChild());
                        }
                    } else {
                        //JN go to next left child node
                        root = current.getLeftChild();
                    }
                    System.out.println("Contact removed from Binary Tree: " + firstName + " " + lastName );
                //JN current node does not have a left child
                } else if (current.getLeftChild() == null) {
                    //JN if current node is not the root and it is the left child set the left child of the parent as the right child of the current node otherwise set the set the right child of the parent as the successor's right child
                    if (current != root) {
                        if (isLeftChild) {
                            parent.setLeftChild(current.getRightChild());
                        } else {
                            parent.setRightChild(current.getRightChild());
                        }
                    } else {
                        //JN go to next right child
                        root = current.getRightChild();
                    }
                    //JN Confirmation that contact was removed from binary tree
                    System.out.println("Contact removed from Binary Tree: " + firstName + " " + lastName );
                } else {
                    // JN when the current node has two children find the successor by starting at right child of current node then go to left child until left child is null
                    binaryTreeNode successorParent = current;
                    binaryTreeNode successor = current.getRightChild();
                    while (successor.getLeftChild() != null) {
                        successorParent = successor;
                        successor = successor.getLeftChild();
                    }
                    //JN unlink the successor from it's parent if the right child is null but if the righ child is not null set the parent's left child as the right child of the successor 
                    if (successor.getRightChild() == null) {
                        successorParent.setLeftChild(null);
                    } else {
                        successorParent.setLeftChild(successor.getRightChild());
                    }
                    // JN if the successor is not the root link the left and right child
                    if (current != root) {
                        if (isLeftChild) {
                            parent.setLeftChild(successor);
                        } else {
                            parent.setRightChild(successor);
                        }
                    } else {
                        root = successor;
                    }
                    // JN Move successor in place of deleted contact
                    successor.setLeftChild(current.getLeftChild());
                    successor.setRightChild(current.getRightChild());
                    System.out.println(" Contact removed from Binary Tree: " + firstName + " " + lastName );
                }
            }
        }
    }
    
    // JN make first letter of name uppercase
    private String generateKey(String firstName, String lastName) {
        return firstName.toUpperCase()+lastName.toUpperCase();
    }
    
 
    
}


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
public class binaryTreeNode {
    private final String key;
    private final Data value;
    private binaryTreeNode leftChild;
    private binaryTreeNode rightChild;

    public binaryTreeNode(String key, Data value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Data getValue() {
        return value;
    }

    public binaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(binaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public binaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(binaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }
    //JN compares key to the current node key
    public binaryTreeNode find (String key) {
        //JN if the key is 0 it is the key were are looking for
        if (this.key.compareTo(key) == 0)
            return this;
        //JN if the key is less than 0 and the left child is null return the key of the left child
        if (this.key.compareTo(key) > 0 && leftChild != null ) {
            return leftChild.find(key);
        }
        //JN if the key is greater than 0 and the right child is null return the key of the right child
        if (rightChild != null)
            return rightChild.find(key);
        return null;
    }
    
    public void insert (String key, Data value) {
        //JN if the key is less than or equal to 0 and the right child is null the right child is the new node
        if (this.key.compareTo(key) <= 0) {
            if (this.rightChild == null) {
                this.rightChild = new binaryTreeNode(key, value);
                System.out.println("Contact added to Binary Tree " + value.getFirstName() + " " + value.getLastName());
           
            } else {
                //JNN otherwise move to the next right child
                this.rightChild.insert(key, value);
            }
        } else {
            //JN if the key is greater than 0 and the left child is null then the left child is the new node
            if (this.leftChild == null) {
                this.leftChild = new binaryTreeNode(key,value);
                System.out.println("Contact added to Binary Tree " + value.getFirstName() + " " + value.getLastName());
            } else {
                //JN otherwise move to the next left child
                this.leftChild.insert(key, value);
            }
        }
    }
}


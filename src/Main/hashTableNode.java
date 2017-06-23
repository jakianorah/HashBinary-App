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
public class hashTableNode {
    private String key;
    private Data value;
    private hashTableNode nextNode;
    
  //JN contstructs node when next node is not given
    public hashTableNode(String key, Data value) {
        setKey(key);
        setValue(value);
    }
    
   //JN contstructs node when next node is given
    public hashTableNode(String key, Data value, hashTableNode nextNode) {
        setKey(key);
        setValue(value);
        setNextNode(nextNode);
    }
    
   //JN sets node key
    public void setKey (String key) {
        this.key = key;
    }
    
   //JN sets node value
    public void setValue (Data value) {
        this.value = value;
    }
    
    //JN  sets next node
    public void setNextNode(hashTableNode nextNode) {
        this.nextNode = nextNode;
    }
    //JN  gets node key
    public String getKey () {
        return key;
    }
     //JN gets node value
    public Data getValue () {
        return value;
    }
    
    //JN gets next node
    public hashTableNode getNextNode() {
        return nextNode;
    }
}


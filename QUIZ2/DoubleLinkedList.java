/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUIZ;

import org.w3c.dom.Node;

/**
 *
 * @author mutiaradevita
 */
public class DoubleLinkedList {
    Node_23 head;
    int size;
    
    DoubleLinkedList(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Pembeli costumer, Pesanan pesanan){
        if(isEmpty()){
            head = new Node_23(null, costumer, pesanan, null);
        }else{
            Node_23 newNode = new Node_23(null, pem, pes, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Pembeli costumer, Pesanan pesanan){
        if (isEmpty()){
            addFirst(costumer, pesanan);
        }else{
            Node_23 current = head;
            while(current.next != null){
                current = current.next;
            }
            Node_23 newNode = new Node_26(current, pem, pes, null);
            current.next = newNode;
            size++;
        }
    }
    public void print(){
        if (!isEmpty()) {
            Node_23 tmp = head;
            while(tmp != null){
                
                tmp = tmp.next;
            }
            System.out.println("Berhasil diisikan");
        }else{
            System.out.println("Antrian Kosong !");
        }
    }

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat menghapus node!");
        }else if (size == 1){
            head = null;
            System.out.println(head.costumer.namaPembeli+ "Telah Memesan Menu");
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}

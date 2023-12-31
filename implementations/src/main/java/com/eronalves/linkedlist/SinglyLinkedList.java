package com.eronalves.linkedlist;

public class SinglyLinkedList<E> {

  private static class Node<E> {
    private E element;

    private Node<E> next;

    public Node(E element, Node<E> next) {
      this.element = element;
      this.next = next;
    }

    public E getElement() {
      return element;
    }

    public Node<E> getNext() {
      return next;
    }

    public void setNext(Node<E> n) {
      next = n;
    }
  }

  private Node<E> head = null;
  private Node<E> tail = null;

  private int size = 0;

  public SinglyLinkedList() {
  }

  public int size() {
    return size;
  }

  public void rotate() {
    var tempNode = head;
    head = head.next;
    tempNode.next = null;
    tail.next = tempNode;
    tail = tempNode;
  }

  public int sizeWithoutVar() {
    int size = 0;
    var actual = head;

    while (actual != null) {
      actual = actual.getNext();
      size++;
    }

    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public E first() {
    if (isEmpty()) return null;
    return head.getElement();
  }

  public E last() {
    if (isEmpty()) return null;
    return tail.getElement();
  }

  public void addFirst(E e) {
    head = new Node<>(e, head);
    if (size == 0) tail = head;
    size++;
  }

  public void addLast(E e) {
    Node<E> newest = new Node<>(e, null);
    if (isEmpty())
      head = newest;
    else
      tail.setNext(newest);

    tail = newest;
    size++;
  }

  public E removeFirst() {
    if (isEmpty()) return null;
    E answer = head.getElement();
    head = head.getNext();
    size--;
    if (size == 0) tail = null;
    return answer;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    if (getClass() != o.getClass()) return false;

    var other = (SinglyLinkedList) o;

    if (size != other.size()) return false;
    var walkA = head;
    var walkB = other.head;

    while (walkA != null) {
      if (!walkA.getElement().equals(walkB.getElement())) return false;
      walkA = walkA.getNext();
      walkB = walkB.getNext();
    }

    return true;
  }

}

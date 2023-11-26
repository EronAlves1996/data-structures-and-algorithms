package com.eronalves.linkedlist;

public class DoublyLinkedList<E> {

  private static class Node<E> {
    private E element;
    private Node<E> next;
    private Node<E> prev;

    public Node (
        E element,
        Node<E> prev,
        Node<E> next
    ) {
      this.element = element;
      this.next = next;
      this.prev = prev;
    }

    public E getElement () {
      return element;
    }

    public Node<E> getNext () {
      return next;
    }

    public Node<E> getPrev () {
      return prev;
    }

    public void setNext (Node<E> next) {
      this.next = next;
    }

    public void setPrev (Node<E> prev) {
      this.prev = prev;
    }

  }

  private Node<E> header;
  private Node<E> trailer;
  private int size = 0;

  public DoublyLinkedList () {
    header = new Node<>(null, null, null);
    trailer = new Node<>(null, header, null);
    header.setNext(trailer);
  }

  public int size () {
    return size;
  }

  public int sizeWithNoInstance () {
    if (header.next.element == null) return 0;

    var current = header.next;
    int size = 1;

    while (current.next.element != null) {
      size++;
      current = current.next;
    }

    return size;
  }

  public boolean isEmpty () {
    return size == 0;
  }

  public E first () {
    if (isEmpty()) return null;
    return header.getNext().getElement();
  }

  public E last () {
    if (isEmpty()) return null;
    return trailer.getPrev().getElement();
  }

  public void addFirst (E e) {
    addBetween(e, header, header.getNext());
  }

  public void addLast (E e) {
    addBetween(e, trailer.getPrev(), trailer);
  }

  public E removeFirst () {
    if (isEmpty()) return null;
    return remove(header.getNext());
  }

  public E removeLast () {
    if (isEmpty()) return null;
    return remove(trailer.getPrev());
  }

  private void addBetween (
      E e,
      Node<E> predecessor,
      Node<E> successor
  ) {
    Node<E> newest = new Node<>(e, predecessor, successor);
    predecessor.setNext(newest);
    successor.setPrev(newest);
    size++;
  }

  private E remove (Node<E> node) {
    Node<E> predecessor = node.getPrev();
    Node<E> successor = node.getNext();
    predecessor.setNext(successor);
    successor.setPrev(predecessor);
    size--;
    return node.getElement();
  }

  @Override
  public boolean equals (Object o) {
    if (!(o instanceof DoublyLinkedList)) return false;

    // check the generic type happens after
    @SuppressWarnings("rawtypes")
    var otherDll = (DoublyLinkedList) o;

    if (!otherDll.header.element.getClass().equals(header.element.getClass()))
      return false;

    // checked before
    @SuppressWarnings("unchecked")
    var fullyCastedOtherDll = (DoublyLinkedList<E>) o;

    if (fullyCastedOtherDll.size() != size()) return false;

    var otherHeader = fullyCastedOtherDll.header;
    var thisHeader = header;

    while (otherHeader != null) {
      if (!otherHeader.element.equals(thisHeader.element)) return false;
      otherHeader = otherHeader.getNext();
      thisHeader = thisHeader.getNext();
    }

    return true;
  }

}

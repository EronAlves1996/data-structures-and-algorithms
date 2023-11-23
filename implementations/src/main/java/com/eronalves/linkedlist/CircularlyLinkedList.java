package com.eronalves.linkedlist;

public class CircularlyLinkedList<E> {
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

  private Node<E> tail = null;
  private int size = 0;

  public CircularlyLinkedList() {
  }

  public int size() {
    return size;
  }

  public int sizeWithoutVar() {
    int size = 0;
    final var endTail = tail;

    if (tail == null) return size;

    var cursor = tail.getNext();
    size++;

    while (!(cursor == endTail)) {
      size++;
      cursor = cursor.getNext();
    }

    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public E first() {
    if (isEmpty()) return null;
    return tail.getNext().getElement();
  }

  public E last() {
    if (isEmpty()) return null;
    return tail.getElement();
  }

  public void rotate() {
    if (tail != null) tail = tail.getNext();
  }

  public void addFirst(E e) {
    if (size == 0) {
      tail = new Node<>(e, null);
      tail.setNext(tail);
    } else {
      tail.setNext(new Node<>(e, tail.getNext()));
    }

    size++;
  }

  public void addLast(E e) {
    addFirst(e);
    tail = tail.getNext();
  }

  public E removeFirst() {
    if (isEmpty()) return null;
    Node<E> head = tail.getNext();

    if (head == tail)
      tail = null;
    else
      tail.setNext(head.getNext());

    size--;
    return head.getElement();
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof CircularlyLinkedList) {
      var casted = this.getClass().cast(obj);
      if (casted.first().getClass().equals(this.first().getClass())) {
        // checked the generic type above
        @SuppressWarnings("unchecked")
        var genericCasted = (CircularlyLinkedList<E>) casted;
        if (genericCasted.size() == this.size()) {

          var cursor = tail;
          var otherCursor = genericCasted.tail;

          for (int i = 0; i < size; i++) {
            if (!cursor.getElement().equals(otherCursor.getElement()))
              return false;
          }

          return true;
        }
      }
    }

    return false;
  }
}

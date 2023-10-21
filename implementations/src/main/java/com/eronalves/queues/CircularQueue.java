package com.eronalves.queues;

/**
 * CircularQueue
 */
public interface CircularQueue<E> extends Queue<E> {

  void rotate();

}

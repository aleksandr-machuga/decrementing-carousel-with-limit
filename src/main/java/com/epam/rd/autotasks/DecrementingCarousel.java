package com.epam.rd.autotasks;

public class DecrementingCarousel {
    protected int[] elements;
    private int capacity;
    protected boolean isRun;
    private int index;


    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
    }

    public boolean addElement(int element) {
        if (element > 0 && !isRun && index < capacity) {
            elements[index] = element;
            index++;
            return true;
        } else {
            return false;
        }
    }

    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new CarouselRun(elements);
        } else {
            return null;
        }
    }
}



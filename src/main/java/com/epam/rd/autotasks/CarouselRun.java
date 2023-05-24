package com.epam.rd.autotasks;

public class CarouselRun {
    protected int[] elements;
    protected int index;

    public CarouselRun(int[] elements) {
        this.elements = elements;
    }

    public int next() {
        if (isFinished()) {
            return -1;
        }
        if (index == elements.length) {
            index = 0;
        }
        int element = elements[index];
        while (element == 0) {
            index++;
            if (index == elements.length) {
                index = 0;
            }
            element = elements[index];
        }
        return elements[index++]--;
    }

    public boolean isFinished() {
        for (int element : elements) {
            if (element > 0) {
                return false;
            }
        }
        return true;
    }
}

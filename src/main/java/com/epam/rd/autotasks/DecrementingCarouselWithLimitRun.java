package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitRun extends CarouselRun {
    private int actionLimit;

    public DecrementingCarouselWithLimitRun(int[] elements, int actionLimit) {
        super(elements);
        this.actionLimit = actionLimit;
    }

    @Override
    public boolean isFinished() {
        if (actionLimit <= 0) {
            return true;
        }
        for (int element : elements) {
            if (element > 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int next() {
        if (isFinished()) {
            actionLimit--;
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
        actionLimit--;
        return elements[index++]--;
    }
}

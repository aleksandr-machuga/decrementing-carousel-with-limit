package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel {
    private int actionLimit;

    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.actionLimit=actionLimit;
    }

    @Override
    public DecrementingCarouselWithLimitRun run() {
        if (!isRun) {
            isRun = true;
            return new DecrementingCarouselWithLimitRun(elements,actionLimit);
        } else {
            return null;
        }
    }
}

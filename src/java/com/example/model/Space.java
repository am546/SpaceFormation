package com.example.model;

import java.util.*;

public class Space {

    private Boolean fits;
    private final ArrayList<Integer> parameterNames;
    private final Integer height;
    private final Integer width;

    public Space(ArrayList<Integer> parameterNames, Integer height, Integer width) {
        this.parameterNames = parameterNames;
        this.height = height;
        this.width = width;
        this.fits = true;
    }

    public void checkSize() {
        Integer sizeOfIslets = 0;
        double sizeOfSpace;
        sizeOfIslets += parameterNames.get(0) * 9;
        sizeOfIslets += parameterNames.get(1) * 3;
        sizeOfIslets += parameterNames.get(2) * 8;
        sizeOfIslets += parameterNames.get(3) * 8;
        sizeOfIslets += parameterNames.get(4) * 4;
        sizeOfIslets += parameterNames.get(5) * 6;

        sizeOfSpace = height * width - 0.4 * width * 0.4 * height;
        if (sizeOfIslets > sizeOfSpace) {
            this.fits = false;
        }
    }

    public char[][] getTypes() {

        this.checkSize();
        if (this.fits) {
            FillSpace space = new FillSpace(height, width);
            space.CreateSpace();
            space.fillGrid(parameterNames);
            return space.getArr();
        } else {
            char[][] fail = {{'f'},{'f'}};
            return fail;
        }
    }

    public Boolean getFits() {
        return fits;
    }

}

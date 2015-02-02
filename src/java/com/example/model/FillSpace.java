/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

/**
 *
 * @author atsou
 */

/** Class FloodFill **/
/**
 * Java Program to Implement Flood Fill Algorithm
 **/
 
import java.util.ArrayList;
import java.util.Arrays;
 
/** Class FloodFill **/
public class FillSpace
{
    private final Integer height;
    private final Integer width;
    private char[][] arr;

    public FillSpace(Integer height, Integer width) {
        this.height = height;
        this.width = width;
        this.arr = new char[height + 2][width + 2];
    }

    public char[][] getArr() {
        return arr;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }
   
    /** Function to fill grid **/
    public void fillGrid(ArrayList<Integer> type) {
        Boolean flag;
        Integer temp;
        for (int t = 0; t < type.size(); t++) {
            switch (t) {
                case 0:
                    temp = 0;
                    while (temp < type.get(t)) {
                        outerloop0:
                        for (int i = 0; i < height + 2; i++) {
                            for (int j = 0; j < width + 2; j++) {
                                flag = false;
                                innerloop0:
                                for (int i1 = i; i1 < i + 3; i1++) {
                                    for (int j1 = j; j1 < j + 3; j1++) {
                                        if (arr[i1][j1] == 'O') {
                                            flag = true;
                                        } else {
                                            flag = false;
                                            break innerloop0;
                                        }
                                    }
                                }
                                if (flag == true) {
                                    int ctr;
                                    for (int i1 = i; i1 < i + 3; i1++) {
                                        for (int j1 = j; j1 < j + 3; j1++) {
                                            arr[i1][j1] = '1';
                                        }
                                    }
                                    temp++;
                                    break outerloop0;
                                }
                            }
                        }

                    }
                    break;
                    case 1:
                    temp = 0;
                    while (temp < type.get(t)) {
                        outerloop1:
                        for (int i = 0; i < height + 2; i++) {
                            for (int j = 0; j < width + 2; j++) {
                                flag = false;
                                innerloop1:
                                    for (int j1 = j; j1 < j + 3; j1++) {
                                        if (arr[i][j1] == 'O') {
                                            flag = true;
                                        } else {
                                            flag = false;
                                            break innerloop1;
                                        }
                                    }
                                if (flag == true) {
                                        for (int j1 = j; j1 < j + 3; j1++) {
                                            arr[i][j1] = '2';
                                        }
                                    temp++;
                                    break outerloop1;
                                }
                            }
                        }

                    }
                    break;
                case 2:
                    temp = 0;
                    while (temp < type.get(t)) {
                        outerloop2:
                        for (int i = 0; i < height + 2; i++) {
                            for (int j = 0; j < width + 2; j++) {
                                flag = false;
                                innerloop2:
                                for (int i1 = i; i1 < i + 4; i1++) {
                                    for (int j1 = j; j1 < j + 2; j1++) {
                                        if (arr[i1][j1] == 'O') {
                                            flag = true;
                                        } else {
                                            flag = false;
                                            break innerloop2;
                                        }
                                    }
                                }
                                if (flag == true) {
                                    for (int i1 = i; i1 < i + 4; i1++) {
                                        for (int j1 = j; j1 < j + 2; j1++) {
                                            arr[i1][j1] = '3';
                                        }
                                    }
                                    temp++;
                                    break outerloop2;
                                }
                            }
                        }

                    }
                    break;
                    case 3:
                    temp = 0;
                    while (temp < type.get(t)) {
                        outerloop3:
                        for (int i = 0; i < height + 2; i++) {
                            for (int j = 0; j < width + 2; j++) {
                                flag = false;
                                innerloop3:
                                for (int i1 = i; i1 < i + 4; i1++) {
                                    for (int j1 = j; j1 < j + 2; j1++) {
                                        if (arr[i1][j1] == 'O') {
                                            flag = true;
                                        } else {
                                            flag = false;
                                            break innerloop3;
                                        }
                                    }
                                }
                                if (flag == true) {
                                    for (int i1 = i; i1 < i + 4; i1++) {
                                        for (int j1 = j; j1 < j + 2; j1++) {
                                            arr[i1][j1] = '4';
                                        }
                                    }
                                    temp++;
                                    break outerloop3;
                                }
                            }
                        }

                    }
                    break;
                case 4:
                    temp = 0;
                    while (temp < type.get(t)) {
                        outerloop4:
                        for (int i = 0; i < height + 2; i++) {
                            for (int j = 0; j < width + 2; j++) {
                                flag = false;
                                innerloop4:
                                for (int i1 = i; i1 < i + 2; i1++) {
                                    for (int j1 = j; j1 < j + 2; j1++) {
                                        if (arr[i1][j1] == 'O') {
                                            flag = true;
                                        } else {
                                            flag = false;
                                            break innerloop4;
                                        }
                                    }
                                }
                                if (flag == true) {
                                    for (int i1 = i; i1 < i + 2; i1++) {
                                        for (int j1 = j; j1 < j + 2; j1++) {
                                            arr[i1][j1] = '5';
                                        }
                                    }
                                    temp++;
                                    break outerloop4;
                                }
                            }
                        }

                    }
                    break;
                    case 5:
                    temp = 0;
                    while (temp < type.get(t)) {
                        outerloop5:
                        for (int i = 0; i < height + 2; i++) {
                            for (int j = 0; j < width + 2; j++) {
                                flag = false;
                                innerloop5:
                                for (int i1 = i; i1 < i + 4; i1++) {
                                    for (int j1 = j; j1 < j + 3; j1++) {
                                        if (arr[i1][j1] == 'O') {
                                            flag = true;
                                        } else {
                                            flag = false;
                                            break innerloop5;
                                        }
                                    }
                                }
                                if (flag == true) {
                                    for (int i1 = i; i1 < i + 4; i1++) {
                                        for (int j1 = j; j1 < j + 3; j1++) {
                                            arr[i1][j1] = '6';
                                        }
                                    }
                                    temp++;
                                    break outerloop5;
                                }
                            }
                        }

                    }
                    break;
                default:
                    break;

            }
        }
    }
    /** Function to display grid **/
    private void display(char[][] arr)
    {
        System.out.println("\nGrid : ");
        for (int i = 1; i < arr.length - 1; i++)
        {
            for (int j = 1; j < arr[i].length - 1; j++)
                System.out.print(arr[i][j] +" ");
            System.out.println();
        }
    }
    // etoimo / elegmeno
    public void CreateSpace() 
    {
        
        /** make grid with border as obstacle to avoid boundary conditions **/
        for (int i = 0; i < height + 2; i++) {
            if (i == 0 || i == height + 1) {
                Arrays.fill(arr[i], '7');
            } else {
                Arrays.fill(arr[i], 'O');
            }
        }
        for (int i=0; i<height+2; i++) {
                arr[i][0] = '7';
                arr[i][width+1] = '7';
        }

        /**
         * Accept grid *
         */
        for (int i = 1; i < height + 1; i++) {
            for (int j = 1; j < width + 1; j++) {
                if (i < (height + 1) * 0.4 && ((j > (width + 1) * 0.3) && (j < (width + 1) * 0.7))) {
                    arr[i][j] = '7';
                }
            }
        }

 
    }    
    
    
}
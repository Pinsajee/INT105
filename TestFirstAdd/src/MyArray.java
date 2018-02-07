/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INT105
 */
class MyArray {

    public static int[] findMinMax(int[] scoreOutOfRange) {
        int min = scoreOutOfRange[0];
        int max = scoreOutOfRange[0];
        
        for (int i = 0; i < scoreOutOfRange.length; i++) {
            if(scoreOutOfRange[i] < 0) {
                return null;
            } else {
                if(min > scoreOutOfRange[i]) {
                    min = scoreOutOfRange[i];
                }
                if (max < scoreOutOfRange[i]) {
                    max = scoreOutOfRange[i];
                    
                }
            }
            
        }
        
        return new int[] {min , max};
    }
    
}

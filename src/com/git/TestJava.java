package com.git;
/** 
 * @author XiFeng.Zou
 * @date ����ʱ�䣺2017-1-5 ����10:22:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class TestJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0; 
		
		// TODO Auto-generated method stub
		int[] tempNums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        for (int i = 0; i < tempNums.length; i++) {
            for (int j = 0; j < tempNums.length - i - 1; ++j) {
                if (tempNums[j] > tempNums[j + 1]) {
                    count++;
                    int temp = tempNums[j];
                    tempNums[j] = tempNums[j + 1];
                    tempNums[j + 1] = temp;
                }
                
            }
        }
        System.out.println("������"+count+"�Σ�");
	}

}

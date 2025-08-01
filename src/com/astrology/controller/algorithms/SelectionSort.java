/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.astrology.controller.algorithms;

import com.astrologer.model.AstrologerModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oj sharma
 */
public class SelectionSort {
     public List<AstrologerModel> sortById(List<AstrologerModel> unsortedData, boolean isDesc) {
        
        List<AstrologerModel> dataToSort = new ArrayList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (dataToSort.get(j).getId()> dataToSort.get(minIndex).getId()) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getId() < dataToSort.get(minIndex).getId()) {
                        minIndex = j;
                    }
                }
            }
            //swap
            AstrologerModel tempStudent = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempStudent);
        }
        return dataToSort;
    }
    
     public List<AstrologerModel> sortByName(List<AstrologerModel> unsortedData, boolean isDesc) {
        
        List<AstrologerModel> dataToSort = new ArrayList(); 
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (dataToSort.get(j).getName().compareToIgnoreCase(dataToSort.get(minIndex).getName())>0 ) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getName().compareToIgnoreCase(dataToSort.get(minIndex).getName())<0) {
                        minIndex = j;
                    }
                }
            }
            //swap
            AstrologerModel tempStudent = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempStudent);
        }
        return dataToSort;
    }
}

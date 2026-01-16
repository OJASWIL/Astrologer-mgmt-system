/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.astrology.controller.algorithms;

import com.astrologer.model.AstrologerModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

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
    
 public List<AstrologerModel> sortByName(List<AstrologerModel> list, boolean ascending) {
    // Create a copy if you don't want to modify original
    List<AstrologerModel> sorted = new ArrayList<>(list);
    
    for (int i = 0; i < sorted.size() - 1; i++) {
        int minIdx = i;
        for (int j = i + 1; j < sorted.size(); j++) {
            String nameA = sorted.get(minIdx).getName().toLowerCase();
            String nameB = sorted.get(j).getName().toLowerCase();
            
            if (ascending) {
                if (nameA.compareTo(nameB) > 0) {
                    minIdx = j;
                }
            } else {
                if (nameA.compareTo(nameB) < 0) {
                    minIdx = j;
                }
            }
        }
        // Swap
        Collections.swap(sorted, i, minIdx);
    }
    return sorted;
}
}

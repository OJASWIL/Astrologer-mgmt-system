/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.astrology.controller.algorithms;

import com.astrologer.model.AstrologerModel;
import java.util.List;

/**
 *
 * @author oj sharma
 */
public class BinarySearch {
    
    public AstrologerModel searchByName(String searchedName, List<AstrologerModel> astroList,
            int left, int right) {
        
     if (right < left) {
            return null;
        }
     
       int mid = (left + right) / 2;

        // checks whether searchKey lies on mid point
        if (searchedName.compareToIgnoreCase(astroList.get(mid).getName()) == 0) {
            return astroList.get(mid);
        } else if (searchedName.compareToIgnoreCase(astroList.get(mid).getName()) < 0) {
            return searchByName(searchedName, astroList, left, mid - 1);
        } else {
            return searchByName(searchedName, astroList, mid + 1, right);
        }
    }
}

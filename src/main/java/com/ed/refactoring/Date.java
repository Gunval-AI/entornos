/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ed.refactoring;

/**
 *
 * @author victor
 */


 /**
 * This class represents a date with day, month, and year.
 */
public class Date {

    private int day;
    private int month;
    private int year;

/**
     * Constructor for the Date class with the following parameters:
     * @param day the day of the month
     * @param month the month of the year
     * @param year the year
     */


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Validates the date.
     *
     * @return boolean, true if valid, false if not
     */

    public boolean isValid() {
        if (day < 1 || day > 31) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        int daysInMonth = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
        }

        return day <= daysInMonth;
    }
}



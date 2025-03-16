/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.ed.refactoring.Date;

/**
 *
 * @author elena
 */
public class DateTest {

    public DateTest() {
    }
    
        public class ValidDateTest {
    
            private Date correctDate = new Date(20, 6, 2008);
    
            private Date invalidMonth1 = new Date(21, 0, 3000);
    
            private Date invalidMonth2 = new Date(21, 13, 3000);
    
            private Date invalidDay1 = new Date(0, 11, 2000);
    
            private Date invalidDay2 = new Date(32, 11, 2000);
    
            private Date invalidNovemberDay = new Date(31, 11, 2000);
    
            private Date validDecemberDay = new Date(31, 12, 2000);
    
            private Date invalidFebruaryDay = new Date(30, 2, 2008);
    
            private Date validLeapYearFebruaryDay1 = new Date(29, 2, 2008);
    
            private Date validLeapYearFebruaryDay2 = new Date(29, 2, 2000);
    
            private Date invalidLeapYearFebruaryDay1 = new Date(29, 2, 2007);
    
            private Date invalidLeapYearFebruaryDay2 = new Date(29, 2, 1900);
    
            public void testIsValid() {
    
                assertTrue(correctDate.isValid());
    
                assertFalse(invalidMonth1.isValid());
    
                assertFalse(invalidMonth2.isValid());
    
                assertFalse(invalidDay1.isValid());
    
                assertFalse(invalidDay2.isValid());
    
                assertFalse(invalidNovemberDay.isValid());
    
                assertTrue(validDecemberDay.isValid());
    
                assertFalse(invalidFebruaryDay.isValid());
    
                assertTrue(validLeapYearFebruaryDay1.isValid());
    
                assertTrue(validLeapYearFebruaryDay2.isValid());
    
                assertFalse(invalidLeapYearFebruaryDay1.isValid());
    
                assertFalse(invalidLeapYearFebruaryDay2.isValid());
    
            }
    
        }
    }
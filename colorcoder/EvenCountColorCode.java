package colorcoder;


import colorcoder.colorcode.manual.ColorCodeManual;
import colorcoder.colors.MajorColor;
import colorcoder.colors.MinorColor;

import static colorcoder.testcolor.TestColorcoder.testNumberToPair;
import static colorcoder.testcolor.TestColorcoder.testPairToNumber;


public class EvenCountColorCode {

    public static void main(String[] args) {

        ColorCodeManual.generateColorCodeManual();
        testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}

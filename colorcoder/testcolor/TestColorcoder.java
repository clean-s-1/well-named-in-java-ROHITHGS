package colorcoder.testcolor;

import colorcoder.colors.MajorColor;
import colorcoder.colors.MinorColor;
import colorcoder.model.ColorPair;

import static colorcoder.colorhandler.HandleColor.getColorFromPairNumber;
import static colorcoder.colorhandler.HandleColor.getPairNumberFromColor;

public class TestColorcoder {

    public static void testNumberToPair(final int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor)
    {
        ColorPair colorPair = getColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.toString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }

    public static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber)
    {
        int pairNumber = getPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }
}

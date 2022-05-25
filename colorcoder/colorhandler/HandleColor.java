package colorcoder.colorhandler;

import colorcoder.colors.MajorColor;
import colorcoder.colors.MinorColor;
import colorcoder.model.ColorPair;

public class HandleColor {

    public static ColorPair getColorFromPairNumber(final int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
                MajorColor.fromIndex(zeroBasedPairNumber / MajorColor.values().length);
        MinorColor minorColor =
                MinorColor.fromIndex(zeroBasedPairNumber % MinorColor.values().length);
        return new ColorPair(majorColor, minorColor);
    }
    public static int getPairNumberFromColor(final MajorColor major, final MinorColor minor) {
        return major.getIndex() * MinorColor.values().length + minor.getIndex() + 1;
    }
}

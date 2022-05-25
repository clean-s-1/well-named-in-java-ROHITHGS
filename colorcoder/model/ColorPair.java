package colorcoder.model;


import colorcoder.colors.MajorColor;
import colorcoder.colors.MinorColor;

import static colorcoder.commonInfo.ColorUtility.MajorColorNames;
import static colorcoder.commonInfo.ColorUtility.MinorColorNames;


public class ColorPair{
    private MajorColor majorColor;
    private MinorColor minorColor;

    public ColorPair(MajorColor major, MinorColor minor)
    {
        majorColor = major;
        minorColor = minor;
    }
    public MajorColor getMajor() {
        return majorColor;
    }
    public MinorColor getMinor() {
        return minorColor;
    }


    public String toString() {
        String colorPairStr = MajorColorNames[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += MinorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }
};
package colorcoder.commonInfo;

import colorcoder.colors.ColorCodeIndex;
import colorcoder.colors.MajorColor;

public class ColorCodeIndexReader {

    public static ColorCodeIndex fromIndex(final int index,final ColorCodeIndex[] values) {
       return values[index];
    }
}

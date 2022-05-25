package colorcoder.colors;


import colorcoder.commonInfo.ColorCodeIndexReader;

public enum MinorColor implements ColorCodeIndex {
    BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);
    private int index;
    private MinorColor(int index) {
        this.index = index;
    }
    public int getIndex() {
        return index;
    }

    public static MinorColor fromIndex(final int index) {
        return (MinorColor) ColorCodeIndexReader.fromIndex(index, MinorColor.values());
    }


}
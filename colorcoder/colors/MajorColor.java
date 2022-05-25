package colorcoder.colors;

import colorcoder.commonInfo.ColorCodeIndexReader;

public enum MajorColor implements  ColorCodeIndex{

        WHITE(0),
        RED(1),
        BLACK(2),
        YELLOW(3),
        VIOLET(4);

        private int index;
        private MajorColor(int index) {
        this.index = index;
    }
        public int getIndex() {
        return index;
    }


        public static MajorColor fromIndex(final int index) {
            return (MajorColor) ColorCodeIndexReader.fromIndex(index, MajorColor.values());
       }
}

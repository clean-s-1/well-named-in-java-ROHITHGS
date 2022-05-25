package colorcoder.model;

public class ColorCodeReferenceModel {

    private int pairNumber;
    private String majorColor;

    public int getPairNumber() {
        return pairNumber;
    }

    public void setPairNumber(int pairNumber) {
        this.pairNumber = pairNumber;
    }

    @Override
    public String toString() {
                     return(""+ pairNumber +"               "+majorColor+"            "+minorColor );
         }

    public String getMajorColor() {
        return majorColor;
    }

    public void setMajorColor(String majorColor) {
        this.majorColor = majorColor;
    }

    public String getMinorColor() {
        return minorColor;
    }

    public void setMinorColor(String minorColor) {
        this.minorColor = minorColor;
    }

    private String minorColor;

}

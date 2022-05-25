package colorcoder.colorcode.manual;

import colorcoder.commonInfo.ColorUtility;
import colorcoder.model.ColorCodeReferenceModel;

public class ColorCodeManual {
    public static void generateColorCodeManual() {
        System.out.println("------REFERENCE MANUAL FOR TWISTED WIRE PAIR----");

        System.out.println("PAIR NUMBER     MAJOR COLOR     MINOR COLOR");
        ColorCodeReferenceModel colorCodeReferenceModel =  new ColorCodeReferenceModel();
        int clrPair = 0;
        for(String majorClr : ColorUtility.MajorColorNames){
            clrPair++;
            for(String minorClr : ColorUtility.MinorColorNames){
                colorCodeReferenceModel.setPairNumber(clrPair);
                colorCodeReferenceModel.setMajorColor(majorClr);
                colorCodeReferenceModel.setMinorColor(minorClr);
                System.out.println(colorCodeReferenceModel);

            }
        }
        System.out.println("--------------------------------------------");
    }
}

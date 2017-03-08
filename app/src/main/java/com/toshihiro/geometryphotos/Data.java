package com.toshihiro.geometryphotos;

import ssru.toshihiro.geometryphoto.R;

/**
 * Created by Admin on 02-Feb-17.
 */

public class Data {
    public int[] resId(){
        int[] imgSquare = {
                R.drawable.sq_02, R.drawable.sq_01, R.drawable.sq_03, R.drawable.sq_04, R.drawable.sq_05
        };
        return imgSquare;
    }

    public String[] squareStrings(){
        String[] strName = {"สี่เหลี่ยมจัตุรัส", "สี่เหลี่ยมผืนผ้า", "สี่เหลี่ยมด้านขนาน", "สี่เหลี่ยมคางหมู", "สี่เหลี่ยมรูปว่าว"};
        return strName;
    }

    public String[] formula(){
        String[] squareFormulaStrings = {
                "ด้าน x ด้าน", "กว้าง x ยาว", "1/2 x ฐาน x สูง", "0.5 x สูง x ผลบวกของความยาวของด้านคู่ขนาน", "0.5 x ผลคูณของเส้นทแยงมุม"
        };
        return squareFormulaStrings;
    }

    public int[] cirResID() {
        int[] imgCircle = {
                R.drawable.cr_01, R.drawable.cr_02
        };
        return imgCircle;
    }

    public String[] circleString() {
        String[] cirName = {"วงกลม", "วงรี"};
        return cirName;
    }

    public String[] cirFormula() {
        String[] cirFormulaStrings = {
                "พาย R ยกกำลัง 2", "พื้นที่วงรี x สูง"
        };
        return cirFormulaStrings;
    }

    public int[] trResID() {
        int[] imgTriangle = {
                R.drawable.tr_01
        };
        return imgTriangle;
    }

    public String[] trString() {
        String[] triangleName = {"สามเหลี่ยม"};
        return triangleName;
    }

    public String[] trFormula() {
        String[] trianfleFormulaStrings = {
                "0.5 x ฐาน x สูง"
        };
        return trianfleFormulaStrings;
    }
}

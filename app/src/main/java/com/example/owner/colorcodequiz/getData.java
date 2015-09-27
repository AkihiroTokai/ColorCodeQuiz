package com.example.owner.colorcodequiz;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.util.Calendar;

/**
 * Created by OWNER on 2015/09/18.
 */


@ParseClassName("getData")
public class getData extends ParseObject{

        Calendar cal = Calendar.getInstance();
        int nowyear = cal.get(Calendar.YEAR);
        String stnowyear = String.valueOf(nowyear);
        int nowmoth = cal.get(Calendar.MONTH);
        String stnowmonth = String.valueOf(nowmoth);
        int nowday  = cal.get(Calendar.DAY_OF_MONTH);
        String stnowday = String.valueOf(nowday);
        String nowdate =  (stnowyear+stnowmonth+stnowday);

        public int  getull_ColortoCode(){
            return getInt("ull_ColortoCode");
        }
        public void setull_ColortoCode(int ull_ColortoCode){
            put("ull_ColortoCoder", ull_ColortoCode);
        }

        public int  getull_CodetoColor(){
            return getInt("ull_CodetoColor");
        }
        public void setull_CodetoColor(int ull_CodetoColor){
            put("ull_CodetoColor",ull_CodetoColor);
        }

        public int  getnowPoint(){
             return getInt("nowPoint");
        }
        public void setnowPoint(int nowPoint){
            put("nowPoint",nowPoint);
        }

        public int  getgetPoint(){
            return getInt("getPoint"+ nowdate);
        }
        public void setgetPoint(int getPoint) {
            put("getPoint"+nowdate,getPoint);
        }

        public int getnocomp_CodetoColor0(){
            return getInt("nocomp_CodetoColor0");
        }
        public void setnocomp_CodetoColor0(int nocomp_CodetoColor0) {
            put("nocomp_CodetoColor0", nocomp_CodetoColor0);
        }

        public int getnocomp_CodetoColor1(){
            return getInt("nocomp_CodetoColor1");
        }
        public void setnocomp_CodetoColor1(int nocomp_CodetoColor1){
            put ("ocomp_CodetoColor1", nocomp_CodetoColor1);
        }

        public int getnocomp_CodetoColor2(){
            return getInt("nocomp_CodetoColor2");
        }
        public void setnocomp_CodetoColor2(int nocomp_CodetoColor2){
            put("nocomp_CodetoColor2", nocomp_CodetoColor2);
        }

        public int getnocomp_CodetoColor3(){
            return getInt("nocomp_CodetoColor3");
        }
        public void setnocomp_CodetoColor3(int nocomp_CodetoColor3){
            put ("nocomp_CodetoColor3", nocomp_CodetoColor3);
        }

        public int getnocomp_CodetoColor4(){
            return getInt("nocomp_CodetoColor4");
        }
        public void setnocomp_CodetoColor4(int nocomp_CodetoColor4){
            put ("nocomp_CodetoColor4 ", nocomp_CodetoColor4);
        }

        public int getnocomp_CodetoColor5(){
            return getInt ("nocomp_CodetoColor5");
        }
        public void setnocomp_CodetoColor5(int nocomp_CodetoColor5){
            put("nocomp_CodetoColor5", nocomp_CodetoColor5);
        }

        public int getnocomp_CodetoColor6(){
            return getInt("nocomp_CodetoColor6");
        }
        public void setnocomp_CodetoColor6(int nocomp_CodetoColor6){
            put ("nocomp_CodetoColor6", nocomp_CodetoColor6);
        }

        public int getnocomp_CodetoColor7(){
            return getInt("nocomp_CodetoColor7");
        }
        public void setnocomp_CodetoColor7(int nocomp_CodetoColor7){
            put("nocomp_CodetoColor7", nocomp_CodetoColor7);
        }

        public int getnocomp_CodetoColor8(){
           return  getInt ("nocomp_CodetoColor8");
        }
        public void setnocomp_CodetoColor8(int nocomp_CodetoColor8){
            put("nocomp_CodetoColor8 ", nocomp_CodetoColor8);
        }

        public int getnocomp_CodetoColor9(){
            return getInt("nocomp_CodetoColor9");
        }
        public void setnocomp_CodetoColor9(int nocomp_CodetoColor9){
            put ("nocomp_CodetoColor9 ", nocomp_CodetoColor9);
        }

        public int getnocomp_CodetoColor10(){
            return getInt ("nocomp_CodetoColor10");
        }
        public void setnocomp_CodetoColor10(int nocomp_CodetoColor10){
            put ("nocomp_CodetoColor10 ", nocomp_CodetoColor10);
        }

        public int getnocomp_ColortoCode0(){
            return  getInt ("nocomp_ColortoCode0");
        }
        public void setnocomp_ColortoCode0(int nocomp_ColortoCode0){
            put ("nocomp_ColortoCode0", nocomp_ColortoCode0);
        }

        public int getnocomp_ColortoCode1(){
            return getInt("nocomp_ColortoCode1");
        }
        public void setnocomp_ColortoCode1(int nocomp_ColortoCode1){
            put("nocomp_ColortoCode1", nocomp_ColortoCode1);
        }

        public int getnocomp_ColortoCode2(){
            return getInt("nocomp_ColortoCode2");
        }
        public void setnocomp_ColortoCode2(int nocomp_ColortoCode2){
            put ("nocomp_ColortoCode2", nocomp_ColortoCode2 );
        }

        public int getnocomp_ColortoCode3(){
            return getInt("nocomp_ColortoCode3");
        }
        public void setnocomp_ColortoCode3(int nocomp_ColortoCode3){
            put("nocomp_ColortoCode3",nocomp_ColortoCode3);
        }

        public int getnocomp_ColortoCode4(){
            return getInt("nocomp_ColortoCode4");
        }
        public void setnocomp_ColortoCode4(int nocomp_ColortoCode4){
            put ("nocomp_ColortoCode4", nocomp_ColortoCode4);
        }

        public int getnocomp_ColortoCode5(){
            return getInt("nocomp_ColortoCode5");
        }
        public void setnocomp_ColortoCode5(int nocomp_ColortoCode5){
            put("nocomp_ColortoCode5", nocomp_ColortoCode5);
        }

        public int getnocomp_ColortoCode6(){
            return getInt("nocomp_ColortoCode6");
        }
        public void setnocomp_ColortoCode6(int nocomp_ColortoCode6){
            put ("nocomp_ColortoCode6", nocomp_ColortoCode6);
        }

        public int getnocomp_ColortoCode7(){
            return getInt("nocomp_ColortoCode7");
        }
        public void setnocomp_ColortoCode7(int nocomp_ColortoCode7){
            put("nocomp_ColortoCode7", nocomp_ColortoCode7);
        }

        public int getnocomp_ColortoCode8(){
            return getInt("nocomp_ColortoCode8");
        }
        public void setnocomp_ColortoCode8(int nocomp_ColortoCode8){
            put ("nocomp_ColortoCode8", nocomp_ColortoCode8);
        }

        public int getnocomp_ColortoCode9(){
            return getInt("nocomp_ColortoCode9");
        }
        public void setnocomp_ColortoCode9(int nocomp_ColortoCode9){
            put ("nocomp_ColortoCode9 ", nocomp_ColortoCode9);
        }

        public int getnocomp_ColortoCode10(){
            return getInt("nocomp_ColortoCode10");
        }
        public void setnocomp_ColortoCode10(int nocomp_ColortoCode10){
            put("nocomp_ColortoCode10", nocomp_ColortoCode10);
        }
}

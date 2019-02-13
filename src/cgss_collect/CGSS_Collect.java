/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgss_collect;

// API
public class CGSS_Collect {
    public static final int maxPLV = 500;
    public static final int maxStar = 75000;
    public static int pLVtoStarUsage(int pLV) {
        if(pLV <= 0) return -1; // 防呆
        if(pLV >= 1 && pLV <= 3) return 12;
        else if(pLV >= 4 && pLV <= 11) return 11;
        else if(pLV >= 12 && pLV <= 22) return 10;
        else if(pLV >= 23 && pLV <= 37) return 9;
        else if(pLV >= 38 && pLV <= 58) return 8;
        else if(pLV >= 59 && pLV <= 85) return 7;
        else if(pLV >= 86 && pLV <= 129) return 6;
        else if(pLV >= 130 && pLV <= 197) return 5;
        else if(pLV >= 198 && pLV <= 314) return 4;
        else if(pLV >= 315) return 3;
        return 12;
    }
    public static float starToStaminaRecTimes(int star, int pLV) {
        if(star <= 3) return 0.0f;  // 防呆
        return (float)star / pLVtoStarUsage(pLV);
    }
    public static float totalStaminaToPlay(int star, int pLV, int autoRecStam, int stam_pplay) {
        return ((starToStaminaRecTimes(star, pLV) * 10f) + autoRecStam) / stam_pplay;
    }
    public static float totalNumCollect(int star, int pLV, int autoRecStam, int stam_pplay, float coll_pplay) {
        return totalStaminaToPlay(star, pLV, autoRecStam, stam_pplay) * coll_pplay;
    }
    //public static float totalCollectedPT()
}

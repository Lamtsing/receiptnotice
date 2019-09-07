/*
 * Created By WeihuaGu (email:weihuagu_work@163.com)
 * Copyright (c) 2017
 * All right reserved.
 */

package com.weihuagu.receiptnotice;
import java.util.Map;
import java.util.HashMap;

public class ExternalInfoUtil {
        /**
         *
         * 中国银行:106573095566、777795566；

         招商银行:1065795555、10657559555、1065502010095555；

         建设银行:106573095533、80095533；

         工商银行：95588；62019558；010095588；
         　　
         民生银行：10657109095568000、1069088895568；

         农业银行：106366695599、6201395599；

         华夏银行：1065800895577、1069088895577；

         交通银行：106573095559、777795559、555595559000、80095559、

         788895559、797995559
         *
         * */
        public final static Map bankmessagenum = new HashMap() {{
                put("95588", "icbc");
                put("62019558", "icbc");
                put("010095588", "icbc");
                put("106573095566", "boc");
                put("777795566", "boc");
                put("1065795555", "cmbchina");
                put("10657559555", "cmbchina");
                put("1065502010095555", "cmbchina");
                put("106573095533", "ccb");
                put("80095533", "ccb");
                put("10657109095568000", "cmbc");
                put("1069088895568", "cmbc");
        }};

        public static Map getBanksMessageNum(){
                return bankmessagenum;
        }

}

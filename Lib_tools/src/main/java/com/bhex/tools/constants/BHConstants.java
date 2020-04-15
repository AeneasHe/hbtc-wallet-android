package com.bhex.tools.constants;

/**
 * Created by BHEX.
 * User: gdy
 * Date: 2020/3/8
 * Time: 17:51
 */
public class BHConstants {

    public static final String SP_NAME = "SP_BH";

    public static final String FRIST_BOOT = "frist_boot";
    //"com.jrmf360.action.ENTER"
    public static final String  MAIN_PATH = "com.bhex.wallet.action.main";


    public static final int STATUS_COLOR_WHITE = 1;
    public static final int STATUS_COLOR_BLUE = 2;
    public static final int STATUS_COLOR_TRANS = 3;
    public static final int STATUS_COLOR_OTHER = -1;

    public static final String BACKUP_TEXT = "BACKUP_TEXT";
    public static final String BACKUP = "1";
    public static final String LATER_BACKUP = "2";

    public static final String COIN_DEFAULT_LIST = "hbc_btc_eth_tusdt";

    public static final String BHT_TOKEN = "hbc";
    public static final int PAGE_SIZE = 20;

    public static final double BHT_GAS_PRICE = Math.pow(10,12);

    public static final double BHT_DECIMALS = Math.pow(10,18);

    //链内操作
    public static final int INNER_LINK= 1;
    //跨链操作
    public static final int CROSS_LINK= 2;


    public static final byte []BH = new byte[]{5,-54};
    //public static final byte []HBT = new byte[]{2, 16, 103};
    public static final byte []HBT = new byte[]{2, 16, 66};

    public static final String BH_MEMO="test memo";

}
package com.bizcenter.freight.enums;

/**
 * @author: hwx
 * @email: hwx.hwx@bitsun-inc.com
 * @date: 2021/3/9
 */


public enum AirServiceTypeEnums {


    //**物流操作枚举枚举

    // 陆运操作
    TRANSPORTATION("10", "GJ0018","服务类型:提货中转操作"),

    // 仓储操作
    WAREHOUSING("20", "GJ0016","服务类型:仓储操作"),

    // 报关操作
    CUSTOMS_CLEARANCE("30", "GJ0040","服务类型:报关操作"),

    // 清关操作
    CUSTOMS_DELIVERY("40", "GJ0066","服务类型:清关操作"),

    //打板操作
    PLAY_BOARD("50", "GJ0017","服务类型:打板操作"),

    // 安檢操作
    SECURITY_CHECK("60", "GJ0051","服务类型:安檢操作"),

    // 其它订单
    OTHER_ORDER("80", "GJ0051","服务类型:其它订单"),

    // 默认空
    EMPTY("00", "000000","null");

    private String type;

    //对应服务类型默认行政部门code
    private String code;

    //对应服务类型name
    private String typeName;

    AirServiceTypeEnums(String type, String code, String typeName) {
        this.type = type;
        this.code = code;
        this.typeName=typeName;

    }

    public String getType() {
        return type;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getCode() {
        return code;
    }

    public static AirServiceTypeEnums getEnumByCode(String type) {
        for (AirServiceTypeEnums enums : AirServiceTypeEnums.values()) {
            if (type .equals(enums.getType())) {
                return enums;
            }
        }
        return EMPTY;
    }
}

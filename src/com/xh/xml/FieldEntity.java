package com.xh.xml;

import com.xh.utils.Constant;
import com.xh.utils.StringUtils;

public class FieldEntity {
    public boolean use = true;//是否可用
    public boolean click = false;//是否可点击
    public boolean list = false;//是否是列表
    public String id;//布局文件中的id名
    public String name;//类型简称
    public String fullName;//类型全程
    public String fieldName;//字段名

    public FieldEntity(String fullName, String id) {
        this.id = id;
        String packages[] = fullName.split("\\.");
        name = packages[packages.length - 1];
        if(packages.length==1){
         if(Constant.paths.containsKey(fullName))
             this.fullName=Constant.paths.get(fullName);
         else
             this.fullName="android.widget."+fullName;
        }
        use = true;
        String splits[] = id.split("_");
        StringBuffer sb = new StringBuffer("m");
        for (String string : splits) {
            sb.append(StringUtils.firstToUpperCase(string));
        }
        fieldName = sb.toString();
    }

}

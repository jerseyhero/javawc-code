package com.javawc.code.web.controller.code.domain.user;

import java.util.Date;

/**管理员模块
 * Created by sunny on 2016/3/3.
 */
public class Administrator extends User {
    public Integer type;//管理员类型
    public Date validStartDate;//有效期开始时间
    public Date validEndDate;//有效期结束时间
    public String superPassWord;//超级密码(具有不可逆的性操作的行为需要效验超级密码)

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getValidStartDate() {
        return validStartDate;
    }

    public void setValidStartDate(Date validStartDate) {
        this.validStartDate = validStartDate;
    }

    public Date getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(Date validEndDate) {
        this.validEndDate = validEndDate;
    }

    public String getSuperPassWord() {
        return superPassWord;
    }

    public void setSuperPassWord(String superPassWord) {
        this.superPassWord = superPassWord;
    }
}

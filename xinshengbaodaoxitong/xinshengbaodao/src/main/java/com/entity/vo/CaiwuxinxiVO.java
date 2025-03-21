package com.entity.vo;

import com.entity.CaiwuxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 财务信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("caiwuxinxi")
public class CaiwuxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "caiwuxinxi_name")
    private String caiwuxinxiName;


    /**
     * 财务类型
     */

    @TableField(value = "caiwuxinxi_types")
    private Integer caiwuxinxiTypes;


    /**
     * 相关金额
     */

    @TableField(value = "caiwuxinxi_money")
    private Double caiwuxinxiMoney;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 创建时间 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getCaiwuxinxiName() {
        return caiwuxinxiName;
    }


    /**
	 * 获取：标题
	 */

    public void setCaiwuxinxiName(String caiwuxinxiName) {
        this.caiwuxinxiName = caiwuxinxiName;
    }
    /**
	 * 设置：财务类型
	 */
    public Integer getCaiwuxinxiTypes() {
        return caiwuxinxiTypes;
    }


    /**
	 * 获取：财务类型
	 */

    public void setCaiwuxinxiTypes(Integer caiwuxinxiTypes) {
        this.caiwuxinxiTypes = caiwuxinxiTypes;
    }
    /**
	 * 设置：相关金额
	 */
    public Double getCaiwuxinxiMoney() {
        return caiwuxinxiMoney;
    }


    /**
	 * 获取：相关金额
	 */

    public void setCaiwuxinxiMoney(Double caiwuxinxiMoney) {
        this.caiwuxinxiMoney = caiwuxinxiMoney;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：创建时间 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

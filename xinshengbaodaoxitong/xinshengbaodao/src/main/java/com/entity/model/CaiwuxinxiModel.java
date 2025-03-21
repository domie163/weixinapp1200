package com.entity.model;

import com.entity.CaiwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 财务信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CaiwuxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String caiwuxinxiName;


    /**
     * 财务类型
     */
    private Integer caiwuxinxiTypes;


    /**
     * 相关金额
     */
    private Double caiwuxinxiMoney;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 创建时间 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getCaiwuxinxiName() {
        return caiwuxinxiName;
    }


    /**
	 * 设置：标题
	 */
    public void setCaiwuxinxiName(String caiwuxinxiName) {
        this.caiwuxinxiName = caiwuxinxiName;
    }
    /**
	 * 获取：财务类型
	 */
    public Integer getCaiwuxinxiTypes() {
        return caiwuxinxiTypes;
    }


    /**
	 * 设置：财务类型
	 */
    public void setCaiwuxinxiTypes(Integer caiwuxinxiTypes) {
        this.caiwuxinxiTypes = caiwuxinxiTypes;
    }
    /**
	 * 获取：相关金额
	 */
    public Double getCaiwuxinxiMoney() {
        return caiwuxinxiMoney;
    }


    /**
	 * 设置：相关金额
	 */
    public void setCaiwuxinxiMoney(Double caiwuxinxiMoney) {
        this.caiwuxinxiMoney = caiwuxinxiMoney;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：创建时间 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

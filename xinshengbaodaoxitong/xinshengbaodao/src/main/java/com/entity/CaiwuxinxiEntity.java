package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 财务信息
 *
 * @author 
 * @email
 */
@TableName("caiwuxinxi")
public class CaiwuxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CaiwuxinxiEntity() {

	}

	public CaiwuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Caiwuxinxi{" +
            "id=" + id +
            ", caiwuxinxiName=" + caiwuxinxiName +
            ", caiwuxinxiTypes=" + caiwuxinxiTypes +
            ", caiwuxinxiMoney=" + caiwuxinxiMoney +
            ", yonghuId=" + yonghuId +
            ", createTime=" + createTime +
        "}";
    }
}

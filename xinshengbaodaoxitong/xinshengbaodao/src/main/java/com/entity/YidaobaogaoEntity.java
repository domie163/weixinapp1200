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
 * 已到报告
 *
 * @author 
 * @email
 */
@TableName("yidaobaogao")
public class YidaobaogaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YidaobaogaoEntity() {

	}

	public YidaobaogaoEntity(T t) {
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
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 专业确认
     */
    @TableField(value = "zhuanye_types")

    private Integer zhuanyeTypes;


    /**
     * 身份信息
     */
    @TableField(value = "yidaobaogao_paizhao")

    private String yidaobaogaoPaizhao;


    /**
     * 处理状态
     */
    @TableField(value = "yidaobaogao_yesno_types")

    private Integer yidaobaogaoYesnoTypes;


    /**
     * 申请结果
     */
    @TableField(value = "yidaobaogao_yesno_text")

    private String yidaobaogaoYesnoText;


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
	 * 设置：专业确认
	 */
    public Integer getZhuanyeTypes() {
        return zhuanyeTypes;
    }
    /**
	 * 获取：专业确认
	 */

    public void setZhuanyeTypes(Integer zhuanyeTypes) {
        this.zhuanyeTypes = zhuanyeTypes;
    }
    /**
	 * 设置：身份信息
	 */
    public String getYidaobaogaoPaizhao() {
        return yidaobaogaoPaizhao;
    }
    /**
	 * 获取：身份信息
	 */

    public void setYidaobaogaoPaizhao(String yidaobaogaoPaizhao) {
        this.yidaobaogaoPaizhao = yidaobaogaoPaizhao;
    }
    /**
	 * 设置：处理状态
	 */
    public Integer getYidaobaogaoYesnoTypes() {
        return yidaobaogaoYesnoTypes;
    }
    /**
	 * 获取：处理状态
	 */

    public void setYidaobaogaoYesnoTypes(Integer yidaobaogaoYesnoTypes) {
        this.yidaobaogaoYesnoTypes = yidaobaogaoYesnoTypes;
    }
    /**
	 * 设置：申请结果
	 */
    public String getYidaobaogaoYesnoText() {
        return yidaobaogaoYesnoText;
    }
    /**
	 * 获取：申请结果
	 */

    public void setYidaobaogaoYesnoText(String yidaobaogaoYesnoText) {
        this.yidaobaogaoYesnoText = yidaobaogaoYesnoText;
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
        return "Yidaobaogao{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", zhuanyeTypes=" + zhuanyeTypes +
            ", yidaobaogaoPaizhao=" + yidaobaogaoPaizhao +
            ", yidaobaogaoYesnoTypes=" + yidaobaogaoYesnoTypes +
            ", yidaobaogaoYesnoText=" + yidaobaogaoYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}

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
 * 教务处
 *
 * @author 
 * @email
 */
@TableName("jiaowuchu")
public class JiaowuchuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaowuchuEntity() {

	}

	public JiaowuchuEntity(T t) {
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
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 教务负责人名称
     */
    @TableField(value = "jiaowuchu_name")

    private String jiaowuchuName;


    /**
     * 头像
     */
    @TableField(value = "jiaowuchu_photo")

    private String jiaowuchuPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 联系方式
     */
    @TableField(value = "jiaowuchu_phone")

    private String jiaowuchuPhone;


    /**
     * 邮箱
     */
    @TableField(value = "jiaowuchu_email")

    private String jiaowuchuEmail;


    /**
     * 假删
     */
    @TableField(value = "jiaowuchu_delete")

    private Integer jiaowuchuDelete;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：教务负责人名称
	 */
    public String getJiaowuchuName() {
        return jiaowuchuName;
    }
    /**
	 * 获取：教务负责人名称
	 */

    public void setJiaowuchuName(String jiaowuchuName) {
        this.jiaowuchuName = jiaowuchuName;
    }
    /**
	 * 设置：头像
	 */
    public String getJiaowuchuPhoto() {
        return jiaowuchuPhoto;
    }
    /**
	 * 获取：头像
	 */

    public void setJiaowuchuPhoto(String jiaowuchuPhoto) {
        this.jiaowuchuPhoto = jiaowuchuPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getJiaowuchuPhone() {
        return jiaowuchuPhone;
    }
    /**
	 * 获取：联系方式
	 */

    public void setJiaowuchuPhone(String jiaowuchuPhone) {
        this.jiaowuchuPhone = jiaowuchuPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getJiaowuchuEmail() {
        return jiaowuchuEmail;
    }
    /**
	 * 获取：邮箱
	 */

    public void setJiaowuchuEmail(String jiaowuchuEmail) {
        this.jiaowuchuEmail = jiaowuchuEmail;
    }
    /**
	 * 设置：假删
	 */
    public Integer getJiaowuchuDelete() {
        return jiaowuchuDelete;
    }
    /**
	 * 获取：假删
	 */

    public void setJiaowuchuDelete(Integer jiaowuchuDelete) {
        this.jiaowuchuDelete = jiaowuchuDelete;
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
        return "Jiaowuchu{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", jiaowuchuName=" + jiaowuchuName +
            ", jiaowuchuPhoto=" + jiaowuchuPhoto +
            ", sexTypes=" + sexTypes +
            ", jiaowuchuPhone=" + jiaowuchuPhone +
            ", jiaowuchuEmail=" + jiaowuchuEmail +
            ", jiaowuchuDelete=" + jiaowuchuDelete +
            ", createTime=" + createTime +
        "}";
    }
}

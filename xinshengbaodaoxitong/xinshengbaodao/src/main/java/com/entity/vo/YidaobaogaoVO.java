package com.entity.vo;

import com.entity.YidaobaogaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 已到报告
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yidaobaogao")
public class YidaobaogaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

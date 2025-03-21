package com.entity.model;

import com.entity.YidaobaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 已到报告
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YidaobaogaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 专业确认
     */
    private Integer zhuanyeTypes;


    /**
     * 身份信息
     */
    private String yidaobaogaoPaizhao;


    /**
     * 处理状态
     */
    private Integer yidaobaogaoYesnoTypes;


    /**
     * 申请结果
     */
    private String yidaobaogaoYesnoText;


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
	 * 获取：专业确认
	 */
    public Integer getZhuanyeTypes() {
        return zhuanyeTypes;
    }


    /**
	 * 设置：专业确认
	 */
    public void setZhuanyeTypes(Integer zhuanyeTypes) {
        this.zhuanyeTypes = zhuanyeTypes;
    }
    /**
	 * 获取：身份信息
	 */
    public String getYidaobaogaoPaizhao() {
        return yidaobaogaoPaizhao;
    }


    /**
	 * 设置：身份信息
	 */
    public void setYidaobaogaoPaizhao(String yidaobaogaoPaizhao) {
        this.yidaobaogaoPaizhao = yidaobaogaoPaizhao;
    }
    /**
	 * 获取：处理状态
	 */
    public Integer getYidaobaogaoYesnoTypes() {
        return yidaobaogaoYesnoTypes;
    }


    /**
	 * 设置：处理状态
	 */
    public void setYidaobaogaoYesnoTypes(Integer yidaobaogaoYesnoTypes) {
        this.yidaobaogaoYesnoTypes = yidaobaogaoYesnoTypes;
    }
    /**
	 * 获取：申请结果
	 */
    public String getYidaobaogaoYesnoText() {
        return yidaobaogaoYesnoText;
    }


    /**
	 * 设置：申请结果
	 */
    public void setYidaobaogaoYesnoText(String yidaobaogaoYesnoText) {
        this.yidaobaogaoYesnoText = yidaobaogaoYesnoText;
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

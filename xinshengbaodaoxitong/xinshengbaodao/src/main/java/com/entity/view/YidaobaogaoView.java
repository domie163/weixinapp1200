package com.entity.view;

import com.entity.YidaobaogaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 已到报告
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yidaobaogao")
public class YidaobaogaoView extends YidaobaogaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 专业确认的值
		*/
		private String zhuanyeValue;
		/**
		* 处理状态的值
		*/
		private String yidaobaogaoYesnoValue;



		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 报到状态
			*/
			private Integer yonghuTypes;
				/**
				* 报到状态的值
				*/
				private String yonghuValue;

	public YidaobaogaoView() {

	}

	public YidaobaogaoView(YidaobaogaoEntity yidaobaogaoEntity) {
		try {
			BeanUtils.copyProperties(this, yidaobaogaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 专业确认的值
			*/
			public String getZhuanyeValue() {
				return zhuanyeValue;
			}
			/**
			* 设置： 专业确认的值
			*/
			public void setZhuanyeValue(String zhuanyeValue) {
				this.zhuanyeValue = zhuanyeValue;
			}
			/**
			* 获取： 处理状态的值
			*/
			public String getYidaobaogaoYesnoValue() {
				return yidaobaogaoYesnoValue;
			}
			/**
			* 设置： 处理状态的值
			*/
			public void setYidaobaogaoYesnoValue(String yidaobaogaoYesnoValue) {
				this.yidaobaogaoYesnoValue = yidaobaogaoYesnoValue;
			}
















				//级联表的get和set yonghu

					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 报到状态
					*/
					public Integer getYonghuTypes() {
						return yonghuTypes;
					}
					/**
					* 设置： 报到状态
					*/
					public void setYonghuTypes(Integer yonghuTypes) {
						this.yonghuTypes = yonghuTypes;
					}


						/**
						* 获取： 报到状态的值
						*/
						public String getYonghuValue() {
							return yonghuValue;
						}
						/**
						* 设置： 报到状态的值
						*/
						public void setYonghuValue(String yonghuValue) {
							this.yonghuValue = yonghuValue;
						}


}

package com.entity.view;

import com.entity.CaiwuxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 财务信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("caiwuxinxi")
public class CaiwuxinxiView extends CaiwuxinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 财务类型的值
		*/
		private String caiwuxinxiValue;



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

	public CaiwuxinxiView() {

	}

	public CaiwuxinxiView(CaiwuxinxiEntity caiwuxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, caiwuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 财务类型的值
			*/
			public String getCaiwuxinxiValue() {
				return caiwuxinxiValue;
			}
			/**
			* 设置： 财务类型的值
			*/
			public void setCaiwuxinxiValue(String caiwuxinxiValue) {
				this.caiwuxinxiValue = caiwuxinxiValue;
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

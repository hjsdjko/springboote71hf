package com.entity.vo;

import com.entity.JiuyezhidaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 就业指导
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-03 18:24:13
 */
public class JiuyezhidaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 指导标题
	 */
	
	private String zhidaobiaoti;
		
	/**
	 * 指导时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhidaoshijian;
		
	/**
	 * 指导详情
	 */
	
	private String zhidaoxiangqing;
		
	/**
	 * 导师账号
	 */
	
	private String daoshizhanghao;
		
	/**
	 * 导师姓名
	 */
	
	private String daoshixingming;
		
	/**
	 * 学生账号
	 */
	
	private String xueshengzhanghao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
				
	
	/**
	 * 设置：指导标题
	 */
	 
	public void setZhidaobiaoti(String zhidaobiaoti) {
		this.zhidaobiaoti = zhidaobiaoti;
	}
	
	/**
	 * 获取：指导标题
	 */
	public String getZhidaobiaoti() {
		return zhidaobiaoti;
	}
				
	
	/**
	 * 设置：指导时间
	 */
	 
	public void setZhidaoshijian(Date zhidaoshijian) {
		this.zhidaoshijian = zhidaoshijian;
	}
	
	/**
	 * 获取：指导时间
	 */
	public Date getZhidaoshijian() {
		return zhidaoshijian;
	}
				
	
	/**
	 * 设置：指导详情
	 */
	 
	public void setZhidaoxiangqing(String zhidaoxiangqing) {
		this.zhidaoxiangqing = zhidaoxiangqing;
	}
	
	/**
	 * 获取：指导详情
	 */
	public String getZhidaoxiangqing() {
		return zhidaoxiangqing;
	}
				
	
	/**
	 * 设置：导师账号
	 */
	 
	public void setDaoshizhanghao(String daoshizhanghao) {
		this.daoshizhanghao = daoshizhanghao;
	}
	
	/**
	 * 获取：导师账号
	 */
	public String getDaoshizhanghao() {
		return daoshizhanghao;
	}
				
	
	/**
	 * 设置：导师姓名
	 */
	 
	public void setDaoshixingming(String daoshixingming) {
		this.daoshixingming = daoshixingming;
	}
	
	/**
	 * 获取：导师姓名
	 */
	public String getDaoshixingming() {
		return daoshixingming;
	}
				
	
	/**
	 * 设置：学生账号
	 */
	 
	public void setXueshengzhanghao(String xueshengzhanghao) {
		this.xueshengzhanghao = xueshengzhanghao;
	}
	
	/**
	 * 获取：学生账号
	 */
	public String getXueshengzhanghao() {
		return xueshengzhanghao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
			
}

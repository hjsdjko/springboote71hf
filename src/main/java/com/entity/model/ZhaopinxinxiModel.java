package com.entity.model;

import com.entity.ZhaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 招聘信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-03 18:24:13
 */
public class ZhaopinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 招聘标题
	 */
	
	private String zhaopinbiaoti;
		
	/**
	 * 招聘封面
	 */
	
	private String zhaopinfengmian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 岗位
	 */
	
	private String gangwei;
		
	/**
	 * 岗位要求
	 */
	
	private String gangweiyaoqiu;
		
	/**
	 * 薪资
	 */
	
	private Float xinzi;
		
	/**
	 * 招聘详情
	 */
	
	private String zhaopinxiangqing;
		
	/**
	 * 企业账号
	 */
	
	private String qiyezhanghao;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
				
	
	/**
	 * 设置：招聘标题
	 */
	 
	public void setZhaopinbiaoti(String zhaopinbiaoti) {
		this.zhaopinbiaoti = zhaopinbiaoti;
	}
	
	/**
	 * 获取：招聘标题
	 */
	public String getZhaopinbiaoti() {
		return zhaopinbiaoti;
	}
				
	
	/**
	 * 设置：招聘封面
	 */
	 
	public void setZhaopinfengmian(String zhaopinfengmian) {
		this.zhaopinfengmian = zhaopinfengmian;
	}
	
	/**
	 * 获取：招聘封面
	 */
	public String getZhaopinfengmian() {
		return zhaopinfengmian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：岗位
	 */
	 
	public void setGangwei(String gangwei) {
		this.gangwei = gangwei;
	}
	
	/**
	 * 获取：岗位
	 */
	public String getGangwei() {
		return gangwei;
	}
				
	
	/**
	 * 设置：岗位要求
	 */
	 
	public void setGangweiyaoqiu(String gangweiyaoqiu) {
		this.gangweiyaoqiu = gangweiyaoqiu;
	}
	
	/**
	 * 获取：岗位要求
	 */
	public String getGangweiyaoqiu() {
		return gangweiyaoqiu;
	}
				
	
	/**
	 * 设置：薪资
	 */
	 
	public void setXinzi(Float xinzi) {
		this.xinzi = xinzi;
	}
	
	/**
	 * 获取：薪资
	 */
	public Float getXinzi() {
		return xinzi;
	}
				
	
	/**
	 * 设置：招聘详情
	 */
	 
	public void setZhaopinxiangqing(String zhaopinxiangqing) {
		this.zhaopinxiangqing = zhaopinxiangqing;
	}
	
	/**
	 * 获取：招聘详情
	 */
	public String getZhaopinxiangqing() {
		return zhaopinxiangqing;
	}
				
	
	/**
	 * 设置：企业账号
	 */
	 
	public void setQiyezhanghao(String qiyezhanghao) {
		this.qiyezhanghao = qiyezhanghao;
	}
	
	/**
	 * 获取：企业账号
	 */
	public String getQiyezhanghao() {
		return qiyezhanghao;
	}
				
	
	/**
	 * 设置：企业名称
	 */
	 
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
			
}

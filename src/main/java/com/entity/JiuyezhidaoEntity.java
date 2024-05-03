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
 * 就业指导
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-03 18:24:13
 */
@TableName("jiuyezhidao")
public class JiuyezhidaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiuyezhidaoEntity() {
		
	}
	
	public JiuyezhidaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 指导编号
	 */
					
	private String zhidaobianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：指导编号
	 */
	public void setZhidaobianhao(String zhidaobianhao) {
		this.zhidaobianhao = zhidaobianhao;
	}
	/**
	 * 获取：指导编号
	 */
	public String getZhidaobianhao() {
		return zhidaobianhao;
	}
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

package com.entity.view;

import com.entity.JiuyezhidaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 就业指导
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-03 18:24:13
 */
@TableName("jiuyezhidao")
public class JiuyezhidaoView  extends JiuyezhidaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiuyezhidaoView(){
	}
 
 	public JiuyezhidaoView(JiuyezhidaoEntity jiuyezhidaoEntity){
 	try {
			BeanUtils.copyProperties(this, jiuyezhidaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

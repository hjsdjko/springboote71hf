package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiuyezhidaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiuyezhidaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuyezhidaoView;


/**
 * 就业指导
 *
 * @author 
 * @email 
 * @date 2022-05-03 18:24:13
 */
public interface JiuyezhidaoService extends IService<JiuyezhidaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiuyezhidaoVO> selectListVO(Wrapper<JiuyezhidaoEntity> wrapper);
   	
   	JiuyezhidaoVO selectVO(@Param("ew") Wrapper<JiuyezhidaoEntity> wrapper);
   	
   	List<JiuyezhidaoView> selectListView(Wrapper<JiuyezhidaoEntity> wrapper);
   	
   	JiuyezhidaoView selectView(@Param("ew") Wrapper<JiuyezhidaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiuyezhidaoEntity> wrapper);
   	

}


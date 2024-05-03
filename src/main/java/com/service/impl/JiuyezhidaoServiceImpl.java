package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiuyezhidaoDao;
import com.entity.JiuyezhidaoEntity;
import com.service.JiuyezhidaoService;
import com.entity.vo.JiuyezhidaoVO;
import com.entity.view.JiuyezhidaoView;

@Service("jiuyezhidaoService")
public class JiuyezhidaoServiceImpl extends ServiceImpl<JiuyezhidaoDao, JiuyezhidaoEntity> implements JiuyezhidaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiuyezhidaoEntity> page = this.selectPage(
                new Query<JiuyezhidaoEntity>(params).getPage(),
                new EntityWrapper<JiuyezhidaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiuyezhidaoEntity> wrapper) {
		  Page<JiuyezhidaoView> page =new Query<JiuyezhidaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiuyezhidaoVO> selectListVO(Wrapper<JiuyezhidaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiuyezhidaoVO selectVO(Wrapper<JiuyezhidaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiuyezhidaoView> selectListView(Wrapper<JiuyezhidaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiuyezhidaoView selectView(Wrapper<JiuyezhidaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

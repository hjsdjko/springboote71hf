package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiuyezhidaoEntity;
import com.entity.view.JiuyezhidaoView;

import com.service.JiuyezhidaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 就业指导
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-03 18:24:13
 */
@RestController
@RequestMapping("/jiuyezhidao")
public class JiuyezhidaoController {
    @Autowired
    private JiuyezhidaoService jiuyezhidaoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiuyezhidaoEntity jiuyezhidao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("daoshi")) {
			jiuyezhidao.setDaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			jiuyezhidao.setXueshengzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiuyezhidaoEntity> ew = new EntityWrapper<JiuyezhidaoEntity>();
		PageUtils page = jiuyezhidaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiuyezhidao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiuyezhidaoEntity jiuyezhidao, 
		HttpServletRequest request){
        EntityWrapper<JiuyezhidaoEntity> ew = new EntityWrapper<JiuyezhidaoEntity>();
		PageUtils page = jiuyezhidaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiuyezhidao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiuyezhidaoEntity jiuyezhidao){
       	EntityWrapper<JiuyezhidaoEntity> ew = new EntityWrapper<JiuyezhidaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiuyezhidao, "jiuyezhidao")); 
        return R.ok().put("data", jiuyezhidaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiuyezhidaoEntity jiuyezhidao){
        EntityWrapper< JiuyezhidaoEntity> ew = new EntityWrapper< JiuyezhidaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiuyezhidao, "jiuyezhidao")); 
		JiuyezhidaoView jiuyezhidaoView =  jiuyezhidaoService.selectView(ew);
		return R.ok("查询就业指导成功").put("data", jiuyezhidaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiuyezhidaoEntity jiuyezhidao = jiuyezhidaoService.selectById(id);
        return R.ok().put("data", jiuyezhidao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiuyezhidaoEntity jiuyezhidao = jiuyezhidaoService.selectById(id);
        return R.ok().put("data", jiuyezhidao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiuyezhidaoEntity jiuyezhidao, HttpServletRequest request){
    	jiuyezhidao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiuyezhidao);
        jiuyezhidaoService.insert(jiuyezhidao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiuyezhidaoEntity jiuyezhidao, HttpServletRequest request){
    	jiuyezhidao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiuyezhidao);
        jiuyezhidaoService.insert(jiuyezhidao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiuyezhidaoEntity jiuyezhidao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiuyezhidao);
        jiuyezhidaoService.updateById(jiuyezhidao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiuyezhidaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiuyezhidaoEntity> wrapper = new EntityWrapper<JiuyezhidaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("daoshi")) {
			wrapper.eq("daoshizhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xueshengzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiuyezhidaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}

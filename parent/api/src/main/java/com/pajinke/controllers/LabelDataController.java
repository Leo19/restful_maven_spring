package com.pajinke.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pajinke.api.util.Servlets;
import com.pajinke.service.LabelDataService;
import com.pajinke.service.TestService;
import com.pajinke.util.persistence.Page;

/**
 * Created by liushun on 16/3/31.
 */
@Controller
@RequestMapping(value = "/userprofile")
public class LabelDataController {

	private static Logger logger = LoggerFactory.getLogger(LabelDataController.class);
    private final String text = "text/plain;charset=UTF-8";
    private final String json = "application/json;charset=UTF-8";

    @Autowired
    private LabelDataService labelDataService;
    
    private TestService testService;
    public TestService getTestService() {
		return testService;
	}

	@Autowired(required=true)
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
    
    @RequestMapping(value = "/hi", produces = text)
    public @ResponseBody
    String sayHi() {
        return "hi Leo";
    }

    @RequestMapping(value = "/hi/{msg}", produces = json)
    public @ResponseBody
    String leoSay(@PathVariable(value = "msg") String msg) {
        return "{name: leo, msg:"+ msg + "}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Object getUsers() {
    	logger.info("its a test");
    	List<Map<String, Object>> list = testService.getUsers();    	
    	
    	return list;
    }
    @RequestMapping(value = "/quickQuery")
    @ResponseBody
    public Object quickQuery(ServletRequest request) {
		Map<String, Object> searchParams = Servlets.getParametersStartingWith(request, "search_");
		List<Map<String, Object>> list = testService.quickQuery(searchParams);
    	return list;
    }
    
    @RequestMapping(value = "/count")
    @ResponseBody
    public Object countLabelData(ServletRequest request) {
		Map<String, Object> searchParams = Servlets.getParametersStartingWith(request, "search_");
		int rowCount = labelDataService.countLabelData(searchParams);
		Map<String,Object> resultMap = new HashMap<String,Object>();
		String status = "success";
		
		resultMap.put("result",rowCount);
		resultMap.put("status",status);
    	return resultMap;
    }
    
    @RequestMapping(value = "/label")
    @ResponseBody
    public Object getUserProfileLabels(ServletRequest request) {
		// 查询参数
    	Map<String, Object> searchParams = Servlets.getParametersStartingWith(request, "search_");
		
    	// 查询字段
    	String strColumn = request.getParameter("column");
    	
    	// 分页信息
		Page<Map<String,Object>> page = new Page<Map<String,Object>>();
		String strPageNo = request.getParameter("pageNo");
		String strPageSize = request.getParameter("pageSize");
		
		int pageNo = (StringUtils.isBlank(strPageNo)) ? 1 : Integer.parseInt(strPageNo);
		int pageSize = (StringUtils.isBlank(strPageSize)) ? 100 : Integer.parseInt(strPageSize);
		page.setPageNo(pageNo);
		page.setPageSize(pageSize);

		Page<Map<String,Object>> pageResult = labelDataService.getUserProfileLabels(searchParams,page,strColumn);
		Map<String,Object> resultMap = new HashMap<String,Object>();
		String status = "success";
		
		resultMap.put("result",pageResult);
		resultMap.put("status",status);
    	return resultMap;
    }
}

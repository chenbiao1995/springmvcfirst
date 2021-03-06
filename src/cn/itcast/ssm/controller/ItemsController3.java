package cn.itcast.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.Items;


//实现controller借口的处理器
//实现注解的handler
//使用controller标识它是一个控制器
@Controller
public class ItemsController3 {
	
	
	//商品查询列表
	//@RequestMapping实现对queryItems()和url进行映射，一个方法对应一个url
	//一般建议url和方法写成一样
	@RequestMapping("/queryItems")
	public ModelAndView queryItems()throws Exception {
		
		//调用service查询数据库，查询商品列表，这里使用静态数据模拟
		List<Items> itemsList = new ArrayList<Items>();
		//向list中填充静态数据
		Items items_1 = new Items();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
		
		Items items_2 = new Items();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机！");
		
		itemsList.add(items_1);
		itemsList.add(items_2);
		//返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		//相当于request的setAttribute,再jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", itemsList);
		
		//指定视图
//		modelAndView.setViewName("WEB-INF/jsp/items/itemsList.jsp");
		modelAndView.setViewName("items/itemsList");

		return modelAndView;
	}
//	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		//调用service查询数据库，查询商品列表，这里使用静态数据模拟
//		List<Items> itemsList = new ArrayList<Items>();
//		//向list中填充静态数据
//		Items items_1 = new Items();
//		items_1.setName("联想笔记本");
//		items_1.setPrice(6000f);
//		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
//		
//		Items items_2 = new Items();
//		items_2.setName("苹果手机");
//		items_2.setPrice(5000f);
//		items_2.setDetail("iphone6苹果手机！");
//		
//		itemsList.add(items_1);
//		itemsList.add(items_2);
//		//设置模型数据
//		request.setAttribute("itemsList", itemsList);
//		//设置转发的视图
//		request.getRequestDispatcher("WEB-INF/jsp/items/itemsList.jsp").forward(request, response);
//	}

//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		
//		//调用service查询数据库，查询商品列表，这里使用静态数据模拟
//		List<Items> itemsList = new ArrayList<Items>();
//		//向list中填充静态数据
//		Items items_1 = new Items();
//		items_1.setName("联想笔记本");
//		items_1.setPrice(6000f);
//		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
//		
//		Items items_2 = new Items();
//		items_2.setName("苹果手机");
//		items_2.setPrice(5000f);
//		items_2.setDetail("iphone6苹果手机！");
//		
//		itemsList.add(items_1);
//		itemsList.add(items_2);
//
//		//返回ModelAndView
//		ModelAndView modelAndView = new ModelAndView();
//		//相当于request的setAttribute,再jsp页面中通过itemsList取数据
//		modelAndView.addObject("itemsList", itemsList);
//		
//		//指定视图
//		modelAndView.setViewName("WEB-INF/jsp/items/itemsList.jsp");
//		
//		return modelAndView;
//	}

}

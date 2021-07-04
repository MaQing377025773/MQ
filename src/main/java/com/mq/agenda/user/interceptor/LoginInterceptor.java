package com.mq.agenda.user.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//登录检查
//public class LoginInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//       HttpSession session = request.getSession();
//       Object loginUser = session.getAttribute("loginuser");
//       if(loginUser != null){
//           return true;
//       }
//       //拦截,跳转到登陆页
//        request.setAttribute("msg","请先登录吧！");
////        response.sendRedirect("/");
//        request.getRequestDispatcher("/").forward(request,response);
//        return false;
//    }
//    //目标方法执行完成以后
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//    }
//    //
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
//}

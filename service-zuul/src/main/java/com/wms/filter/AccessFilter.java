package com.wms.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Classname AccessFilter
 * @Description 路由过滤器，可用来做一些权限校验，与业务模块解耦，
 * @Date 2020/2/27 10:06
 * @Created by ZF-JS
 */
@Component
public class AccessFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }


    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object token = request.getParameter("token");
        if(null == token){
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().print("token is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

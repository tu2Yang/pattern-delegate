package com.pattern.delegate.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/14 0014 下午 9:32
 * @Version 1.0
 */
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDsspatch(req, resp);
    }

    private void doDsspatch(HttpServletRequest req, HttpServletResponse resp) {

        String uri = req.getRequestURI();
        String mid = req.getParameter("mid");



    }
}

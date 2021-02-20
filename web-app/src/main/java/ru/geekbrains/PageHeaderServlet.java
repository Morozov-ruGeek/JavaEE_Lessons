package ru.geekbrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/page_header")

public class PageHeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String header = (String) req.getAttribute("pageHeader");
        resp.getWriter().println("<h1>" + header + "</h1>");

        resp.getWriter().println("<ul>");
        resp.getWriter().println("<li><a href='" + getServletContext().getContextPath() + "/main'>Главная страница</a></li>");
        resp.getWriter().println("<li><a href='" + getServletContext().getContextPath() + "/main/catalog'>Каталог товаров</a></li>");
        resp.getWriter().println("<li><a href='" + getServletContext().getContextPath() + "/main/catalog/product'>Товар</a></li>");
        resp.getWriter().println("<li><a href='" + getServletContext().getContextPath() + "/main/cart'>Корзина заказа</a></li>");
        resp.getWriter().println("<li><a href='" + getServletContext().getContextPath() + "/main/cart/order'>Оформление заказа</a></li>");
        resp.getWriter().println("</ul>");
    }
}

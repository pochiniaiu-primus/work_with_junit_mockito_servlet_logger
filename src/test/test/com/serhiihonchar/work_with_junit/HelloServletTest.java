package com.serhiihonchar.work_with_junit;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class HelloServletTest {

// HttpServletRequest req,
// HttpServletResponse resp

    @Test
    public void testDoGet() throws ServletException, IOException {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);

        when(req.getParameter("login")).thenReturn("admin");

        PipedReader pipedReader = new PipedReader();
        PipedWriter pipedWriter = new PipedWriter(pipedReader);
        PrintWriter printWriter = new PrintWriter(pipedWriter, true);
        when(resp.getWriter()).thenReturn(printWriter);


        HelloServlet servlet = new HelloServlet();
        servlet.doGet(req, resp);

        Scanner scanner = new Scanner(pipedReader);
        Assert.assertEquals("Hi, admin!", scanner.nextLine());
        scanner.close();
    }
}

package com.cobratms.service;

import com.cobratms.domain.Employee;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;


@SpringBootTest
public class EmployeeServiceTest {

    @MockBean
    private EmployeeService service;


    @Test
    public void testDummyFromService() throws Exception {
        when(service.getByEmployeeID(1)).thenReturn(new Employee());
    }
}

package com.tpe.controller;

import com.tpe.domain.Customer;
import com.tpe.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class CustomerControllerTest {

    @Mock//CustomerService tipinde mock bir obje oluşturulmasını sağlar
    private CustomerService customerService;//mock

    @InjectMocks
    private CustomerController customerController;//bean


    @Test
    void testGetCustomer(){

        //verilen
        Customer customer=new Customer(1L,"Ali","Can","user");

        when(customerService.getCustomerById(1L)).thenReturn(customer);

        //işlem
        ResponseEntity<Customer> response =customerController.getCustomer(1L);

        //beklenen
        assertEquals(HttpStatus.OK,response.getStatusCode());
        assertEquals(customer,response.getBody());
        verify(customerService).getCustomerById(1L);
    }

    @Test
    void testDeleteCustomer(){

        //gerçekleşen işlem
        ResponseEntity<String> response=customerController.deleteCustomer(2L);

        //beklenen
        assertEquals(HttpStatus.OK,response.getStatusCode());
        assertEquals("Customer is deleted.",response.getBody());
        verify(customerService,times(1)).deleteCustomer(2L);

    }






}
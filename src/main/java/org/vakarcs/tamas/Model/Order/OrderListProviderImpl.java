package org.vakarcs.tamas.Model.Order;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.vakarcs.tamas.Adapter.HttpAdapter;
import org.vakarcs.tamas.Customer;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OrderListProviderImpl implements OrderListProvider{
    private String url = "https://semtex.tk/progtech";
    private final HttpAdapter httpAdapter;

    public OrderListProviderImpl(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    @Override
    public List<OrderElement> getOrderList(Customer customer) throws IOException {
        InputStream response = httpAdapter.get(url+"?customerid="+customer.getCustomerID().toString());

        List<OrderElement> orderList = new ObjectMapper().readValue(response, new TypeReference<List<OrderElement>>(){});

        return orderList;
    }
}

package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("7");

        //When
        invoiceDao.save(invoice);

        //Then
        int id = invoice.getId();
        Invoice readInvoice = invoiceDao.findOne(id);
        Assert.assertEquals(id, readInvoice.getId());

        //CleanUp
        invoiceDao.delete(id);
    }
}

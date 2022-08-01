package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee salariedEmployee;

  @Before
  public void setUp() throws Exception {
    salariedEmployee = new SalariedEmployee("Carl Walker", new Date(2022, 7, 5), 2000D);

  }

  @Test
  public void pay() {
    assertEquals(2000D, salariedEmployee.pay(), 0.005);
  }

  @Test
  public void payTaxes() {
    assertEquals(2000D * TaxPayer.SALARIED_TAX_RATE, salariedEmployee.payTaxes(), 0.005);
  }
}
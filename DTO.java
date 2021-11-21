package com.fyu.dto;

import com.fyu.dao.*;

public class DTO
{
    //---------------------------------------------------------------------------
    //------------------------------accounts-------------------------------------

    static public void saveAccount(Account account)
    {
        Database.accounts.add(account);
    }
    static public void deleteAccount(long  accountId)
    {
        for(Account account:Database.accounts )
        {
            if (account.getAccountId() == accountId)
            {
                Database.accounts.remove(account);
                break;
            }

        }
    }

    static public Account findAccount(long  accountId)
    {
        for(Account account:Database.accounts )
        {
            if (account.getAccountId() == accountId)
            {
                return account;
            }

        }
        return null;
    }




    //--------------------------------------------------------------------------------------

    //--------------------------------------customers----------------------------------------

    static public void saveCustomer(Customer customer)
    {
        Database.customers.add(customer);
    }

    static public void deleteCustomer(long  customerId)
    {
        for(Customer customer:Database.customers )
        {
            if (customer.getCustomerId() == customerId)
            {
                Database.customers.remove(customer);
                break;
            }

        }
    }

    static public Customer findCustomer(long  customerId)
    {
        for(Customer customer:Database.customers )
        {
            if (customer.getCustomerId() == customerId)
            {
                return customer;
            }

        }
        return null;
    }

//---------------------------------------------------------------------------
//------------------------------employees-------------------------------------
static public void saveEmployee(Employee employee)
{
    Database.employees.add(employee);
}


    static public void deleteEmployee(long  employeeId)
    {
        for(Employee employee:Database.employees )
        {
            if (employee.getEmployeeId() == employeeId)
            {
                Database.employees.remove(employee);
                break;
            }

        }
    }
    static public Employee findEmployee(long   employeeId)
    {
        for( Employee  employee:Database.employees )
        {
            if ( employee.getEmployeeId() == employeeId)
            {
                return  employee;
            }

        }
        return null;
    }
    
  //---------------------------------------------------------------------------
  //------------------------------managers-------------------------------------
  static public void saveManager(Manager manager)
  {
      Database.managers.add(manager);
  }


      static public void deleteManager(long  managerId)
      {
          for(Manager manager:Database.managers)
          {
              if (manager.getManagerId() == managerId)
              {
                  Database.managers.remove(manager);
                  break;
              }

          }
      }
      static public Manager findManager(long managerId)
      {
          for( Manager  manager:Database.managers)
          {
              if ( manager.getManagerId() == managerId)
              {
                  return  manager;
              }

          }
          return null;
      }

}
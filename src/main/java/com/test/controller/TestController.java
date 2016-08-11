package com.test.controller;

import com.test.service.AccountInfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yzw on 2016/1/17.
 * for test
 */
@RestController
public class TestController {

    @RequestMapping (path = "/follow",method = RequestMethod.GET)
    public Object follow(){
        System.out.println("follow ");
        return "follow fun";
    }

    @RequestMapping (path= "/api2/account/query" , method = RequestMethod.GET)
    public Object query() {
        AccountInfo accountInfo = new AccountInfo();
        accountInfo.Id = 1L;
        accountInfo.ParentId = null;
        accountInfo.Name = "试用组合";
        accountInfo.AccountNo = "Default_Portfolio";
        accountInfo.OpenDate = "2015-05-18";
        accountInfo.AccountType = "EQUITY";
        accountInfo.Status = "INACTIVE";
        accountInfo.BenchMark = new AccountInfo.Benchmark ();
        accountInfo.BenchMark.Id = 1782L;
        accountInfo.BenchMark.Name = "沪深300";
        accountInfo.BenchMark.TickerSymbol = "000300";

        AccountInfo accountInfo1 = new AccountInfo();
        accountInfo1.Id = 2L;
        accountInfo1.ParentId = 1L;
        accountInfo1.Name = "试用组合_默认子组合";
        accountInfo1.AccountNo = "Default_Portfolio-001";
        accountInfo1.OpenDate = "2015-05-18";
        accountInfo1.AccountType = "EQUITY";
        accountInfo1.Status = "INACTIVE";
        accountInfo1.BenchMark = new AccountInfo.Benchmark ();
        accountInfo1.BenchMark.Id = 1782L;
        accountInfo1.BenchMark.Name = "沪深300";
        accountInfo1.BenchMark.TickerSymbol = "000300";

        List list = new ArrayList<> ();
        list.add (accountInfo);

        return list;
    }
}

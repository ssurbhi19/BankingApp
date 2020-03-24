package com.app.controller;

import com.app.dao.BankDAO;
import com.app.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankController
{
    @Autowired
    private BankDAO bankDAO;

    @RequestMapping(value = "/saveBranch", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Bank addBranch(@RequestBody Bank bank)
    {
        bankDAO.save(bank);
        return bank;
    }

    @RequestMapping(value = "/saveBranchUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Bank addBranchUser(@RequestBody Bank bank)
    {
        bankDAO.saveBranchUSer(bank);
        return bank;
    }

    @RequestMapping(value = "/getBranch" )
    public List<Bank> getBranch()
    {
        return bankDAO.getAll();
    }

    @RequestMapping(value="/deleteBranch", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Bank removeBranch(@RequestBody Bank bank)
    {
        bankDAO.deleteBranch(bank);
        return bank;
    }

    @RequestMapping(value="/updateBranch", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Bank update(@RequestBody Bank bank)
    {
        bankDAO.updateBranch(bank);
        return bank;
    }

}



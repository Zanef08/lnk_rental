
import Contract.contractDTO;
import User.userDAO;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author f1nn
 */
public class Test {
    public static void main(String[] args) {
        userDAO dao = new userDAO();
        List<contractDTO> list = dao.searchUpcomming("6");
        for(contractDTO o : list){
            System.out.println(o);
        }
    }
}
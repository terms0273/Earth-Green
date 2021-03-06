/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import models.Account;
import play.data.validation.Constraints.*;

/**
 *
 * @author y-aiyoshizawa
 */
public class EditUser {
    @Required(message="userIdが空白です")
    public String userId;
    
    @Required(message="nickNameが空白です")
    public String nickName;
    
    public EditUser(){}
    public EditUser(Account user){
        userId = user.userName;
        nickName = user.fullName;
    }
}

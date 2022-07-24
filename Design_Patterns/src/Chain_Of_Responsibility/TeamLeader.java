/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chain_Of_Responsibility;

/**
 *
 * @author Thiru_Shashi
 */
public class TeamLeader extends LeaveHandler {

   @Override
    public String applyLeave(Leave leave) {
       
        
        if(leave.getNumberOfDays() <= 7){            
            if(leave.getEmpTier() <= 4){
                return "Your leave days has been APPROVED by TeamLeader";
            }else{
                return "You employee Tier level is too low for request " + leave.getNumberOfDays() + " days";
            }
        }else{
            return superVisor.applyLeave(leave);
        }    }
  
}

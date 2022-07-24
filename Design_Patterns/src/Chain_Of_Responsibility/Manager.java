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
public class Manager extends LeaveHandler {

   @Override
    public String applyLeave(Leave leave) {
        if (leave.getNumberOfDays() > 21) {
            
            if (leave.getEmpTier() <= 2 && leave.getReason().equals(ReasonType.MEDICAL)) {
                return "Your leave days has been APPROVED by Manager";
            }
        }
            return "Your leave request has been DENIED by Manager";
    }
    
       
}

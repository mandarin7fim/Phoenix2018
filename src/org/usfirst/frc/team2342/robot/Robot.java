package org.usfirst.frc.team2342.robot;


import org.usfirst.frc.team2342.robot.subsystems.WestCoastTankDrive;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This is a demo program showing how to use Mecanum control with the RobotDrive
 * class.
 */
public class Robot extends SampleRobot {

	Joystick gamepad = new Joystick(0);
	TalonSRX test = new TalonSRX(1);
	WestCoastTankDrive westCoast = WestCoastTankDrive.getInstance();

    @Override
    public void operatorControl() {
    	while(isEnabled()){
    		//Drive with joystick control in velocity mode
    		westCoast.setOpenLoop(gamepad.getRawAxis(1), gamepad.getRawAxis(1));
    		westCoast.outputToSmartDashboard();
    		//Buttons 8 & 9 or (gamepad) 5 & 6 are Low & High gear, respectively
    		if (gamepad.getRawButton(5))
    			westCoast.setLowGear();
    		else if (gamepad.getRawButton(6))
    			westCoast.setHighGear();
    		else 
    			westCoast.setNoGear();
    		
    		//Sleep for 0.01s
    		try {
    		    Thread.sleep(10);
    		} catch(InterruptedException ex) {
    		    Thread.currentThread().interrupt();
    		}
    	}
    }
    
    @Override
    public void test(){
    }
}

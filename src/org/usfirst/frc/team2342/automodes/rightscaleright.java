package org.usfirst.frc.team2342.automodes;

import org.usfirst.frc.team2342.commands.DriveDistance;
import org.usfirst.frc.team2342.robot.subsystems.WestCoastTankDrive;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class rightscaleright extends CommandGroup {
	public rightscaleright(WestCoastTankDrive westCoast){
		addSequential(new DriveDistance(westCoast, 22));
		//turn 90 degrees to the left
	}
}

// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4949.RobotSteamWorks.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4949.RobotSteamWorks.Robot;

/**
 *
 */
public class StrafeRight extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
    private double m_Distance;
    private double m_Speed;
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	private double strafeRightSpeed;
	private double distance;
	private double distanceMoved;
	private double startTimeMillis;
	private double currentTimeMillis;
	private double error;
	private final double kTolerance = 0.1;
	private final double kP = -1.0 / 5.0;
	private final double kSpeedConv = 0.008; 
	
	public StrafeRight() {
		this(10, 0.5);
	}

	public StrafeRight(double dist) {
		this(dist, 0.5);
	}

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public StrafeRight(double Distance, double Speed) {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        m_Distance = Distance;
        m_Speed = Speed;

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drive);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
		distance = Distance;
		strafeRightSpeed = Speed;

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	error = distance;
    	startTimeMillis = System.currentTimeMillis();
		Robot.drive.getRightFrontEncoder().reset();
		Robot.drive.getLeftFrontEncoder().reset();
		Robot.drive.getRightRearEncoder().reset();
		Robot.drive.getLeftRearEncoder().reset();
		setTimeout(2);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.hasEncoders) {
    		error = (distance - Robot.drive.getRightFrontEncoder().getDistance());
    	} else {
        	currentTimeMillis = System.currentTimeMillis();
        	distanceMoved = (currentTimeMillis - startTimeMillis) * strafeRightSpeed * kSpeedConv;
    		error = distance - distanceMoved;
    	}
		if (strafeRightSpeed * kP * error >= strafeRightSpeed) {
			Robot.drive.mecanumDrive(strafeRightSpeed, 
					0, 0, 0);
		} else {
			Robot.drive.mecanumDrive(strafeRightSpeed * kP * error, 
					0, 0, 0);
		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (error <= 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

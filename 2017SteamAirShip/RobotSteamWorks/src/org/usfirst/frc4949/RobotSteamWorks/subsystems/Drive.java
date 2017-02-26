// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4949.RobotSteamWorks.subsystems;

import org.usfirst.frc4949.RobotSteamWorks.RobotMap;
import org.usfirst.frc4949.RobotSteamWorks.commands.*;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drive extends Subsystem { 

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Encoder rfEncoder = RobotMap.driverfEncoder;
    private final Encoder rrEncoder = RobotMap.driverrEncoder;
    private final Encoder lfEncoder = RobotMap.drivelfEncoder;
    private final Encoder lrEncoder = RobotMap.drivelrEncoder;
    private final SpeedController lfMotorController = RobotMap.drivelfMotorController;
    private final SpeedController rrMotorController = RobotMap.driverrMotorController;
    private final SpeedController rfMotorController = RobotMap.driverfMotorController;
    private final SpeedController lrMotorController = RobotMap.drivelrMotorController;
    private final RobotDrive robotDrive = RobotMap.driveRobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final ADXRS450_Gyro spiGyro = RobotMap.driveADXRS450_Gyro;


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new SweepField());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

	/**
	 * @param joy
	 */
	public void mecanumDrive(Joystick joy) {
		robotDrive.mecanumDrive_Cartesian(joy.getX(), joy.getY(), joy.getZ(), 0);
	}

	/**
	 * @param xAxis
	 *            X axis value
	 * @param yAxis
	 *            Y axis value
	 * @param zAxis
	 *            Z axis value
	 */
	public void mecanumDrive(double xAxis, double yAxis, double zAxis, double angle) {
		robotDrive.mecanumDrive_Cartesian(xAxis, yAxis, zAxis, angle);
	}

	/**
	 * Stop the drive from moving.
	 */
	public void stop() {
		robotDrive.mecanumDrive_Cartesian(0, 0, 0, 0);
	}

	/**
	 * @return The encoder getting the distance and speed of left front of the
	 *         drive.
	 */
	public Encoder getLeftFrontEncoder() {
		return lfEncoder;
	}

	/**
	 * @return The encoder getting the distance and speed of left rear of the
	 *         drive.
	 */
	public Encoder getLeftRearEncoder() {
		return lrEncoder;
	}

	/**
	 * @return The encoder getting the distance and speed of right front of the
	 *         drive.
	 */
	public Encoder getRightFrontEncoder() {
		return rfEncoder;
	}
	
	/**
	 * @return The encoder getting the distance and speed of right rear of the
	 *         drive.
	 */
	public Encoder getRightRearEncoder() {
		return rrEncoder;
	}

	/**
	 * @return The current angle of the drive.
	 */
	public double getAngle() {
		return spiGyro.getAngle();
	}
}


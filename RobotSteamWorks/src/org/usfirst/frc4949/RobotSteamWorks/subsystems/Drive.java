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
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
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
    private final Encoder quadratureEncoder1 = RobotMap.driveQuadratureEncoder1;
    private final Encoder quadratureEncoder2 = RobotMap.driveQuadratureEncoder2;
    private final Encoder quadratureEncoder3 = RobotMap.driveQuadratureEncoder3;
    private final Encoder quadratureEncoder4 = RobotMap.driveQuadratureEncoder4;
    private final SpeedController speedController1 = RobotMap.driveSpeedController1;
    private final SpeedController speedController2 = RobotMap.driveSpeedController2;
    private final SpeedController speedController3 = RobotMap.driveSpeedController3;
    private final SpeedController speedController4 = RobotMap.driveSpeedController4;
    private final AnalogGyro analogGyro = RobotMap.driveAnalogGyro;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}


// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4949.RobotSteamWorks;

import org.usfirst.frc4949.RobotSteamWorks.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc4949.RobotSteamWorks.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI { 
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton button01;
    public JoystickButton button02;
    public JoystickButton button03;
    public JoystickButton button04;
    public JoystickButton button05;
    public JoystickButton button06;
    public JoystickButton button07;
    public JoystickButton button08;
    public JoystickButton button09;
    public JoystickButton button10;
    public Joystick joystick1;
    public JoystickButton testButton01;
    public JoystickButton testButton02;
    public JoystickButton testButton03;
    public JoystickButton testButton04;
    public JoystickButton testButton05;
    public Joystick joystick2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick2 = new Joystick(1);
        
        testButton05 = new JoystickButton(joystick2, 5);
        testButton05.whenPressed(new Pivot(0, 0));
        testButton04 = new JoystickButton(joystick2, 4);
        testButton04.whenPressed(new StrafeRight(0, 0));
        testButton03 = new JoystickButton(joystick2, 4);
        testButton03.whenPressed(new StrafeLeft(0, 0));
        testButton02 = new JoystickButton(joystick2, 2);
        testButton02.whenPressed(new DriveBackward(0, 0));
        testButton01 = new JoystickButton(joystick2, 1);
        testButton01.whenPressed(new DriveForward(0, 0));
        joystick1 = new Joystick(0);
        
        button10 = new JoystickButton(joystick1, 10);
        button10.whileHeld(new BoxToLevel1());
        button09 = new JoystickButton(joystick1, 9);
        button09.whileHeld(new BoxToLevel1());
        button08 = new JoystickButton(joystick1, 8);
        button08.whileHeld(new PanRight());
        button07 = new JoystickButton(joystick1, 7);
        button07.whileHeld(new PanLeft());
        button06 = new JoystickButton(joystick1, 6);
        button06.whileHeld(new WinGame());
        button05 = new JoystickButton(joystick1, 5);
        button05.whileHeld(new ShakeBox());
        button04 = new JoystickButton(joystick1, 4);
        button04.whileHeld(new DriveToGearLift());
        button03 = new JoystickButton(joystick1, 3);
        button03.whileHeld(new BoxToLevel2());
        button02 = new JoystickButton(joystick1, 2);
        button02.whileHeld(new BoxToLevel1());
        button01 = new JoystickButton(joystick1, 1);
        button01.whileHeld(new ShakeBox());


        // SmartDashboard Buttons
        SmartDashboard.putData("WinGame", new WinGame());
        SmartDashboard.putData("BoxToLevel1", new BoxToLevel1());
        SmartDashboard.putData("BoxToLevel2", new BoxToLevel2());
        SmartDashboard.putData("ShakeBox", new ShakeBox());
        SmartDashboard.putData("PanLeft", new PanLeft());
        SmartDashboard.putData("PanRight", new PanRight());
        SmartDashboard.putData("TiltUp", new TiltUp());
        SmartDashboard.putData("SweepField", new SweepField());
        SmartDashboard.putData("TiltDown", new TiltDown());
        SmartDashboard.putData("ApproachBoiler", new ApproachBoiler());
        SmartDashboard.putData("DriveToBoiler", new DriveToBoiler());
        SmartDashboard.putData("CrossBaseLine", new CrossBaseLine());
        SmartDashboard.putData("ApproachLift", new ApproachLift());
        SmartDashboard.putData("DriveToGearLift", new DriveToGearLift());
        SmartDashboard.putData("LoadFuelInLowerTarget", new LoadFuelInLowerTarget());
        SmartDashboard.putData("HangGear", new HangGear());
        SmartDashboard.putData("AutoCommand", new AutoCommand());
        SmartDashboard.putData("DriveForward", new DriveForward());
        SmartDashboard.putData("DriveBackward", new DriveBackward());
        SmartDashboard.putData("StrafeLeft", new StrafeLeft());
        SmartDashboard.putData("StrafeRight", new StrafeRight());
        SmartDashboard.putData("Pivot", new Pivot());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }

    public Joystick getJoystick2() {
        return joystick2;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}


// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;


import ma5951.utils.motor.MA_Falcon;
import ma5951.utils.motor.Piston;
import ma5951.utils.RobotConstants;
import ma5951.utils.subsystem.MotorSubsystem;
import ma5951.utils.subsystem.PistonSubsystem;


public class Intake implements MotorSubsystem,PistonSubsystem{
  /** Creates a new Intake. */
  private MA_Falcon IntakeMotor;
  private Piston intakePiston;
  public static Intake intake;

  public Intake() {
    IntakeMotor = new MA_Falcon(6, true, NeutralMode.Coast);
    intakePiston = new Piston(RobotConstants.P_ID2,RobotConstants.P_ID3);

  }

  @Override
  public void periodic() {
    //JoystickContainer.AButton.whileActiveContinuous(new MotorCommand(new Intake(), -0.8));
  }

  @Override
  public boolean canMove() {
    return true;
  }

  @Override
  public void setVoltage(double voltage) {
    IntakeMotor.setVoltage(voltage);
  }

  @Override
  public void open() {
    intakePiston.set(false);
  }

  @Override
  public void close() {
    intakePiston.set(true);
  }

  @Override
  public boolean isOpen() {
    return intakePiston.get();
  }

  @Override
  public void off() {
    intakePiston.off();
    
  }
  public static Intake getinstance(){
    if (intake == null){
      intake = new Intake();
    }
    return intake;
  }
}

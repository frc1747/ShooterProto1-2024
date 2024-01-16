// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {

  public static TalonFX left;
  public static TalonFX right;

  /** Creates a new Shooter. */
  public Shooter() {
    left = new TalonFX(Constants.LEFT);
    right = new TalonFX(Constants.RIGHT);
    left.setNeutralMode(NeutralMode.Brake);
    right.setNeutralMode(NeutralMode.Brake);
  }

  public void setPower(double left, double right) {
    this.left.set(ControlMode.PercentOutput, left);
    this.right.set(ControlMode.PercentOutput, -right);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
    public static final double kDriveDeadband = 0.05;
  }

  public static class DriveConstants {
    public static final int kRightMaster = 11;
    public static final int kRightSlave = 1;
    public static final int kLeftMaster = 12;
    public static final int kLeftSlave = 2;

    public static final boolean kIsInverted = true;
  }

  public static class ShooterConstants {
    public static final int kShooter = 20;
    public static final int kLoader = 21;

    public static final double kShooterPower = 1.0;
    public static final double kloaderPower = 0.7;
  }

  public static class AmpConstants {
    public static final int kAmp = 50;

    public static final boolean kIsInverted = true;
  }

  public static class LedConstants {
    public static final int kCANDLE = 0;
  }
}

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import javax.management.ListenerNotFoundException;
import com.ctre.phoenix6.configs.MotorOutputConfigs;
import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.signals.InvertedValue;
import frc.robot.subsystems.Constants.ShooterConstants;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ShooterSubsystem extends SubsystemBase {
    private static String kCANBus;

    private TalonFX m_shooter;
    private TalonFX m_loader;

    public ShooterSubsystem(){
        kCANBus = "rio";
        m_shooter = new TalonFX(ShooterConstants.kShooter, kCANBus);
        m_loader = new TalonFX(ShooterConstants.kLoader, kCANBus);
    }



    public Command runShooter(){
        return run(
        () -> {
           m_shooter.set(Constants.ShooterConstants.kShooterPower);
           m_loader.set(Constants.ShooterConstants.kloaderPower);
        });
    }

    @Override
    public void periodic(){
        //smartdashboard stuff goes here
    }

    public Command intake(){
         return run(
        () -> {
           m_shooter.set(-Constants.ShooterConstants.kShooterPower);
           m_loader.set(-Constants.ShooterConstants.kloaderPower);
        });
    }
}
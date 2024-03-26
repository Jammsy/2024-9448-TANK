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

public class ShooterSubsystem extends SubsystemBase {
    private static final String kCANBus = "rio";

    private final TalonFX m_shooter = new TalonFX(ShooterConstants.kShooter, kCANBus);
    private final TalonFX m_loader = new TalonFX(ShooterConstants.kLoader, kCANBus);


    @Override
    public void periodic(){}

    public void robotInit(){}
    
    public Command shoot(){
        return runOnce(
            () -> {
                m_shooter.set(Constants.ShooterConstants.kShooterPower);
                m_loader.set(Constants.ShooterConstants.kloaderPower);
            });
    }
}
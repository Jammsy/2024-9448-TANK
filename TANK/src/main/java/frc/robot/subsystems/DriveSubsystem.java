package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import javax.management.ListenerNotFoundException;
import com.ctre.phoenix6.configs.MotorOutputConfigs;
import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.signals.InvertedValue;
import frc.robot.subsystems.Constants.DriveConstants;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;


public class DriveSubsystem extends SubsystemBase {
    private static final String kCANBus = "rio";

    private final TalonFX m_leftLeader = new TalonFX(DriveConstants.kLeftMaster, kCANBus);
    private final TalonFX m_leftFollower = new TalonFX(DriveConstants.kLeftSlave, kCANBus);
    private final TalonFX m_rightLeader = new TalonFX(DriveConstants.kRightMaster, kCANBus);
    private final TalonFX m_rightFollower = new TalonFX(DriveConstants.kRightSlave, kCANBus);

    public final DutyCycleOut m_leftOut = new DutyCycleOut(0);
    public final DutyCycleOut m_rightOut = new DutyCycleOut(0);
    
    @Override
    public void periodic(){

    }


    public void drive(double fwd, double rot){
        m_leftOut.Output = fwd - rot;
        m_rightOut.Output = fwd + rot;

        m_leftLeader.setControl(m_leftOut);
        m_rightLeader.setControl(m_rightOut);
    }
}
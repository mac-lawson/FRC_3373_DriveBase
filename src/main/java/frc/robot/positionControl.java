package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;

/**
 * This is a beginner class for new programmers to get introduced into closed loop positional control
 * for the CANSparkMax. Use a testbench or old robot to play arround with some constants and experiment with the code. 
 * 
 * @author Mac Lawson
 */
public class positionControl {
    public static void init(int deviceIdent) {
        String motorName = ("m_motor_" + deviceIdent); 
        String pidName = ("m_pidController_" + deviceIdent); 
        String encoderName = ("m_encoder_" + deviceIdent); 

        final int deviceID = deviceIdent;
        CANSparkMax m_motor;
        SparkMaxPIDController m_pidController;
        RelativeEncoder m_encoder;
    }
    public static double kP(){
        return 0.1;
    } 
    public static double kI() {
        return 1e-4;
    }
    public static double kD() {
        return 1;
    }
    public static double kIz() {
        return 0;
    }
    public static double kFF() {
        return 0;
    }
    public static double kMaxOutput() {
        return 1;
    }
    public static double kMinOutput() {
        return -1;
    }
    public static void pidCoef() {
        m_pidController.setP(kP);
        m_pidController.setI(kI);
        m_pidController.setD(kD);
        m_pidController.setIZone(kIz);
        m_pidController.setFF(kFF);
        m_pidController.setOutputRange(kMinOutput, kMaxOutput);
    }
}

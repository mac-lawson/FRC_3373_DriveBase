package frc.robot;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;

import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.XboxController;

import frc.robot.positionControl;

/**
 * New basic drive code bases, can be called in Robot.java:
 * @apiNote import frc.robot.newDrive.*
 * @author Mac Lawson and Zachary Popik
 * @version Pre-season Beta
 */
public class newDrive {
    /**
     * Basic Tank Drive
     * @param driveMotor1
     * @param driveMotor2
     * @param controller
     * @author Mac Lawson and Zachary Popik
     */
    public static void tank(CANSparkMax driveMotor1, CANSparkMax driveMotor2, XboxController controller) {
        //performs configuration of motors for driving
        driveMotor1.restoreFactoryDefaults();
        driveMotor2.restoreFactoryDefaults();
        driveMotor1.setOpenLoopRampRate(1.0);
        driveMotor2.setOpenLoopRampRate(1.0);


        // gets x and y values from both controlelrs
        double joystickY  = controller.getLeftY();
        double joystickX  = controller.getLeftX();


        //sets the forward and backword movement of the motors 
        driveMotor1.set((joystickY / 1.5));
        driveMotor2.set((joystickY / 1.5));

        //sets the left and right movement of the motors
        if(joystickX > 1) { 
            //going right 
        }
        else if(joystickX < 1) {
            //going left
        }

    }


    // TODO
    public static void SimpleSwerveDrive(CANSparkMax backLeftDriveMotor) {
       int deviceID = 1;
        CANSparkMax m_motor;
        SparkMaxPIDController m_pidController;
        RelativeEncoder m_encoder;
        double kP, kI, kD, kIz, kFF, kMaxOutput, kMinOutput;



        
    }




}

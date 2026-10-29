package org.firstinspires.ftc.teamcode.subsystems.SingleMotor

import com.seattlesolvers.solverslib.hardware.motors.Motor
import org.firstinspires.ftc.teamcode.utils.configurations.OpMotorExConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.genericConfigurations.GenericMotorConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.motorControlModeConfiguration.MotorPercentageModeConfiguration

object SingleMotorConstants {
    object Identification{
        val motorID = "simpleMotor"
    }

    object Configuration{

        val genericConf = GenericMotorConfiguration()
            .withInverted(false)
            .withZeroPowerBehavior(Motor.ZeroPowerBehavior.BRAKE)


        val controlConf = MotorPercentageModeConfiguration()
            .withMaxPower(1.0)

        val conf = OpMotorExConfiguration(genericConf, controlConf)
    }
}
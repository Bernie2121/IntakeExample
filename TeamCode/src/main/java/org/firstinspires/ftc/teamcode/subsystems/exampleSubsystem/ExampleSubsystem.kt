package org.firstinspires.ftc.teamcode.subsystems.exampleSubsystem

import com.qualcomm.robotcore.hardware.HardwareMap
import com.seattlesolvers.solverslib.command.SubsystemBase
import org.firstinspires.ftc.teamcode.utils.configurations.OpMotorExConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.genericConfigurations.GenericMotorConfiguration
import org.firstinspires.ftc.teamcode.utils.configurations.motorControlModeConfiguration.MotorPercentageModeConfiguration
import org.firstinspires.ftc.teamcode.utils.devices.OpMotorEx

class ExampleSubsystem(hardwareMap: HardwareMap): SubsystemBase() {

    private var motor: OpMotorEx

    init {
        motor = OpMotorEx(hardwareMap, "Motor1")
        motor.applyConfigurationAndResetEncoder(
            OpMotorExConfiguration(
                GenericMotorConfiguration(),
                MotorPercentageModeConfiguration()
            )
        )
    }

    // Call the motor and run it at power: 1.0
    fun enableMotor(): Runnable {
        return {  }
    }

    // Call the motor and stop it
    fun disableMotor(): Runnable {
        return {  }
    }
}
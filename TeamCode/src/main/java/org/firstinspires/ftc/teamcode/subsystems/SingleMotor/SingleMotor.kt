package org.firstinspires.ftc.teamcode.subsystems.SingleMotor

import com.qualcomm.robotcore.hardware.HardwareMap
import com.seattlesolvers.solverslib.command.Command
import com.seattlesolvers.solverslib.command.InstantCommand
import org.firstinspires.ftc.teamcode.utils.Angle
import org.firstinspires.ftc.teamcode.utils.Distance
import org.firstinspires.ftc.teamcode.utils.devices.OpMotorEx


class SingleMotor(hardwareMap: HardwareMap) {
    private var motor : OpMotorEx

    init {
         motor = OpMotorEx(hardwareMap, SingleMotorConstants.Identification.motorID)
    }

    fun moveCMD() : Command {
        return InstantCommand({move()})
    }

    fun move(){

    }
    /**
    val example : Int = 4

    val degrees = Angle.fromRadians(1.0)


    val distance = Distance.fromMeters(1.0)


    val angles : Double = Angle.fromDegrees(10.9)
          */

}

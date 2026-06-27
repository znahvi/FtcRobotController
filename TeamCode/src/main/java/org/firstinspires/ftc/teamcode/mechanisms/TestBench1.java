package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench1 {
    private DcMotor motor; // e.g. linearSlideMotorLeft
    private double ticksPerRev; // revolution

    public void init(HardwareMap hwMap) {
        // touch sensor code

        // DC motor code
        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER); // recommended since it will help control motor velocity
        ticksPerRev = motor.getMotorType().getTicksPerRev();
    }

    public void setMotorSpeed(double speed) {
        // accepts values from -1.0 to 1.0
        motor.setPower(speed);
    }

    public double getMotorRevs() {
        return motor.getCurrentPosition() / ticksPerRev; // normalizes ticks to revolutions
    }

}

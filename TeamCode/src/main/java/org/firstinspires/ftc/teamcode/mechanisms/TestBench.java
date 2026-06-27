package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    // best practice to set it as private from OpMode classes
    private DigitalChannel touchSensor; // touchSensorIntake

    private DcMotor motor; // e.g. linearSlideMotorLeft
    private double ticksPerRev; // revolution

    public void init(HardwareMap hwMap) {
        // touch sensor
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT); // digital device connected is an input

        // DC motor code
        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER); // recommended since it will help control motor velocity
        ticksPerRev = motor.getMotorType().getTicksPerRev();
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE); // immediately stops motor
        motor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    //-------------- Touch Sensor -----------------
    // getter method to get value from touch sensor
    public boolean isTouchSensorPressed() {
        return !touchSensor.getState();
    }

    public boolean isTouchSensorReleased() {
        return touchSensor.getState();
    }

    //---------------- DC Motor --------------------
    public void setMotorSpeed(double speed) {
        // accepts values from -1.0 to 1.0
        motor.setPower(speed);
    }

    public double getMotorRevs() {
        return motor.getCurrentPosition() / ticksPerRev; // normalizes ticks to revolutions
    }

    // gamepad
    public void setMotorZeroBehavior(DcMotor.ZeroPowerBehavior zeroBehavior) {
        motor.setZeroPowerBehavior(zeroBehavior);
    }

}

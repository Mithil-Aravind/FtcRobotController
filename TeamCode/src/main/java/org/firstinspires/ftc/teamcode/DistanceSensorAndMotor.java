package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class DistanceSensorAndMotor {
    private DistanceSensor distanceSensor;
    private DcMotor dcMotor;
    public void init(HardwareMap hwMap) {
        distanceSensor = hwMap.get(DistanceSensor.class, "distanceSensor");
        dcMotor = hwMap.get(DcMotor.class, "dcMotor");
    }
    public void motorspeed(double speed) {
        dcMotor.setPower(speed);
    }

    public double distance() {
        return distanceSensor.getDistance(DistanceUnit.INCH);
    }
}

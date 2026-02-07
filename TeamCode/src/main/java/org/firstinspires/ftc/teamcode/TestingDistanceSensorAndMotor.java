package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TestingDistanceSensorAndMotor extends OpMode {
    DistanceSensorAndMotor distanceSensor = new DistanceSensorAndMotor();
    public void init() {
        distanceSensor.init(hardwareMap);
    }

    public void loop() {
        double motorSpeed = distanceSensor.distance() / 5;
        distanceSensor.motorspeed(motorSpeed);
        if (motorSpeed > 1) {
            motorSpeed = 1;
        } else if (motorSpeed < 0) {
            motorSpeed = 0;
        }
        telemetry.addData("distance", distanceSensor.distance());
        telemetry.addData("distance modif / motor speed", distanceSensor.distance()/5);
    }
}

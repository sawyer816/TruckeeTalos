package org.firstinspires.ftc.teamcode;

import android.hardware.Sensor;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import android.hardware.Sensor;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
/**
 * Created by sawyerthompson on 10/27/17.
 */

    @Autonomous(name="Auto")
    public class Auto extends LinearOpMode {
        DcMotor left_drive = null;
        DcMotor right_drive = null;
        DcMotor frontL = null;
        DcMotor frontR = null;
        Servo armServo = null;
        Sensor color = null;


        @Override public void runOpMode () throws InterruptedException {
            frontR = hardwareMap.dcMotor.get("frontR");
            frontL = hardwareMap.dcMotor.get("frontL");
            right_drive = hardwareMap.dcMotor.get("right_drive");
            left_drive = hardwareMap.dcMotor.get("left_drive");
            //armServo = hardwareMap.servo.get("armServo");
            waitForStart();

            DriveForward(4);
            Thread.sleep(4000);
            //TurnLeft(1);
            //Thread.sleep(500);
            //DriveForward(1);
            //Thread.sleep(4000);
            //TurnRight(1);
            //Thread.sleep(500);
           // DriveForward(1);
            //Thread.sleep(4000);
            DriveForward(0);
        }
        public void DriveForward (double power)
        {
            frontL.setPower(power);
            frontR.setPower(power);
            left_drive.setPower(power);
            right_drive.setPower(power);
        }
        public void TurnLeft (double power){
            left_drive.setPower(-power);
            right_drive.setPower(power);
            frontR.setPower(power);
            frontL.setPower(-power);
        }
        public void TurnRight (double power){
            TurnLeft(-power);
        }







    }

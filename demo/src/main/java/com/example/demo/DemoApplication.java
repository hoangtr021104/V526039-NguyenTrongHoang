package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		HinhTron ht1 = new HinhTron(1, 1, 3.5);
		HinhTron ht2 = new HinhTron();
		System.out.println(ht1);
		System.out.println(ht2);
		System.out.println("dien tich hinh tron la: " + ht1.dienTich());
		// Hãy cho biết hình nào có diện tích lớn hơn
		if(ht1.dienTich() > ht2.dienTich()){
			System.out.println("Hinh tron 1 co dien tich lon hon");
		}
		// Nhập vào 1 gia trị d, tính tịnh tiến hình tròn theo giá trị d
		
	}
}

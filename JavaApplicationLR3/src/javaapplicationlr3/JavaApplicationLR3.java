/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationlr3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import Calculator.CalculatorClass;

/**
 *
 * @author brani
 */
public class JavaApplicationLR3 {

	//file name lib\7.bin
	public static void main(String[] args) throws IOException {
		List<Integer> num = null;
                
		try {
			num = readFile("C:\\Users\\brani\\Downloads\\data_for_lab3\\3.bin");
		} catch (FileNotFoundException ex) {
			System.out.println("Файл не найден");
			return;
		} catch (IOException ex) {
			System.out.println("Ошибка файла");
			return;
		}

		CalculatorClass obj = new CalculatorClass();

		for(int tau = -5; tau <= 5; tau++)
        {
            System.out.println("Автокорреляция(" + tau + "): " + obj.Autocorrelation(num,tau));
        }
		System.out.println("Динамический диапазон: " + obj.DynamicRange(num));
		System.out.println("Энергия: " + obj.SignalEnergy(num));
		System.out.println("Средняя мощность: " + obj.AverageSignalStrength(num));
		System.out.println("Среднее значение: " + obj.AverageSignalSamplesValue(num));
		System.out.println("Дисперсия: " + obj.SignalSampleValuesVariance(num));
		System.out.println("Интервал корреляции: " + obj.CorrelationInterval(num));
	}

	public static List<Integer> readFile(String path) throws IOException {
		List<Integer> list = new ArrayList<Integer>();
		try (FileInputStream inputStream = new FileInputStream(path)) {
			int readResult;
			do {
				readResult = inputStream.read();

				if (readResult != -1) {
					list.add(readResult);
				}

			} while (readResult != -1);
		}

		return list;
	}
}

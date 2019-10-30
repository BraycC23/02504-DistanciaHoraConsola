/* 
Copyright 2019  Brayan C. Sanchez Arenas - brayancamilo.sanchez.alum2iescap.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Brayan C. Sanchez Arenas
 */
public class Main {
public static final Scanner SCN = 
	  new Scanner(System.in, "Windows-1252")
	  .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static void main(String[] args) {
        //Variables
       int Hora_A;
       int Min_A;
       int Seg_A;
       int Hora_I;
       int Min_I;
       int Seg_I;
      
       try {
       // Introducción datos 
        System.out.print("Hora de Inicio >  ");
        Hora_I = SCN.nextInt();
        System.out.print("Minuto de Inicio >  ");
        Min_I = SCN.nextInt();
        System.out.print("Segundo de Inicio >  ");
        Seg_I = SCN.nextInt();
        // Obtencion horas
        GregorianCalendar gc = new GregorianCalendar();
        Hora_A = gc.get(Calendar.HOUR_OF_DAY);
        Min_A = gc.get(Calendar.MINUTE);
        Seg_A = gc.get(Calendar.SECOND);
        // Cambio a segundos para calculo de tiempo de clase
        int SegEntrada = Hora_I * 3600 + Min_I * 60 + Seg_I;
        int SegActual = Hora_A * 3600 + Min_A * 60 + Seg_A;
        //Calculo de Tiempo Clase en Segundos
        int SegTC = SegActual - SegEntrada;
        //Cambio a Minutos
        int MinTC = SegTC / 60;
        SegTC = SegTC % 60;
        //Cambio a Horas
        int HorTC = MinTC / 60;
        MinTC = MinTC % 60;
        
        // Mensaje y calculo
        System.out.printf("Hora actual ........: %02d/%02d/%02d%n", Hora_A, 
                Min_A, Seg_A);
        System.out.printf("Hora inicio ........: %02d/%02d/%02d%n", Hora_I, 
                Min_I, Seg_I);
        System.out.printf("Tiempo de clase ....: %02d/%02d/%02d%n", HorTC, MinTC,
                SegTC);
        
    } catch (Exception e){
       
     System.out.println("Entrada Incorrecta");
    }
}}

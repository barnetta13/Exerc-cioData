/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercíciodata;

/**
 *
 * @author Daniel Martins
 */
public class TestData {
    
    public static void TestData(){
    Data data1 = new Data(2016,3,3);
    System.out.println(data1);
    Data data2= new Data(1974,4,25);
    data2.toAnoMesDiaString();
    if (data1.isMaior(data2) == true)
    {
        System.out.println(data1.toAnoMesDiaString() + " é mais recente que " + data2.toAnoMesDiaString());
    }
    else
    {
        System.out.println(data1.toAnoMesDiaString() + " é mais antiga que " + data2.toAnoMesDiaString());
    }
    System.out.println("A diferença de dias entre as datas é de " + data1.diferenca(data2));
    System.out.println("Faltam " + data1.diferenca(2016, 12, 24) + " para o Natal");
    System.out.println("25 de Abril de 1974 calhou numa " + data2.diaDaSemana());
    if (data2.isAnoBissexto(data2.getAno()))
    {
        System.out.println(data2.getAno() + " é bissexto.");
    }
    else
    {
        System.out.println(data2.getAno() + " não é bissexto.");
    }
    
    
    if (Data.isAnoBissexto(data2.getAno()))
    {
        System.out.println(data2.getAno() + " é bissexto.");
    }
    else
    {
        System.out.println(data2.getAno() + " não é bissexto.");
    }
    }
}

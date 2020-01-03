/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author Bueno
 */
public class day1 {
    
    public static void main(String[] args) {

    int[] mass = {83326, 84939, 135378, 105431, 119144, 124375, 138528, 88896, 98948, 85072, 112576,
        144497, 112824, 98892, 81551, 139462, 73213, 93261, 130376, 118425, 132905, 54627,
        134676, 140435, 131410, 128441, 96755, 94866, 89490, 122118, 106596, 77531, 84941,
        57494, 97518, 136224, 69247, 147209, 92814, 63436, 79819, 109335, 85698, 110103,
        79072, 52282, 73957, 68668, 105394, 149663, 91954, 66479, 55778, 126377, 75471,
        75662, 71910, 113031, 133917, 76043, 65086, 117882, 134854, 60690, 67495, 62434,
        67758, 95329, 123078, 128541, 108213, 93543, 147937, 148262, 56212, 148586, 73733,
        110763, 149243, 133232, 95817, 68261, 123872, 93764, 147297, 51555, 110576, 89485,
        109570, 88052, 132786, 70585, 105973, 85898, 149990, 114463, 147536, 67786, 139193, 112322};
    
    // Primera parte del día 1
        
        int total = 0;
        int i = 0;
        while (i<mass.length){
            total = total + fuel(mass[i]);
            i++;
        }
        System.out.println(total);
        
        System.out.println(fuel(100756));
        
        // Segunda parte del día 1
        
        total = 0;
        i = 0;
        while (i < mass.length) {
            total = total + fuelTotal(mass[i]);
            i++;
        }
        System.out.println(total);
    
    }
    public static int fuel(int mass) {
        return (int) Math.floor(mass / 3) - 2;
    }

    public static int fuelTotal(int mass) {
        int acumulador = 0;
        while (fuel(mass) > 0) {
            acumulador = acumulador + fuel(mass);
            mass = fuel(mass);
        }
        return acumulador;
    }
}

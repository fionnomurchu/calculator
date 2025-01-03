package Menu;

public class FeatureList extends MenuItems {
    //Method containing option 1, A feature list
    @Override
    public void display() {
        System.out.println("--------------------");//seperator,for visual effects
        //arithmetic calculator features
        System.out.println("Arithmetic Calculator:");
        System.out.println("Addition: +\nSubtraction: -\nMultiplication: *\nDivision: /\nPower: ^\nFactorial: !\nModulus: % (e.g., 10 % 3 calculates the remainder of 10 divided by 3)");
        System.out.println("Brackets: ( )\nPrevious Result: a");
        //constants and trignometric operators
        System.out.println("\nConstants:");
        System.out.println("Euler's Number: e\nPi: p\nLoge: l");
        System.out.println("Sine: s\nCosine: c\nTangent: t");
        //programming features,conversions
        System.out.println("\nProgramming Calculator:");
        System.out.println("Binary Conversion\nDecimal Conversion\nHexadecimal Conversion");
        //unit conversion features(tailored to farmers!)
        System.out.println("\nUnit Conversions:");
        System.out.println("Length Conversions: Kilometers ↔ Miles, Meters ↔ Feet");
        System.out.println("Volume Conversions: Liters ↔ Gallons");
        System.out.println("Power Conversions: Horsepower ↔ Kilowatts, Watts ↔ Kilowatts, Kilowatts ↔ Megawatts");
        System.out.println("Temperature Conversions: Celsius ↔ Fahrenheit");
        System.out.println("Weight Conversions: Kilograms ↔ Pounds");
        System.out.println("Land Area Conversions: Acres ↔ Hectares");
        //Matrix calculator features
        System.out.println("\nMatrix Calculator:");
        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
    }
}

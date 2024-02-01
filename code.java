print("            BMI CALCULATOR                    ")
weight=float(input(" ENTER YOUR WEIGHT IN KILOGRAM: "))
height=float(input(" ENTER YOUR HEIGHT IN CENTIMETERS:"))
height_met=height/100
BMI=weight/(height_met**2)
print(BMI)
if(BMI<19):
    {
        print("YOU ARE UNDERWEIGHT")
    }
elif(BMI>=19 and BMI<=24):
    {
        print("YOU ARE HEALTHY!")
    }
elif(BMI>=25 and BMI<=30):
    {
        print("YOU ARE OVER WEIGHT")
    }
elif(BMI>30):
    {
        print("YOU ARE OBESE")
    }

import pandas as pd

file = pd.read_csv("C:\\Users\\vivek\\Desktop\\file.csv")
column_values = file['Name'].values.tolist()
column_Name=file['Name']
abhishek_info=file[column_name=='Abhishek']

name=input("name of the person : ")

h=float(input("enter the height: "))

w=float(input("enter the weight: "))

age=int(input("enter the age: "))

print("Height",h)



def bmiCalculator():

    bmi=w/pow(h,2)

    print(bmi)

    if bmi<18.9:

        print("Underweight , take more calories")

    elif bmi>=18.9 and bmi<24.9:

        print("Normal ")

    else:

        print("Overweight , burn more calories")

    return bmi



def caloriesBurn():

    print()



isNormal=bmiCalculator()




name=input("name of the person : ")

h=float(input("enter the height: "))

w=float(input("enter the weight: "))

a=int(input("enter the age: "))

timeOfExercise=int(input("Enter the time of the exercise: "))

gender=input("enter the gender if male m, if female f: ")

print("Height",h)



def bmiCalculator():

    isNormal=""

    bmi=w/pow(h,2)

    print(bmi)

    if bmi<18.9:

        print("Underweight , take more calories")

        isNormal="underweight"

    elif bmi>=18.9 and bmi<24.9:

        print("Normal ")

        isNormal="normal"

    else:

        print("Overweight , burn more calories")

        isNormal="overweight"

    return bmi



def caloriesBurn(h,w,a,timeOfExercise,gender):

    cb=0.0

    if(gender=="m"):

        cb=timeOfExercise*(0.4472*h-0.1263*w+0.074*a-20.40)/4.184

    else:

        cb=timeOfExercise*(0.6472*h-0.1963*w+0.204*a-55.40)/4.184

    return cb;





isNormal=bmiCalculator()

if(isNormal!='normal'):

    caloriesBurn(h,w,a,timeOfExercise,gender)
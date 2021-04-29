print("Welcome to Python Tutorial")

a = 10
# Two object inside one print() function
print("a =", a)

b = a
# Three object in one print() function
print("a =", a, '= b')

# sep and end argument
# sep is for seperation, its mean printed item will be seperated by object in this argument
# end is for object at the end of print, its mean object in end argument is used as the end of the print function

# Example sep and end argument
a = 10
print("a =", a, sep = "dddd", end = "\n\n\n") 
# Should print 10 after "dddd" because there is an sep argument betwen "a =" and a, and ended by three newline

print("a =", a, sep = '0', end = "$$$$\n")
# Should print 10 after '0' because there is an sep argument to seperate two printed object, and ended by four dollar sign that we include in end argument

print("a =", a, "= b", sep = '0', end = "$$$$")
# Should print a =0100= b$$$$ because there is an object in sep argument to seperate print object, and ended by four dollar sign

# NS: By default in print is using sep and end argument, but if not declared they use their default value which is ' ' for sep argument, and '\n' for end argument
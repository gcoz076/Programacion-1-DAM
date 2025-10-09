num = int(input("Dame un número: "))
for i in range(num):
    if num != num /2:
        print ("*"+"#"*(num-2)+"*")
    else:
        print("*"+"@"*(num-3)+"*")
print ("Listo")
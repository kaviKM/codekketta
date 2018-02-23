lower = 1
upper = 10
printf("Prime Numbers between",lower,"and",upper,"are:")
for num in range(lower,upper + 1):
if num > 1 :
for i in range(1,num) :
if (num%2)==0 :
break:
else:
print(num)

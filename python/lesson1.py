# 遍历字典中所有key-value
a={'ip':'192','port':80}
for key in a:
    print (key,a[key])

# range内置函数

for i in range(6,100):
    if i%4==0:
        print(i)

# 结合range()和len()函数以遍历一个序列的索引
a=[2,34,45,2,5,7,9]
for i in range(len(a)):
    print(i,a[i])

# breake/continue
n=10
while n>0:
    n-=1
    if n==2:
        continue
    print(n)
print('循环结束')

# 给定一个列表，得到一个新的列表，新的列表中的每个元素都是旧列表的每个元素的乘方
a = [1, 2, 3, 4]
b = [x ** 2 for x in a]
#只给奇数进行乘方
b = [x ** 2 for x in a if x%2==1]
print(b)

#定义函数
def add(x,y):
    #函数体
    ret=x+y
    return ret

#函数调用
ret=add(2,4)
print(ret)

#在定义函数时赋值默认参数
def mius(x,y=0):
    return x-y
print(mius(4))

#一个函数可以返回多个值
def get_point():
    x=10
    y=20
    return x,y
#解包 unpack
x,y=get_point()
print(x,y)
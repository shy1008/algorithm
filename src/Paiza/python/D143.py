# coding: utf-8
import math

# 제동거리 계산
weight,speed,breakPower  = map(int, input().split())
L = weight * (speed * speed) / (2 * breakPower)
print(math.ceil(L))
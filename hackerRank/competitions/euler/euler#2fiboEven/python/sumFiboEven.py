#!/bin/python3

import sys

def sumFiboEven(topLimit):
	f1 = 2
	f2 = 0
	f = 0
	sum = 0

	while f1 < topLimit:
		sum += f1
		f = 4*f1 + f2
		f2 = f1
		f1 = f

	return sum 


numberCases = int(sys.stdin.readline())

for case in range(0,numberCases):
	print(sumFiboEven(int(sys.stdin.readline())))

#!/bin/python3

import sys

def sum(topLimit,mult):
	size = (topLimit -1) // mult
	return mult * size * (1 + size)// 2 

def calculateSumMult(topLimit):
	
	return sum(topLimit,3) + sum(topLimit,5) - sum(topLimit,3*5)


numberCases = int(sys.stdin.readline())

for case in range(0,numberCases):
	print(calculateSumMult(int(sys.stdin.readline())))



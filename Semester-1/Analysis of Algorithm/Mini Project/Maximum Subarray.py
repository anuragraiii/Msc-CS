def maxSubArray(arr):
    maxSum = 0
    curSum = 0
    for i in range(len(arr)):
        curSum = curSum + arr[i]
        if(curSum > maxSum):
            maxSum = curSum
        if(curSum<0):
            curSum = 0
    return maxSum


arr=[-66,-3,64,-12,-37,19,26,60,6,-33,-64,-68,56,-14,21,27,-21,43,87,1]
print(f"Input array: {arr}")
print(f"Maximum sum is: {maxSubArray(arr)}")

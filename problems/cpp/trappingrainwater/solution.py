class Solution:
    def sumBackets(self, height: list[int], left, right):

        minHeightLeft = height[left]
        total = 0
        leftBacket = 0
        locationMinLeft = left

        while left < right:
            
            if height[left] < minHeightLeft:
                leftBacket += minHeightLeft - height[left]                
            else:
                minHeightLeft = height[left]
                total +=  leftBacket
                leftBacket = 0
                locationMinLeft = left            
            left += 1
            
        if minHeightLeft <= height[right]:
             return total + leftBacket, right
        else :      
            return total, locationMinLeft

    def sumBacketsReverce(self, height: list[int], left, right):

        minHeightRight = height[right]
        total = 0
        rightBacket = 0
        locationMinRight = right

        while left < right:
            
            if height[right] < minHeightRight:
                rightBacket += minHeightRight - height[right]                
            else :
                minHeightRight = height[right]
                total +=  rightBacket
                rightBacket = 0
                locationMinRight = right            
            right -= 1


        if minHeightRight <= height[left]:
            return total + rightBacket, left
        else :
            return total, locationMinRight
    
    def trap(self, height: List[int]) -> int:                      
        right = len(height)-1
        left =0
        totalSum =0


        while left < right-1:            
            if( height[left]< height[right]):
                total, left = self.sumBackets(height, left, right)    
            else:
                total, right = self.sumBacketsReverce(height, left, right)        
                
            totalSum += total       
             
        return totalSum

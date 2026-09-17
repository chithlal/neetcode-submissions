class Solution {
    fun trap(height: IntArray): Int {

        var left = 0
        var right = height.lastIndex

        var leftMax = 0
        var rightMax = 0
        var water = 0

        while (left <= right) {
            leftMax = maxOf(leftMax, height[left])
            rightMax = maxOf(rightMax, height[right])

            if (leftMax <= rightMax) {
                water += leftMax - height[left]
                left++
            } else {
                water += rightMax - height[right]
                right--
            }
        }

        return water
    }
}

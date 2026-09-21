class Solution {
    fun findMin(nums: IntArray): Int {
 var l = 0
    var r = nums.lastIndex

    while (l < r) {
        val mid = l + (r - l) / 2

        if (nums[mid] > nums[r]) {
            l = mid + 1 // Minimum is strictly after mid
        } else {
            r = mid     // Mid could be the minimum
        }
    }

    return nums[l]
}

}

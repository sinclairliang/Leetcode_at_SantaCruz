/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function (nums) {
    if (!nums.length) return 0;
    if (nums.length === 1) return nums[0];

    let OPT = [nums[0]];

    nums[0] > nums[1] ? OPT.push(nums[0]) : OPT.push(nums[1]);

    for (let x = 2; x < nums.length; x++) {
        OPT[x] = Math.max(OPT[x - 1], OPT[x - 2] + nums[x]);
    }
    return OPT[nums.length - 1];
};
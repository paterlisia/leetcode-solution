--
-- @lc app=leetcode.cn id=180 lang=mysql
--
-- [180] 连续出现的数字
--

-- @lc code=start
# Write your MySQL query statement below
select distinct l1.num as ConsecutiveNums from 
    logs l1, logs l2, logs l3
where 
    l1.id = l2.id - 1 
    and l2.id = l3.id - 1
    and l1.num = l2.num 
    and l2.num = l3.num;
-- @lc code=end


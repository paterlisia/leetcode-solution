--
-- @lc app=leetcode.cn id=181 lang=mysql
--
-- [181] 超过经理收入的员工
--

-- @lc code=start
# Write your MySQL query statement below
select e1.name as Employee from
    Employee e1, Employee e2
    where e1.salary > e2.salary and e1.managerid = e2.id;
-- @lc code=end


--
-- @lc app=leetcode.cn id=184 lang=mysql
--
-- [184] 部门工资最高的员工
--

-- @lc code=start
# Write your MySQL query statement below
select d.name as Department, e.name as Employee, Salary
from Employee e join Department d
on e.DepartmentId = d.id
join (
    select max(salary) as maxSalary, DepartmentId
    from Employee
    group by DepartmentId
) as mx on mx.maxSalary = e.salary and mx.DepartmentId = e.DepartmentId; 

-- @lc code=end


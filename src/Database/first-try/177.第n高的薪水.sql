--
-- @lc app=leetcode.cn id=177 lang=mysql
--
-- [177] 第N高的薪水
--

-- @lc code=start
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
declare m int;
set m = n - 1;
  RETURN (
      # Write your MySQL query statement below.
      select ifnull(
        (
          select distinct salary
          from Employee
          order by salary desc
          limit 1
          offset m
          ), null
      )
  );
END
-- @lc code=end


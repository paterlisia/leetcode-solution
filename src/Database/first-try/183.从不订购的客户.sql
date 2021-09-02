--
-- @lc app=leetcode.cn id=183 lang=mysql
--
-- [183] 从不订购的客户
--

-- @lc code=start
# Write your MySQL query statement below
    select name as customers from customers
    where customers.id not in (
        select customerid from
        customers c, Orders o
        where c.id = o.customerid
    );
-- @lc code=end


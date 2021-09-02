--
-- @lc app=leetcode.cn id=182 lang=mysql
--
-- [182] 查找重复的电子邮箱
--

-- @lc code=start
# Write your MySQL query statement below
select Email  from 
(
    select email, count(email) as num
    from Person p
    group by email
)
where num > 1;
-- @lc code=end


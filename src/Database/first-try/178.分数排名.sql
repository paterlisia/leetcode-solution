--
-- @lc app=leetcode.cn id=178 lang=mysql
--
-- [178] 分数排名
--

-- @lc code=start
# Write your MySQL query statement below
select score, 
    (select count(distinct Score) from Scores where Score >= s.Score) `Rank`
from Scores s
order by score desc;
-- @lc code=end


#
# @lc app=leetcode.cn id=79 lang=python
#
# [79] 单词搜索
#

# @lc code=start
class Solution(object):
    def exist(self, board, word):
        """
        :type board: List[List[str]]
        :type word: str
        :rtype: bool
        """
        # whether current element has been visited at this loop
        visited = [[False for _ in range(len(board[0]))] for _ in range(len(board))]
        for i in range(len(board)):
            for j in range(len(board[0])):
                if self.dfs(board, word, visited, i, j, 0):
                    return True
        return False
    def dfs(self, board, word, visited, i, j, k):
        # current matrix element do not match current word element
        if word[k] != board[i][j]:
            return False
        # word matched, end
        elif k == len(word) - 1:
            return True
        # mark current element as visited
        visited[i][j] = True
        # res represent whether current loop matched the word
        res = False
        # four directions to move
        directions = [[0, 1], [0, -1], [1, 0], [-1, 0]]
        for dir in directions:
            # update the coordinate after current element moved
            newi = i + dir[0]
            newj = j + dir[1]
            # board judgement
            if 0 <= newi < len(board) and 0 <= newj < len(board[0]):
                if not visited[newi][newj]:
                    if self.dfs(board, word, visited, newi, newj, k + 1):
                        res = True
                        break
        visited[i][j] = False
        return res

# @lc code=end


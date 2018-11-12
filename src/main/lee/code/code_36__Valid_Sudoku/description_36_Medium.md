##[36.Valid Sudoku](https://leetcode.com/problems/valid-sudoku/description/ "36.Valid Sudoku")
######Difficulty:Medium
####Similiar Topics:
  [Hash Table](https://leetcode.com//tag/hash-table)
####Similiar Problems:
  [Sudoku Solver](https://leetcode.com//problems/sudoku-solver)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Determine if a&#160;9x9 Sudoku board&#160;is valid.&#160;Only the filled cells need to be validated&#160;<strong>according to the following rules</strong>:</p>

<ol>
	<li>Each row&#160;must contain the&#160;digits&#160;<code>1-9</code> without repetition.</li>
	<li>Each column must contain the digits&#160;<code>1-9</code>&#160;without repetition.</li>
	<li>Each of the 9 <code>3x3</code> sub-boxes of the grid must contain the digits&#160;<code>1-9</code>&#160;without repetition.</li>
</ol>

<p><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png" style="height:250px; width:250px"/><br/>
<small>A partially filled sudoku which is valid.</small></p>

<p>The Sudoku board could be partially filled, where empty cells are filled with the character <code>'.'</code>.</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong>
[
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
<strong>Output:</strong> true
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong>
[
&#160; ["8","3",".",".","7",".",".",".","."],
&#160; ["6",".",".","1","9","5",".",".","."],
&#160; [".","9","8",".",".",".",".","6","."],
&#160; ["8",".",".",".","6",".",".",".","3"],
&#160; ["4",".",".","8",".","3",".",".","1"],
&#160; ["7",".",".",".","2",".",".",".","6"],
&#160; [".","6",".",".",".",".","2","8","."],
&#160; [".",".",".","4","1","9",".",".","5"],
&#160; [".",".",".",".","8",".",".","7","9"]
]
<strong>Output:</strong> false
<strong>Explanation:</strong> Same as Example 1, except with the <strong>5</strong> in the top left corner being 
    modified to <strong>8</strong>. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
</pre>

<p><strong>Note:</strong></p>

<ul>
	<li>A Sudoku board (partially filled) could be valid but is not necessarily solvable.</li>
	<li>Only the filled cells need to be validated according to the mentioned&#160;rules.</li>
	<li>The given board&#160;contain only digits <code>1-9</code> and the character <code>'.'</code>.</li>
	<li>The given board size is always <code>9x9</code>.</li>
</ul>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
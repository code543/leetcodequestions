##[794.Valid Tic-Tac-Toe State](https://leetcode.com/problems/valid-tic-tac-toe-state/description/ "794.Valid Tic-Tac-Toe State")
######Difficulty:Medium
####Similiar Topics:
  [Math](https://leetcode.com//tag/math)  [Recursion](https://leetcode.com//tag/recursion)
####Similiar Problems:
  [Design Tic-Tac-Toe](https://leetcode.com//problems/design-tic-tac-toe)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>A Tic-Tac-Toe board is given as a string array <code>board</code>. Return True if and only if it is possible to reach this board position during the course of a valid tic-tac-toe game.</p>

<p>The <code>board</code> is a 3 x 3 array, and consists of characters <code>" "</code>, <code>"X"</code>, and <code>"O"</code>.&#160; The " " character represents an empty square.</p>

<p>Here are the rules of Tic-Tac-Toe:</p>

<ul>
	<li>Players take turns placing characters into empty squares (" ").</li>
	<li>The first player always places "X" characters, while the second player always places "O" characters.</li>
	<li>"X" and "O" characters are always placed into empty squares, never filled ones.</li>
	<li>The game ends when there are 3 of the same (non-empty) character filling any row, column, or diagonal.</li>
	<li>The game also ends if all squares are non-empty.</li>
	<li>No more moves can be played if the game is over.</li>
</ul>

<pre><strong>Example 1:</strong>
<strong>Input:</strong> board = ["O&#160; ", "&#160; &#160;", "&#160; &#160;"]
<strong>Output:</strong> false
<strong>Explanation:</strong> The first player always plays "X".

<strong>Example 2:</strong>
<strong>Input:</strong> board = ["XOX", " X ", "   "]
<strong>Output:</strong> false
<strong>Explanation:</strong> Players take turns making moves.

<strong>Example 3:</strong>
<strong>Input:</strong> board = ["XXX", "   ", "OOO"]
<strong>Output:</strong> false

<strong>Example 4:</strong>
<strong>Input:</strong> board = ["XOX", "O O", "XOX"]
<strong>Output:</strong> true
</pre>

<p><strong>Note:</strong></p>

<ul>
	<li><code>board</code> is a length-3 array of strings, where each string <code>board[i]</code> has length 3.</li>
	<li>Each <code>board[i][j]</code> is a character in the set <code>{" ", "X", "O"}</code>.</li>
</ul></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
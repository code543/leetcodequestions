##[766.Toeplitz Matrix](https://leetcode.com/problems/toeplitz-matrix/description/ "766.Toeplitz Matrix")
######Difficulty:Easy
####Similiar Topics:
  [Array](https://leetcode.com//tag/array)
####Similiar Problems:
  [Valid Word Square](https://leetcode.com//problems/valid-word-square)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>A matrix is <em>Toeplitz</em> if every diagonal from top-left to bottom-right has the same element.</p>

<p>Now given an <code>M x N</code> matrix, return&#160;<code>True</code>&#160;if and only if the matrix is <em>Toeplitz</em>.<br/>
&#160;</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:
</strong>matrix = [
&#160; [1,2,3,4],
&#160; [5,1,2,3],
&#160; [9,5,1,2]
]
<strong>Output:</strong> True
<strong>Explanation:</strong>
In the above grid, the&#160;diagonals are:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
In each diagonal all elements are the same, so the answer is True.
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:
</strong>matrix = [
&#160; [1,2],
&#160; [2,2]
]
<strong>Output:</strong> False
<strong>Explanation:</strong>
The diagonal "[1, 2]" has different elements.
</pre>

<p><br/>
<strong>Note:</strong></p>

<ol>
	<li><code>matrix</code> will be a 2D array of integers.</li>
	<li><code>matrix</code> will have a number of rows and columns in range <code>[1, 20]</code>.</li>
	<li><code>matrix[i][j]</code> will be integers in range <code>[0, 99]</code>.</li>
</ol>

<p><br/>
<strong>Follow up:</strong></p>

<ol>
	<li>What if the matrix is stored on disk, and the memory is limited such that you can only load at most one row of the matrix into the memory at once?</li>
	<li>What if the matrix is so large that you can only load up a partial row into the memory at once?</li>
</ol>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
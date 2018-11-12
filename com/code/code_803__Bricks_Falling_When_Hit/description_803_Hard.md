##[803.Bricks Falling When Hit](https://leetcode.com/problems/bricks-falling-when-hit/description/ "803.Bricks Falling When Hit")
######Difficulty:Hard
####Similiar Topics:
  [Union Find](https://leetcode.com//tag/union-find)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>We have a grid of 1s and 0s; the 1s in a cell represent bricks.&#160; A brick will not drop if and only if it is directly connected to the top of the grid, or at least one of its (4-way) adjacent bricks will not drop.</p>

<p>We will do some erasures&#160;sequentially. Each time we want to do the erasure at the location (i, j), the brick (if it exists) on that location will disappear, and then some other bricks may&#160;drop because of that&#160;erasure.</p>

<p>Return an array representing the number of bricks that will drop after each erasure in sequence.</p>

<pre><strong>Example 1:</strong>
<strong>Input:</strong> 
grid = [[1,0,0,0],[1,1,1,0]]
hits = [[1,0]]
<strong>Output:</strong> [2]
<strong>Explanation: </strong>
If we erase the brick at (1, 0), the brick at (1, 1) and (1, 2) will drop. So we should return 2.</pre>

<pre><strong>Example 2:</strong>
<strong>Input:</strong> 
grid = [[1,0,0,0],[1,1,0,0]]
hits = [[1,1],[1,0]]
<strong>Output:</strong> [0,0]
<strong>Explanation: </strong>
When we erase the brick at (1, 0), the brick at (1, 1) has already disappeared due to the last move. So each erasure will cause no bricks dropping.  Note that the erased brick (1, 0) will not be counted as a dropped brick.</pre>

<p>&#160;</p>

<p><strong>Note:</strong></p>

<ul>
	<li>The number of rows and columns in the grid will be in the range&#160;[1, 200].</li>
	<li>The number of erasures will not exceed the area of the grid.</li>
	<li>It is guaranteed that each erasure will be different from any other erasure, and located inside the grid.</li>
	<li>An erasure may refer to a location with no brick - if it does, no bricks drop.</li>
</ul>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
##[832.Flipping an Image](https://leetcode.com/problems/flipping-an-image/description/ "832.Flipping an Image")
######Difficulty:Easy
####Similiar Topics:
  [Array](https://leetcode.com//tag/array)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given a binary matrix <code>A</code>, we want to flip the image horizontally, then invert it, and return the resulting image.</p>

<p>To flip an image horizontally means that each row of the image is reversed.&#160; For example, flipping&#160;<code>[1, 1, 0]</code>&#160;horizontally results in&#160;<code>[0, 1, 1]</code>.</p>

<p>To invert an image means&#160;that each <code>0</code> is replaced by <code>1</code>, and each <code>1</code> is replaced by <code>0</code>.&#160;For example, inverting&#160;<code>[0, 1, 1]</code>&#160;results in&#160;<code>[1, 0, 0]</code>.</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>[[1,1,0],[1,0,1],[0,0,0]]
<strong>Output: </strong>[[1,0,0],[0,1,0],[1,1,1]]
<strong>Explanation:</strong> First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input: </strong>[[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
<strong>Output: </strong>[[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
<strong>Explanation:</strong> First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
</pre>

<p><strong>Notes:</strong></p>

<ul>
	<li><code>1 &lt;= A.length = A[0].length &lt;= 20</code></li>
	<li><code>0 &lt;= A[i][j]<font face="sans-serif, Arial, Verdana, Trebuchet MS">&#160;&lt;=&#160;</font>1</code></li>
</ul></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
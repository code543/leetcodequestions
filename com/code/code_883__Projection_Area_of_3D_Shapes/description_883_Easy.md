##[883.Projection Area of 3D Shapes](https://leetcode.com/problems/projection-area-of-3d-shapes/description/ "883.Projection Area of 3D Shapes")
######Difficulty:Easy
####Similiar Topics:
  [Math](https://leetcode.com//tag/math)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>On a&#160;<code>N&#160;*&#160;N</code> grid, we place some&#160;<code>1 * 1 * 1&#160;</code>cubes that are axis-aligned with the x, y, and z axes.</p>

<p>Each value&#160;<code>v = grid[i][j]</code>&#160;represents a tower of&#160;<code>v</code>&#160;cubes placed on top of grid cell <code>(i, j)</code>.</p>

<p>Now we view the&#160;<em>projection</em>&#160;of these cubes&#160;onto the xy, yz, and zx planes.</p>

<p>A projection is like a shadow, that&#160;maps our 3 dimensional figure to a 2 dimensional plane.&#160;</p>

<p>Here, we are viewing the "shadow" when looking at the cubes from the top, the front, and the side.</p>

<p>Return the total area of all three projections.</p>

<p>&#160;</p>

<div>
<ul>
</ul>
</div>

<div>
<div>
<ul>
</ul>
</div>
</div>

<div>
<div>
<div>
<div>
<ul>
</ul>
</div>
</div>
</div>
</div>

<div>
<div>
<div>
<div>
<div>
<div>
<div>
<div>
<ul>
</ul>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>

<div>
<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong><span id="example-input-1-1">[[2]]</span>
<strong>Output: </strong><span id="example-output-1">5</span>
</pre>

<div>
<p><strong>Example 2:</strong></p>

<pre><strong>Input: </strong><span id="example-input-2-1">[[1,2],[3,4]]</span>
<strong>Output: </strong><span id="example-output-2">17</span>
<strong>Explanation: </strong>
Here are the three projections ("shadows") of the shape made with each axis-aligned plane.
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/08/02/shadow.png" style="width: 749px; height: 200px;"/>
</pre>

<div>
<p><strong>Example 3:</strong></p>

<pre><strong>Input: </strong><span id="example-input-3-1">[[1,0],[0,2]]</span>
<strong>Output: </strong><span id="example-output-3">8</span>
</pre>

<div>
<p><strong>Example 4:</strong></p>

<pre><strong>Input: </strong><span id="example-input-4-1">[[1,1,1],[1,0,1],[1,1,1]]</span>
<strong>Output: </strong><span id="example-output-4">14</span>
</pre>

<div>
<p><strong>Example 5:</strong></p>

<pre><strong>Input: </strong><span id="example-input-5-1">[[2,2,2],[2,1,2],[2,2,2]]</span>
<strong>Output: </strong><span id="example-output-5">21</span>
</pre>

<p>&#160;</p>

<div>
<div>
<div>
<p><span><strong>Note:</strong></span></p>

<ul>
	<li><code>1 &lt;= grid.length = grid[0].length&#160;&lt;= 50</code></li>
	<li><code>0 &lt;= grid[i][j] &lt;= 50</code></li>
</ul>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
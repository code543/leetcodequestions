##[497.Random Point in Non-overlapping Rectangles](https://leetcode.com/problems/random-point-in-non-overlapping-rectangles/description/ "497.Random Point in Non-overlapping Rectangles")
######Difficulty:Medium
####Similiar Topics:
  [Random](https://leetcode.com//tag/random)  [Binary Search](https://leetcode.com//tag/binary-search)
####Similiar Problems:
  [Generate Random Point in a Circle](https://leetcode.com//problems/generate-random-point-in-a-circle)  [Random Pick with Weight](https://leetcode.com//problems/random-pick-with-weight)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given a list of <strong>non-overlapping</strong>&#160;axis-aligned rectangles <code>rects</code>, write a function <code>pick</code> which randomly and uniformily picks an <strong>integer point</strong> in the space&#160;covered by the rectangles.</p>

<p>Note:</p>

<ol>
	<li>An <strong>integer point</strong>&#160;is a point that has integer coordinates.&#160;</li>
	<li>A point&#160;on the perimeter&#160;of a rectangle is&#160;<strong>included</strong> in the space covered by the rectangles.&#160;</li>
	<li><code>i</code>th rectangle = <code>rects[i]</code> =&#160;<code>[x1,y1,x2,y2]</code>, where <code>[x1, y1]</code>&#160;are the integer coordinates of the bottom-left corner, and <code>[x2, y2]</code>&#160;are the integer coordinates of the top-right corner.</li>
	<li>length and width of each rectangle does not exceed <code>2000</code>.</li>
	<li><code>1 &lt;= rects.length&#160;&lt;= 100</code></li>
	<li><code>pick</code> return a point as an array of integer coordinates&#160;<code>[p_x, p_y]</code></li>
	<li><code>pick</code> is called at most <code>10000</code>&#160;times.</li>
</ol>

<div>
<p><strong>Example 1:</strong></p>

<pre><strong>Input: 
</strong><span id="example-input-1-1">["Solution","pick","pick","pick"]
</span><span id="example-input-1-2">[[[[1,1,5,5]]],[],[],[]]</span>
<strong>Output: 
</strong><span id="example-output-1">[null,[4,1],[4,1],[3,3]]</span>
</pre>

<div>
<p><strong>Example 2:</strong></p>

<pre><strong>Input: 
</strong><span id="example-input-2-1">["Solution","pick","pick","pick","pick","pick"]
</span><span id="example-input-2-2">[[[[-2,-2,-1,-1],[1,0,3,0]]],[],[],[],[],[]]</span>
<strong>Output: 
</strong><span id="example-output-2">[null,[-1,-2],[2,0],[-2,-1],[3,0],[-2,-2]]</span></pre>
</div>

<div>
<p><strong>Explanation of Input Syntax:</strong></p>

<p>The input is two lists:&#160;the subroutines called&#160;and their&#160;arguments.&#160;<code>Solution</code>'s&#160;constructor has one argument, the array of rectangles <code>rects</code>. <code>pick</code>&#160;has no arguments.&#160;Arguments&#160;are&#160;always wrapped with a list, even if there aren't any.</p>
</div>
</div>

<div>
<div>&#160;</div>
</div>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
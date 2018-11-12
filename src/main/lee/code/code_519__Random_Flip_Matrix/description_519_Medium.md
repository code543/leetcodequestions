##[519.Random Flip Matrix](https://leetcode.com/problems/random-flip-matrix/description/ "519.Random Flip Matrix")
######Difficulty:Medium
####Similiar Topics:
  [Random](https://leetcode.com//tag/random)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>You are given the number of rows <code>n_rows</code>&#160;and number of columns <code>n_cols</code>&#160;of a&#160;2D&#160;binary matrix&#160;where all values are initially 0.&#160;Write a function <code>flip</code>&#160;which chooses&#160;a 0 value&#160;<a href="https://en.wikipedia.org/wiki/Discrete_uniform_distribution" target="_blank">uniformly at random</a>,&#160;changes it to 1,&#160;and then returns the position <code>[row.id, col.id]</code> of that value. Also, write a function <code>reset</code> which sets all values back to 0.&#160;<strong>Try to minimize the number of calls to system's Math.random()</strong> and optimize the time and&#160;space complexity.</p>

<p>Note:</p>

<ol>
	<li><code>1 &lt;= n_rows, n_cols&#160;&lt;= 10000</code></li>
	<li><code>0 &lt;= row.id &lt; n_rows</code> and <code>0 &lt;= col.id &lt; n_cols</code></li>
	<li><code>flip</code>&#160;will not be called when the matrix has no&#160;0 values left.</li>
	<li>the total number of calls to&#160;<code>flip</code>&#160;and <code>reset</code>&#160;will not exceed&#160;1000.</li>
</ol>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: 
</strong><span id="example-input-1-1">["Solution","flip","flip","flip","flip"]
</span><span id="example-input-1-2">[[2,3],[],[],[],[]]</span>
<strong>Output: </strong><span id="example-output-1">[null,[0,1],[1,2],[1,0],[1,1]]</span>
</pre>

<div>
<p><strong>Example 2:</strong></p>

<pre><strong>Input: 
</strong><span id="example-input-2-1">["Solution","flip","flip","reset","flip"]
</span><span id="example-input-2-2">[[1,2],[],[],[],[]]</span>
<strong>Output: </strong><span id="example-output-2">[null,[0,0],[0,1],null,[0,0]]</span></pre>
</div>

<p><strong>Explanation of Input Syntax:</strong></p>

<p>The input is two lists:&#160;the subroutines called&#160;and their&#160;arguments. <code>Solution</code>'s constructor&#160;has two arguments, <code>n_rows</code> and <code>n_cols</code>.&#160;<code>flip</code>&#160;and <code>reset</code> have&#160;no&#160;arguments.&#160;Arguments&#160;are&#160;always wrapped with a list, even if there aren't any.</p>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
##[710.Random Pick with Blacklist](https://leetcode.com/problems/random-pick-with-blacklist/description/ "710.Random Pick with Blacklist")
######Difficulty:Hard
####Similiar Topics:
  [Random](https://leetcode.com//tag/random)  [Hash Table](https://leetcode.com//tag/hash-table)  [Sort](https://leetcode.com//tag/sort)  [Binary Search](https://leetcode.com//tag/binary-search)
####Similiar Problems:
  [Random Pick Index](https://leetcode.com//problems/random-pick-index)  [Random Pick with Weight](https://leetcode.com//problems/random-pick-with-weight)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given a blacklist&#160;<code>B</code> containing unique integers&#160;from <code>[0, N)</code>, write a function to return a uniform random integer from <code>[0, N)</code> which is <strong>NOT</strong>&#160;in <code>B</code>.</p>

<p>Optimize it such that it minimizes the call to system&#8217;s <code>Math.random()</code>.</p>

<p><strong>Note:</strong></p>

<ol>
	<li><code>1 &lt;= N &lt;= 1000000000</code></li>
	<li><code>0 &lt;= B.length &lt; min(100000, N)</code></li>
	<li><code>[0, N)</code>&#160;does NOT include N. See <a href="https://en.wikipedia.org/wiki/Interval_(mathematics)" target="_blank">interval notation</a>.</li>
</ol>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: 
</strong><span id="example-input-1-1">["Solution","pick","pick","pick"]
</span><span id="example-input-1-2">[[1,[]],[],[],[]]</span>
<strong>Output: </strong><span id="example-output-1">[null,0,0,0]</span>
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input: 
</strong><span id="example-input-2-1">["Solution","pick","pick","pick"]
</span><span id="example-input-2-2">[[2,[]],[],[],[]]</span>
<strong>Output: </strong><span id="example-output-2">[null,1,1,1]</span>
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input: 
</strong><span id="example-input-3-1">["Solution","pick","pick","pick"]
</span><span id="example-input-3-2">[[3,[1]],[],[],[]]</span>
<strong>Output: </strong><span id="example-output-3">[null,0,0,2]</span>
</pre>

<p><strong>Example 4:</strong></p>

<pre><strong>Input: 
</strong><span id="example-input-4-1">["Solution","pick","pick","pick"]
</span><span id="example-input-4-2">[[4,[2]],[],[],[]]</span>
<strong>Output: </strong><span id="example-output-4">[null,1,3,1]</span>
</pre>

<p><strong>Explanation of Input Syntax:</strong></p>

<p>The input is two lists:&#160;the subroutines called&#160;and their&#160;arguments.&#160;<code>Solution</code>'s&#160;constructor has two arguments,&#160;<code>N</code> and the blacklist <code>B</code>. <code>pick</code> has no arguments.&#160;Arguments&#160;are&#160;always wrapped with a list, even if there aren't any.</p>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
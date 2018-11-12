##[879.Profitable Schemes](https://leetcode.com/problems/profitable-schemes/description/ "879.Profitable Schemes")
######Difficulty:Hard
####Similiar Topics:
  [Dynamic Programming](https://leetcode.com//tag/dynamic-programming)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>There are G people in a gang, and a list of various crimes they could commit.</p>

<p>The <code>i</code>-th crime generates a <code>profit[i]</code> and requires <code>group[i]</code> gang members to participate.</p>

<p>If a gang member participates in one crime, that member can't participate in another crime.</p>

<p>Let's call a <em>profitable&#160;scheme</em>&#160;any subset of these crimes that generates at least <code>P</code> profit, and the total number of gang members participating in that subset of crimes is at most G.</p>

<p>How many schemes can be chosen?&#160; Since the answer may be very&#160;large, <strong>return it modulo</strong> <code>10^9 + 7</code>.</p>

<p>&#160;</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>G = <span id="example-input-1-1">5</span>, P = <span id="example-input-1-2">3</span>, group = <span id="example-input-1-3">[2,2]</span>, profit = <span id="example-input-1-4">[2,3]</span>
<strong>Output: </strong><span id="example-output-1">2</span>
<strong>Explanation: </strong>
To make a profit of at least 3, the gang could either commit crimes 0 and 1, or just crime 1.
In total, there are 2 schemes.
</pre>

<div>
<p><strong>Example 2:</strong></p>

<pre><strong>Input: </strong>G = <span id="example-input-2-1">10</span>, P = <span id="example-input-2-2">5</span>, group = <span id="example-input-2-3">[2,3,5]</span>, profit = <span id="example-input-2-4">[6,7,8]</span>
<strong>Output: </strong><span id="example-output-2">7</span>
<strong>Explanation: </strong>
To make a profit of at least 5, the gang could commit any crimes, as long as they commit one.
There are 7 possible schemes: (0), (1), (2), (0,1), (0,2), (1,2), and (0,1,2).
</pre>

<p>&#160;</p>
</div>

<p><strong>Note:</strong></p>

<ol>
	<li><code>1 &lt;= G &lt;= 100</code></li>
	<li><code>0 &lt;= P &lt;= 100</code></li>
	<li><code>1 &lt;= group[i] &lt;= 100</code></li>
	<li><code>0 &lt;= profit[i] &lt;= 100</code></li>
	<li><code>1 &lt;= group.length = profit.length &lt;= 100</code></li>
</ol>

<div>
<div>&#160;</div>
</div>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
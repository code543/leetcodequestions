##[903.Valid Permutations for DI Sequence](https://leetcode.com/problems/valid-permutations-for-di-sequence/description/ "903.Valid Permutations for DI Sequence")
######Difficulty:Hard
####Similiar Topics:
  [Dynamic Programming](https://leetcode.com//tag/dynamic-programming)  [Divide and Conquer](https://leetcode.com//tag/divide-and-conquer)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>We are given <code>S</code>, a length <code>n</code> string of characters from the set <code>{'D', 'I'}</code>. (These letters stand for "decreasing" and "increasing".)</p>

<p>A&#160;<em>valid permutation</em>&#160;is a permutation <code>P[0], P[1], ..., P[n]</code> of integers&#160;<code>{0, 1, ..., n}</code>, such that for all <code>i</code>:</p>

<ul>
	<li>If <code>S[i] == 'D'</code>, then <code>P[i] &gt; P[i+1]</code>, and;</li>
	<li>If <code>S[i] == 'I'</code>, then <code>P[i] &lt; P[i+1]</code>.</li>
</ul>

<p>How many valid permutations are there?&#160; Since the answer may be large, <strong>return your answer modulo <code>10^9 + 7</code></strong>.</p>

<p>&#160;</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong><span id="example-input-1-1">"DID"</span>
<strong>Output: </strong><span id="example-output-1">5</span>
<strong>Explanation: </strong>
The 5 valid permutations of (0, 1, 2, 3) are:
(1, 0, 3, 2)
(2, 0, 3, 1)
(2, 1, 3, 0)
(3, 0, 2, 1)
(3, 1, 2, 0)
</pre>

<p>&#160;</p>

<p><strong>Note:</strong></p>

<ol>
	<li><code>1 &lt;= S.length &lt;= 200</code></li>
	<li><code>S</code> consists only of characters from the set <code>{'D', 'I'}</code>.</li>
</ol>

<div>
<p>&#160;</p>
</div>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
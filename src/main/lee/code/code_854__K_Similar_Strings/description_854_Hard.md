##[854.K-Similar Strings](https://leetcode.com/problems/k-similar-strings/description/ "854.K-Similar Strings")
######Difficulty:Hard
####Similiar Topics:
  [Breadth-first Search](https://leetcode.com//tag/breadth-first-search)  [Graph](https://leetcode.com//tag/graph)
####Similiar Problems:
  [Couples Holding Hands](https://leetcode.com//problems/couples-holding-hands)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Strings&#160;<code>A</code> and <code>B</code> are <code>K</code>-similar (for some non-negative integer <code>K</code>) if we can swap the positions of two letters in <code>A</code> exactly <code>K</code>&#160;times so that the resulting string equals <code>B</code>.</p>

<p>Given two anagrams <code>A</code> and <code>B</code>, return the smallest <code>K</code>&#160;for which <code>A</code> and <code>B</code> are <code>K</code>-similar.</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>A = <span id="example-input-1-1">"ab"</span>, B = <span id="example-input-1-2">"ba"</span>
<strong>Output: </strong><span id="example-output-1">1</span>
</pre>

<div>
<p><strong>Example 2:</strong></p>

<pre><strong>Input: </strong>A = <span id="example-input-2-1">"abc"</span>, B = <span id="example-input-2-2">"bca"</span>
<strong>Output: </strong><span id="example-output-2">2</span>
</pre>

<div>
<p><strong>Example 3:</strong></p>

<pre><strong>Input: </strong>A = <span id="example-input-3-1">"abac"</span>, B = <span id="example-input-3-2">"baca"</span>
<strong>Output: </strong><span id="example-output-3">2</span>
</pre>

<div>
<p><strong>Example 4:</strong></p>

<pre><strong>Input: </strong>A = <span id="example-input-4-1">"aabc"</span>, B = <span id="example-input-4-2">"abca"</span>
<strong>Output: </strong><span id="example-output-4">2</span></pre>
</div>
</div>
</div>

<p><strong>Note:</strong></p>

<ol>
	<li><code>1 &lt;= A.length == B.length &lt;= 20</code></li>
	<li><code>A</code> and <code>B</code> contain only lowercase letters from the set <code>{'a', 'b', 'c', 'd', 'e', 'f'}</code></li>
</ol>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
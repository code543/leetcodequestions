##[893.Groups of Special-Equivalent Strings](https://leetcode.com/problems/groups-of-special-equivalent-strings/description/ "893.Groups of Special-Equivalent Strings")
######Difficulty:Easy
####Similiar Topics:
  [String](https://leetcode.com//tag/string)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>You are given an array <code>A</code> of strings.</p>

<p>Two strings <code>S</code> and <code>T</code> are&#160;<em>special-equivalent</em>&#160;if after any number of <em>moves</em>, S == T.</p>

<p>A <em>move</em> consists of choosing two indices <code>i</code> and <code>j</code> with <code>i % 2 == j % 2</code>, and swapping <code>S[i]</code> with <code>S[j]</code>.</p>

<p>Now, a <em>group of special-equivalent strings from <code>A</code></em>&#160;is a&#160;non-empty subset S of <code>A</code>&#160;such that any string not in S&#160;is not special-equivalent with any string in S.</p>

<p>Return the number of groups of special-equivalent strings from <code>A</code>.</p>

<p>&#160;</p>

<ul>
</ul>

<div>
<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong><span id="example-input-1-1">["a","b","c","a","c","c"]</span>
<strong>Output: </strong><span id="example-output-1">3</span>
<span><strong>Explanation</strong>: 3 groups ["a","a"], ["b"], ["c","c","c"]</span>
</pre>

<div>
<p><strong>Example 2:</strong></p>

<pre><strong>Input: </strong><span id="example-input-2-1">["aa","bb","ab","ba"]</span>
<strong>Output: </strong><span id="example-output-2">4</span>
<strong>Explanation</strong>: 4 groups <span id="example-input-2-1">["aa"], ["bb"], ["ab"], ["ba"]</span>
</pre>

<div>
<p><strong>Example 3:</strong></p>

<pre><strong>Input: </strong><span id="example-input-3-1">["abc","acb","bac","bca","cab","cba"]</span>
<strong>Output: </strong><span id="example-output-3">3</span>
<strong>Explanation</strong>: 3 groups ["abc","cba"], ["acb","bca"], ["bac","cab"]
</pre>

<div>
<p><strong>Example 4:</strong></p>

<pre><strong>Input: </strong><span id="example-input-4-1">["abcd","cdab","adcb","cbad"]</span>
<strong>Output: </strong><span id="example-output-4">1</span>
<strong>Explanation</strong>: 1 group <span id="example-input-4-1">["abcd","cdab","adcb","cbad"]</span>
</pre>

<p>&#160;</p>

<p><strong>Note:</strong></p>

<ul>
	<li><code>1 &lt;= A.length &lt;= 1000</code></li>
	<li><code>1 &lt;= A[i].length &lt;= 20</code></li>
	<li>All <code>A[i]</code> have the same length.</li>
	<li>All <code>A[i]</code> consist of only lowercase letters.</li>
</ul>
</div>
</div>
</div>
</div>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
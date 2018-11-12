##[44.Wildcard Matching](https://leetcode.com/problems/wildcard-matching/description/ "44.Wildcard Matching")
######Difficulty:Hard
####Similiar Topics:
  [Backtracking](https://leetcode.com//tag/backtracking)  [Dynamic Programming](https://leetcode.com//tag/dynamic-programming)  [Greedy](https://leetcode.com//tag/greedy)  [String](https://leetcode.com//tag/string)
####Similiar Problems:
  [Regular Expression Matching](https://leetcode.com//problems/regular-expression-matching)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given an input string (<code>s</code>) and a pattern (<code>p</code>), implement wildcard pattern matching with support for <code>'?'</code> and <code>'*'</code>.</p>

<pre>'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
</pre>

<p>The matching should cover the <strong>entire</strong> input string (not partial).</p>

<p><strong>Note:</strong></p>

<ul>
	<li><code>s</code>&#160;could be empty and contains only lowercase letters <code>a-z</code>.</li>
	<li><code>p</code> could be empty and contains only lowercase letters <code>a-z</code>, and characters like <code><font face="monospace">?</font></code>&#160;or&#160;<code>*</code>.</li>
</ul>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong>
s = "aa"
p = "a"
<strong>Output:</strong> false
<strong>Explanation:</strong> "a" does not match the entire string "aa".
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong>
s = "aa"
p = "*"
<strong>Output:</strong> true
<strong>Explanation:</strong>&#160;'*' matches any sequence.
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong>
s = "cb"
p = "?a"
<strong>Output:</strong> false
<strong>Explanation:</strong>&#160;'?' matches 'c', but the second letter is 'a', which does not match 'b'.
</pre>

<p><strong>Example 4:</strong></p>

<pre><strong>Input:</strong>
s = "adceb"
p = "*a*b"
<strong>Output:</strong> true
<strong>Explanation:</strong>&#160;The first '*' matches the empty sequence, while the second '*' matches the substring "dce".
</pre>

<p><strong>Example 5:</strong></p>

<pre><strong>Input:</strong>
s = "acdcb"
p = "a*c?b"
<strong>Output:</strong> false
</pre>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
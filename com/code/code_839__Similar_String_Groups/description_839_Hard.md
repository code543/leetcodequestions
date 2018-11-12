##[839.Similar String Groups](https://leetcode.com/problems/similar-string-groups/description/ "839.Similar String Groups")
######Difficulty:Hard
####Similiar Topics:
  [Union Find](https://leetcode.com//tag/union-find)  [Graph](https://leetcode.com//tag/graph)  [Depth-first Search](https://leetcode.com//tag/depth-first-search)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Two strings <code>X</code>&#160;and <code>Y</code>&#160;are similar if we can swap two letters (in different positions) of <code>X</code>, so that&#160;it equals <code>Y</code>.</p>

<p>For example, <code>"tars"</code>&#160;and <code>"rats"</code>&#160;are similar (swapping at positions <code>0</code> and <code>2</code>), and <code>"rats"</code> and <code>"arts"</code> are similar, but <code>"star"</code> is not similar to <code>"tars"</code>, <code>"rats"</code>, or <code>"arts"</code>.</p>

<p>Together, these form two connected groups by similarity: <code>{"tars", "rats", "arts"}</code> and <code>{"star"}</code>.&#160; Notice that <code>"tars"</code> and <code>"arts"</code> are in the same group even though they are not similar.&#160; Formally, each group is such that a word is in the group if and only if it is similar to at least one other word in the group.</p>

<p>We are given a list <code>A</code> of strings.&#160; Every string in <code>A</code> is an anagram of every other string in <code>A</code>.&#160; How many groups are there?</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>["tars","rats","arts","star"]
<strong>Output: </strong>2</pre>

<p><strong>Note:</strong></p>

<ol>
	<li><code>A.length &lt;= 2000</code></li>
	<li><code>A[i].length &lt;= 1000</code></li>
	<li><code>A.length * A[i].length &lt;= 20000</code></li>
	<li>All words in <code>A</code>&#160;consist of lowercase letters only.</li>
	<li>All words in <code>A</code> have the same length and are anagrams of each other.</li>
	<li>The judging time limit has been increased for this question.</li>
</ol>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
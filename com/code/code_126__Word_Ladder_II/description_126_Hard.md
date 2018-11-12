##[126.Word Ladder II](https://leetcode.com/problems/word-ladder-ii/description/ "126.Word Ladder II")
######Difficulty:Hard
####Similiar Topics:
  [Backtracking](https://leetcode.com//tag/backtracking)  [Breadth-first Search](https://leetcode.com//tag/breadth-first-search)  [Array](https://leetcode.com//tag/array)  [String](https://leetcode.com//tag/string)
####Similiar Problems:
  [Word Ladder](https://leetcode.com//problems/word-ladder)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given two words (<em>beginWord</em> and <em>endWord</em>), and a dictionary's word list, find all shortest transformation sequence(s) from <em>beginWord</em> to <em>endWord</em>, such that:</p>

<ol>
	<li>Only one letter can be changed at a time</li>
	<li>Each transformed word must exist in the word list. Note that <em>beginWord</em> is <em>not</em> a transformed word.</li>
</ol>

<p><strong>Note:</strong></p>

<ul>
	<li>Return an empty list if there is no such transformation sequence.</li>
	<li>All words have the same length.</li>
	<li>All words contain only lowercase alphabetic characters.</li>
	<li>You may assume no duplicates in the word list.</li>
	<li>You may assume <em>beginWord</em> and <em>endWord</em> are non-empty and are not the same.</li>
</ul>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong>
beginWord = "hit",
endWord = "cog",
wordList = ["hot","dot","dog","lot","log","cog"]

<strong>Output:</strong>
[
  ["hit","hot","dot","dog","cog"],
&#160; ["hit","hot","lot","log","cog"]
]
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong>
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log"]

<strong>Output: </strong>[]

<strong>Explanation:</strong>&#160;The endWord "cog" is not in wordList, therefore no possible<strong>&#160;</strong>transformation.
</pre>

<ul>
</ul>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
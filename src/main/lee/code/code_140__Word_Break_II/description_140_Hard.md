##[140.Word Break II](https://leetcode.com/problems/word-break-ii/description/ "140.Word Break II")
######Difficulty:Hard
####Similiar Topics:
  [Backtracking](https://leetcode.com//tag/backtracking)  [Dynamic Programming](https://leetcode.com//tag/dynamic-programming)
####Similiar Problems:
  [Word Break](https://leetcode.com//problems/word-break)  [Concatenated Words](https://leetcode.com//problems/concatenated-words)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given a <strong>non-empty</strong> string <em>s</em> and a dictionary <em>wordDict</em> containing a list of <strong>non-empty</strong> words, add spaces in <em>s</em> to construct a sentence where each word is a valid dictionary word.&#160;Return all such possible sentences.</p>

<p><strong>Note:</strong></p>

<ul>
	<li>The same word in the dictionary may be reused multiple times in the segmentation.</li>
	<li>You may assume the dictionary does not contain duplicate words.</li>
</ul>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:
</strong>s = "<code>catsanddog</code>"
wordDict = <code>["cat", "cats", "and", "sand", "dog"]</code>
<strong>Output:
</strong><code>[
&#160; "cats and dog",
&#160; "cat sand dog"
]</code>
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:
</strong>s = "pineapplepenapple"
wordDict = ["apple", "pen", "applepen", "pine", "pineapple"]
<strong>Output:
</strong>[
&#160; "pine apple pen apple",
&#160; "pineapple pen apple",
&#160; "pine applepen apple"
]
<strong>Explanation:</strong> Note that you are allowed to reuse a dictionary word.
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:
</strong>s = "catsandog"
wordDict = ["cats", "dog", "sand", "and", "cat"]
<strong>Output:
</strong>[]</pre>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
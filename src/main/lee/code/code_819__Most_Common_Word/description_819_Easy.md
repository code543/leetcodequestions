##[819.Most Common Word](https://leetcode.com/problems/most-common-word/description/ "819.Most Common Word")
######Difficulty:Easy
####Similiar Topics:
  [String](https://leetcode.com//tag/string)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given a paragraph&#160;and a list of banned words, return the most frequent word that is not in the list of banned words.&#160; It is guaranteed there is at least one word that isn't banned, and that the answer is unique.</p>

<p>Words in the list of banned words are given in lowercase, and free of punctuation.&#160; Words in the paragraph are not case sensitive.&#160; The answer is in lowercase.</p>

<pre><strong>Example:</strong>
<strong>Input:</strong> 
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]
<strong>Output:</strong> "ball"
<strong>Explanation:</strong> 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.
</pre>

<p>&#160;</p>

<p><strong>Note: </strong></p>

<ul>
	<li><code>1 &lt;= paragraph.length &lt;= 1000</code>.</li>
	<li><code>1 &lt;= banned.length &lt;= 100</code>.</li>
	<li><code>1 &lt;= banned[i].length &lt;= 10</code>.</li>
	<li>The answer is unique, and written in lowercase (even if its occurrences in <code>paragraph</code>&#160;may have&#160;uppercase symbols, and even if it is a proper noun.)</li>
	<li><code>paragraph</code> only consists of letters, spaces, or the punctuation symbols <code>!?',;.</code></li>
	<li>Different words in&#160;<code>paragraph</code>&#160;are always separated by a space.</li>
	<li>There are no hyphens or hyphenated words.</li>
	<li>Words only consist of letters, never apostrophes or other punctuation symbols.</li>
</ul>

<p>&#160;</p>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
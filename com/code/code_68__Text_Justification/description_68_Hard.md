##[68.Text Justification](https://leetcode.com/problems/text-justification/description/ "68.Text Justification")
######Difficulty:Hard
####Similiar Topics:
  [String](https://leetcode.com//tag/string)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given an array of words and a width&#160;<em>maxWidth</em>, format the text such that each line has exactly <em>maxWidth</em> characters and is fully (left and right) justified.</p>

<p>You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces <code>' '</code> when necessary so that each line has exactly <em>maxWidth</em> characters.</p>

<p>Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.</p>

<p>For the last line of text, it should be left justified and no <strong>extra</strong> space is inserted between words.</p>

<p><strong>Note:</strong></p>

<ul>
	<li>A word is defined as a character sequence consisting&#160;of non-space characters only.</li>
	<li>Each word's length is&#160;guaranteed to be greater than 0 and not exceed <em>maxWidth</em>.</li>
	<li>The input array <code>words</code>&#160;contains at least one word.</li>
</ul>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong>
words = ["This", "is", "an", "example", "of", "text", "justification."]
maxWidth = 16
<strong>Output:</strong>
[
&#160; &#160;"This &#160; &#160;is &#160; &#160;an",
&#160; &#160;"example &#160;of text",
&#160; &#160;"justification. &#160;"
]
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong>
words = ["What","must","be","acknowledgment","shall","be"]
maxWidth = 16
<strong>Output:</strong>
[
&#160; "What &#160; must &#160; be",
&#160; "acknowledgment &#160;",
&#160; "shall be &#160; &#160; &#160; &#160;"
]
<strong>Explanation:</strong> Note that the last line is "shall be    " instead of "shall     be",
&#160;            because the last line must be left-justified instead of fully-justified.
             Note that the second line is also left-justified becase it contains only one word.
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong>
words = ["Science","is","what","we","understand","well","enough","to","explain",
&#160;        "to","a","computer.","Art","is","everything","else","we","do"]
maxWidth = 20
<strong>Output:</strong>
[
&#160; "Science &#160;is &#160;what we",
  "understand &#160; &#160; &#160;well",
&#160; "enough to explain to",
&#160; "a &#160;computer. &#160;Art is",
&#160; "everything &#160;else &#160;we",
&#160; "do &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160;"
]
</pre>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
##[820.Short Encoding of Words](https://leetcode.com/problems/short-encoding-of-words/description/ "820.Short Encoding of Words")
######Difficulty:Medium
####Similiar Topics:

####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given a list of words, we may encode it by writing a reference string <code>S</code> and a list of indexes <code>A</code>.</p>

<p>For example, if the list of words is <code>["time", "me", "bell"]</code>, we can write it as <code>S = "time#bell#"</code>&#160;and <code>indexes = [0, 2, 5]</code>.</p>

<p>Then for each index, we will recover the word by reading from the reference string from that index until we reach a "#" character.</p>

<p>What is the length of the shortest reference string S possible that encodes the given words?</p>

<p><strong>Example:</strong></p>

<pre><strong>Input:</strong> words = <code>["time", "me", "bell"]</code>
<strong>Output:</strong> 10
<strong>Explanation:</strong> S = <code>"time#bell#" and indexes = [0, 2, 5</code>].
</pre>

<p><strong>Note:</strong></p>

<ol>
	<li><code>1 &lt;= words.length&#160;&lt;= 2000.</code></li>
	<li><code>1 &lt;=&#160;words[i].length&#160;&lt;= 7.</code></li>
	<li>Each word&#160;has only&#160;lowercase letters.</li>
</ol>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
##[648.Replace Words](https://leetcode.com/problems/replace-words/description/ "648.Replace Words")
######Difficulty:Medium
####Similiar Topics:
  [Hash Table](https://leetcode.com//tag/hash-table)  [Trie](https://leetcode.com//tag/trie)
####Similiar Problems:
  [Implement Trie (Prefix Tree)](https://leetcode.com//problems/implement-trie-prefix-tree)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>
In English, we have a concept called <code>root</code>, which can be followed by some other words to form another longer word - let's call this word <code>successor</code>. For example, the root <code>an</code>, followed by <code>other</code>, which can form another word <code>another</code>.
</p>


<p>
Now, given a dictionary consisting of many roots and a sentence. You need to replace all the <code>successor</code> in the sentence with the <code>root</code> forming it. If a <code>successor</code> has many <code>roots</code> can form it, replace it with the root with the shortest length.
</p>

<p>
You need to output the sentence after the replacement.
</p>


<p><b>Example 1:</b><br/>
</p><pre><b>Input:</b> dict = ["cat", "bat", "rat"]
sentence = "the cattle was rattled by the battery"
<b>Output:</b> "the cat was rat by the bat"
</pre>
<p/>


<p><b>Note:</b><br/>
</p><ol>
<li>The input will only have lower-case letters.</li>
<li> 1 &lt;= dict words number &lt;= 1000 </li>
<li> 1 &lt;= sentence words number &lt;= 1000  </li>
<li> 1 &lt;= root length &lt;= 100 </li>
<li> 1 &lt;= sentence words length &lt;= 1000 </li>
</ol>
<p/></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
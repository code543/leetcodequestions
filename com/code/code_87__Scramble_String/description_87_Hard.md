##[87.Scramble String](https://leetcode.com/problems/scramble-string/description/ "87.Scramble String")
######Difficulty:Hard
####Similiar Topics:
  [Dynamic Programming](https://leetcode.com//tag/dynamic-programming)  [String](https://leetcode.com//tag/string)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Given a string <em>s1</em>, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.</p>

<p>Below is one possible representation of <em>s1</em> = <code>"great"</code>:</p>

<pre>    great
   /    \
  gr    eat
 / \    /  \
g   r  e   at
           / \
          a   t
</pre>

<p>To scramble the string, we may choose any non-leaf node and swap its two children.</p>

<p>For example, if we choose the node <code>"gr"</code> and swap its two children, it produces a scrambled string <code>"rgeat"</code>.</p>

<pre>    rgeat
   /    \
  rg    eat
 / \    /  \
r   g  e   at
           / \
          a   t
</pre>

<p>We say that <code>"rgeat"</code> is a scrambled string of <code>"great"</code>.</p>

<p>Similarly, if we continue to swap the children of nodes <code>"eat"</code> and <code>"at"</code>, it produces a scrambled string <code>"rgtae"</code>.</p>

<pre>    rgtae
   /    \
  rg    tae
 / \    /  \
r   g  ta  e
       / \
      t   a
</pre>

<p>We say that <code>"rgtae"</code> is a scrambled string of <code>"great"</code>.</p>

<p>Given two strings <em>s1</em> and <em>s2</em> of the same length, determine if <em>s2</em> is a scrambled string of <em>s1</em>.</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> s1 = "great", s2 = "rgeat"
<strong>Output:</strong> true
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> s1 = "abcde", s2 = "caebd"
<strong>Output:</strong> false</pre>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
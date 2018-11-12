##[843.Guess the Word](https://leetcode.com/problems/guess-the-word/description/ "843.Guess the Word")
######Difficulty:Hard
####Similiar Topics:
  [Minimax](https://leetcode.com//tag/minimax)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>This problem is an&#160;<strong><em>interactive problem</em></strong>&#160;new to the LeetCode platform.</p>

<p>We are given a word list of unique words, each word is 6 letters long, and one word in this list is chosen as <strong>secret</strong>.</p>

<p>You may call <code>master.guess(word)</code>&#160;to guess a word.&#160; The guessed word should have&#160;type <code>string</code>&#160;and must be from the original list&#160;with 6 lowercase letters.</p>

<p>This function returns an&#160;<code>integer</code>&#160;type, representing&#160;the number of exact matches (value and position) of your guess to the <strong>secret word</strong>.&#160; Also, if your guess is not in the given wordlist, it will return <code>-1</code> instead.</p>

<p>For each test case, you have 10 guesses to guess the word. At the end of any number of calls, if you have made 10 or less calls to <code>master.guess</code>&#160;and at least one of these guesses was the <strong>secret</strong>, you pass the testcase.</p>

<p>Besides the example test case below, there will be 5&#160;additional test cases, each with 100 words in the word list.&#160; The letters of each word in those testcases were chosen&#160;independently at random from <code>'a'</code> to <code>'z'</code>, such that every word in the given word lists is unique.</p>

<pre><strong>Example 1:</strong>
<strong>Input:</strong>&#160;secret = "acckzz", wordlist = ["acckzz","ccbazz","eiowzz","abcczz"]

<strong>Explanation:</strong>

<code>master.guess("aaaaaa")</code> returns -1, because&#160;<code>"aaaaaa"</code>&#160;is not in wordlist.
<code>master.guess("acckzz") </code>returns 6, because&#160;<code>"acckzz"</code> is secret and has all 6&#160;matches.
<code>master.guess("ccbazz")</code> returns 3, because<code>&#160;"ccbazz"</code>&#160;has 3 matches.
<code>master.guess("eiowzz")</code> returns 2, because&#160;<code>"eiowzz"</code>&#160;has 2&#160;matches.
<code>master.guess("abcczz")</code> returns 4, because&#160;<code>"abcczz"</code> has 4 matches.

We made 5 calls to&#160;master.guess and one of them was the secret, so we pass the test case.
</pre>

<p><strong>Note:</strong>&#160; Any solutions that attempt to circumvent the judge&#160;will result in disqualification.</p>
</div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
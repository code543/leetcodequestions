##[488.Zuma Game](https://leetcode.com/problems/zuma-game/description/ "488.Zuma Game")
######Difficulty:Hard
####Similiar Topics:
  [Depth-first Search](https://leetcode.com//tag/depth-first-search)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>Think about Zuma Game. You have a row of balls on the table, colored red(R), yellow(Y), blue(B), green(G), and white(W). You also have several balls in your hand.</p>
<p>
Each time, you may choose a ball in your hand, and insert it into the row (including the leftmost place and rightmost place). Then, if there is a group of 3 or more balls in the same color touching, remove these balls. Keep doing this until no more balls can be removed.</p>
<p>
Find the minimal balls you have to insert to remove all the balls on the table. If you cannot remove all the balls, output -1.
</p>
<pre><p><b>Examples:</b><br/>
<b>Input:</b> "WRRBBW", "RB"
<b>Output:</b> -1
<b>Explanation:</b> WRRBBW -&gt; WRR[R]BBW -&gt; WBBW -&gt; WBB[B]W -&gt; WW

<b>Input:</b> "WWRRBBWW", "WRBRW"
<b>Output:</b> 2
<b>Explanation:</b> WWRRBBWW -&gt; WWRR[R]BBWW -&gt; WWBBWW -&gt; WWBB[B]WW -&gt; WWWW -&gt; empty

<b>Input:</b>"G", "GGGGG"
<b>Output:</b> 2
<b>Explanation:</b> G -&gt; G[G] -&gt; GG[G] -&gt; empty 

<b>Input:</b> "RBYYBBRRB", "YRBGB"
<b>Output:</b> 3
<b>Explanation:</b> RBYYBBRRB -&gt; RBYY[Y]BBRRB -&gt; RBBBRRB -&gt; RRRB -&gt; B -&gt; B[B] -&gt; BB[B] -&gt; empty 
</p></pre>
<p/>

<p><b>Note:</b><br/>
</p><ol>
<li>You may assume that the initial row of balls on the table won&#8217;t have any 3 or more consecutive balls with the same color.</li>
<li>The number of balls on the table won't exceed 20, and the string represents these balls is called "board" in the input.</li>
<li>The number of balls in your hand won't exceed 5, and the string represents these balls is called "hand" in the input.</li>
<li>Both input strings will be non-empty and only contain characters 'R','Y','B','G','W'.</li>
</ol>
<p/></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
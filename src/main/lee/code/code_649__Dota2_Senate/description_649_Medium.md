##[649.Dota2 Senate](https://leetcode.com/problems/dota2-senate/description/ "649.Dota2 Senate")
######Difficulty:Medium
####Similiar Topics:
  [Greedy](https://leetcode.com//tag/greedy)
####Similiar Problems:
  [Teemo Attacking](https://leetcode.com//problems/teemo-attacking)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>
In the world of Dota2, there are two parties: the <code>Radiant</code> and the <code>Dire</code>.
</p>

<p>
The Dota2 senate consists of senators coming from two parties. Now the senate wants to make a decision about a change in the Dota2 game. The voting for this change is a round-based procedure. In each round, each senator can exercise <code>one</code> of the two rights:
</p><ol>
<li><code>Ban one senator's right</code>: <br/>A senator can make another senator lose <b>all his rights</b> in this and all the following rounds.</li>
<li><code>Announce the victory</code>: <br/>If this senator found the senators who still have rights to vote are all from <b>the same party</b>, he can announce the victory and make the decision about the change in the game.</li>
</ol>
<p/>

<p>
Given a string representing each senator's party belonging. The character 'R' and 'D' represent the <code>Radiant</code> party and the <code>Dire</code> party respectively. Then if there are <code>n</code> senators, the size of the given string will be <code>n</code>.
</p>

<p>
The round-based procedure starts from the first senator to the last senator in the given order. This procedure will last until the end of voting. All the senators who have lost their rights will be skipped during the procedure.
</p>

<p>
Suppose every senator is smart enough and will play the best strategy for his own party, you need to predict which party will finally announce the victory and make the change in the Dota2 game. The output should be <code>Radiant</code> or <code>Dire</code>.
</p>

<p><b>Example 1:</b><br/>
</p><pre><b>Input:</b> "RD"
<b>Output:</b> "Radiant"
<b>Explanation:</b> The first senator comes from Radiant and he can just ban the next senator's right in the round 1. <br/>And the second senator can't exercise any rights any more since his right has been banned. <br/>And in the round 2, the first senator can just announce the victory since he is the only guy in the senate who can vote.
</pre>
<p/>


<p><b>Example 2:</b><br/>
</p><pre><b>Input:</b> "RDD"
<b>Output:</b> "Dire"
<b>Explanation:</b> 
The first senator comes from Radiant and he can just ban the next senator's right in the round 1. <br/>And the second senator can't exercise any rights anymore since his right has been banned. <br/>And the third senator comes from Dire and he can ban the first senator's right in the round 1. <br/>And in the round 2, the third senator can just announce the victory since he is the only guy in the senate who can vote.
</pre>
<p/>

<p><b>Note:</b><br/>
</p><ol>
<li>The length of the given string will in the range [1, 10,000].</li>
</ol>
<p/></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
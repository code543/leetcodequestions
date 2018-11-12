##[826.Most Profit Assigning Work](https://leetcode.com/problems/most-profit-assigning-work/description/ "826.Most Profit Assigning Work")
######Difficulty:Medium
####Similiar Topics:
  [Two Pointers](https://leetcode.com//tag/two-pointers)
####Similiar Problems:

<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>We have jobs: <code>difficulty[i]</code>&#160;is the difficulty of the&#160;<code>i</code>th job, and&#160;<code>profit[i]</code>&#160;is the profit of the&#160;<code>i</code>th job.&#160;</p>

<p>Now we have some workers.&#160;<code>worker[i]</code>&#160;is the ability of the&#160;<code>i</code>th worker, which means that this worker can only complete a job with difficulty at most&#160;<code>worker[i]</code>.&#160;</p>

<p>Every worker can be assigned at most one job, but one job&#160;can be completed multiple times.</p>

<p>For example, if 3 people attempt the same job that pays $1, then the total profit will be $3.&#160; If a worker cannot complete any job, his profit is $0.</p>

<p>What is the most profit we can make?</p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
<strong>Output: </strong>100 
<strong>Explanation: W</strong>orkers are assigned jobs of difficulty [4,4,6,6] and they get profit of [20,20,30,30] seperately.</pre>

<p><strong>Notes:</strong></p>

<ul>
	<li><code>1 &lt;= difficulty.length = profit.length &lt;= 10000</code></li>
	<li><code>1 &lt;= worker.length &lt;= 10000</code></li>
	<li><code>difficulty[i], profit[i], worker[i]</code>&#160; are in range&#160;<code>[1, 10^5]</code></li>
</ul></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
##[787.Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/description/ "787.Cheapest Flights Within K Stops")
######Difficulty:Medium
####Similiar Topics:
  [Heap](https://leetcode.com//tag/heap)  [Dynamic Programming](https://leetcode.com//tag/dynamic-programming)  [Breadth-first Search](https://leetcode.com//tag/breadth-first-search)
####Similiar Problems:
  [Maximum Vacation Days](https://leetcode.com//problems/maximum-vacation-days)
<div class="question-description__3U1T" style="padding-top: 10px;"><div><p>There are <code>n</code> cities connected by&#160;<code>m</code> flights. Each fight starts from city&#160;<code>u </code>and arrives at&#160;<code>v</code> with a price <code>w</code>.</p>

<p>Now given all the cities and fights, together with starting city <code>src</code> and the destination&#160;<code>dst</code>, your task is to find the cheapest price from <code>src</code> to <code>dst</code> with up to <code>k</code> stops. If there is no such route, output <code>-1</code>.</p>

<pre><strong>Example 1:</strong>
<strong>Input:</strong> 
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 1
<strong>Output:</strong> 200
<strong>Explanation:</strong> 
The graph looks like this:
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/02/16/995.png" style="height:180px; width:246px"/>

The cheapest price from city <code>0</code> to city <code>2</code> with at most 1 stop costs 200, as marked red in the picture.</pre>

<pre><strong>Example 2:</strong>
<strong>Input:</strong> 
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 0
<strong>Output:</strong> 500
<strong>Explanation:</strong> 
The graph looks like this:
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/02/16/995.png" style="height:180px; width:246px"/>

The cheapest price from city <code>0</code> to city <code>2</code> with at most 0 stop costs 500, as marked blue in the picture.</pre>

<p><strong>Note:</strong></p>

<ul>
	<li>The number of&#160;nodes&#160;<code>n</code> will be&#160;in range <code>[1, 100]</code>, with nodes labeled from <code>0</code> to <code>n</code><code> - 1</code>.</li>
	<li>The&#160;size of <code>flights</code> will be&#160;in range <code>[0, n * (n - 1) / 2]</code>.</li>
	<li>The format of each flight will be <code>(src, </code><code>dst</code><code>, price)</code>.</li>
	<li>The price of each flight will be in the range <code>[1, 10000]</code>.</li>
	<li><code>k</code> is in the range of <code>[0, n - 1]</code>.</li>
	<li>There&#160;will&#160;not&#160;be&#160;any&#160;duplicated&#160;flights or&#160;self&#160;cycles.</li>
</ul></div></div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div><div> </div>
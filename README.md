# RegSnap

Region-based Sub Snapshot and recovery based on Apache Flink.

This repo is cloned from https://github.com/apache/flink/tree/release-1.14 and modified to realize our research objective.

# Features
* Defines a custom snapshot group/region of adjacent pipelined operators 
* Triggers savepoint for the defined regions instead of global snapshots
* Recovers stateful operators of the failed region only instead of global snapshot recovery

# References
Please refer to this publication for the details:

Takdir, H. Kitagawa and T. Amagasa, "Region-based Sub-Snapshot (RegSnap): Enhanced Fault Tolerance in Distributed Stream Processing with Partial Snapshot," 2022 IEEE International Conference on Big Data (Big Data), Osaka, Japan, 2022, pp. 3374-3382, doi: 10.1109/BigData55660.2022.10020607.

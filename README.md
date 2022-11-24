# RegSnap

Region-based Sub Snapshot and recovery based on Apache Flink.

This repo is cloned from https://github.com/apache/flink/tree/release-1.14 and modified to realise our research objective.

# Features
* Defines a custom snapshot goup/region of adjecent pipelind operators 
* Triggers savepoint for the defined regions instead of global snapshots
* Recovers stateful operators of failed region only instead of global snapshot recovery

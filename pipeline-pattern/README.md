## 管道模式

> 在管道模式中，管道扮演着流水线的角色，将数据传递到一个加工处理序列中，数据在每个步骤中被加工处理后，传递到下一个步骤进行加工处理，直到全部步骤处理完毕。

> PS：纯的责任链模式在链上只会有一个处理器用于处理数据，而管道模式上多个处理器都会处理数据。

### 使用场景

> 任务代码较为复杂，需要拆分为多个子步骤时，尤其是后续可能在任意位置添加新的子步骤、删除旧的子步骤、交换子步骤顺序，可以考虑使用管道模式。
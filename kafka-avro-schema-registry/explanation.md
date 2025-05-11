# Kafka-Avro-Schema-Registry
## Zookeeper
>manages Kafka broker coordination.
## Kafka
>publish/subscribe engine
- Kafka is the core pub-sub engine. It stores messages and ensures high-throughput delivery.
## schema-registry
> used to store and validate Avro schemas centrally
- They are responsible for storing and versioning Avro/Protobuf schemas, enforcing schema compatibility (backward, forward, full) and deserializing messages automatically using schema IDs.


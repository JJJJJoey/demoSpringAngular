package com.example.demospringangular.transfer;

import lombok.Value;

@Value
public class KeyValue<K, V> {
    K key;
    V value;
}

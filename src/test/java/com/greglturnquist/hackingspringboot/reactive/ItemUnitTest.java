package com.greglturnquist.hackingspringboot.reactive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ItemUnitTest {
    @Test
    void itemShouldBeCreated() {
        Item sampleItem = new Item("item1", 19.99);

        assertThat(sampleItem.getName()).isEqualTo("item1");
    }
}
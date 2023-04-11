package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = new int[] {7, 1, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5Numbers() {
        int[] data = new int[] {5, 2, 19, 234, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 5, 11, 19, 234};
        assertThat(result).containsExactly(expected);
    }
}
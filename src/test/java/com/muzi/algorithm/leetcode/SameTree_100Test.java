package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SameTree_100Test {
    @Test
    void test1() {
        SameTree_100.TreeNode p = new SameTree_100.TreeNode(
                1,
                new SameTree_100.TreeNode(2,
                        null,
                        null
                ),
                new SameTree_100.TreeNode(3,
                        null,
                        null
                )
        );
        SameTree_100.TreeNode q = new SameTree_100.TreeNode(
                1,
                new SameTree_100.TreeNode(2,
                        null,
                        null
                ),
                new SameTree_100.TreeNode(3,
                        null,
                        null
                )
        );

        assertThat(executeSolution(p, q)).isTrue();
    }

    @Test
    void test2() {
        SameTree_100.TreeNode p = new SameTree_100.TreeNode(
                1,
                new SameTree_100.TreeNode(2,
                        null,
                        null
                ),
                null
        );
        SameTree_100.TreeNode q = new SameTree_100.TreeNode(
                1,
                null,
                new SameTree_100.TreeNode(2,
                        null,
                        null
                )
        );

        assertThat(executeSolution(p, q)).isFalse();
    }

    @Test
    void test3() {
        SameTree_100.TreeNode p = new SameTree_100.TreeNode(
                1,
                new SameTree_100.TreeNode(2,
                        null,
                        null
                ),
                new SameTree_100.TreeNode(1,
                        null,
                        null
                )
        );
        SameTree_100.TreeNode q = new SameTree_100.TreeNode(
                1,
                new SameTree_100.TreeNode(1,
                        null,
                        null
                ),
                new SameTree_100.TreeNode(2,
                        null,
                        null
                )
        );

        assertThat(executeSolution(p, q)).isFalse();
    }

    @Test
    void test4() {
        SameTree_100.TreeNode p = new SameTree_100.TreeNode(
                0,
                new SameTree_100.TreeNode(-5,
                        null,
                        null
                ),
                null
        );
        SameTree_100.TreeNode q = new SameTree_100.TreeNode(
                0,
                new SameTree_100.TreeNode(-8,
                        null,
                        null
                ),
                null
        );

        assertThat(executeSolution(p, q)).isFalse();
    }


    private Boolean executeSolution(SameTree_100.TreeNode p, SameTree_100.TreeNode q) {
        return new SameTree_100().isSameTree(p, q);
    }
}
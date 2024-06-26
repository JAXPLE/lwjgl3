/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * @generated SignedSource<<debde6a37b3a2ad5892a15611a2fa8ec>>
 * generated by gentest/gentest-driver.ts from gentest/fixtures/YGSizeOverflowTest.html
 */

package org.lwjgl.util.yoga;

import org.testng.annotations.*;

import static org.lwjgl.util.yoga.YogaNode.*;
import static org.testng.AssertJUnit.assertEquals;

public class YGSizeOverflowTest {
    @Test
    public void test_nested_overflowing_child() {
        YogaConfig config = YogaConfigFactory.create();

        YogaNode root = createNode(config);
        root.setPositionType(YogaPositionType.ABSOLUTE);
        root.setWidth(100f);
        root.setHeight(100f);

        YogaNode root_child0 = createNode(config);
        root.addChildAt(root_child0, 0);

        YogaNode root_child0_child0 = createNode(config);
        root_child0_child0.setWidth(200f);
        root_child0_child0.setHeight(200f);
        root_child0.addChildAt(root_child0_child0, 0);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0_child0.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(-100f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0_child0.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_nested_overflowing_child_in_constraint_parent() {
        YogaConfig config = YogaConfigFactory.create();

        YogaNode root = createNode(config);
        root.setPositionType(YogaPositionType.ABSOLUTE);
        root.setWidth(100f);
        root.setHeight(100f);

        YogaNode root_child0 = createNode(config);
        root_child0.setWidth(100f);
        root_child0.setHeight(100f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child0_child0 = createNode(config);
        root_child0_child0.setWidth(200f);
        root_child0_child0.setHeight(200f);
        root_child0.addChildAt(root_child0_child0, 0);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0_child0.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(-100f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(200f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0_child0.getLayoutHeight(), 0.0f);
    }

    @Test
    public void test_parent_wrap_child_size_overflowing_parent() {
        YogaConfig config = YogaConfigFactory.create();

        YogaNode root = createNode(config);
        root.setPositionType(YogaPositionType.ABSOLUTE);
        root.setWidth(100f);
        root.setHeight(100f);

        YogaNode root_child0 = createNode(config);
        root_child0.setWidth(100f);
        root.addChildAt(root_child0, 0);

        YogaNode root_child0_child0 = createNode(config);
        root_child0_child0.setWidth(100f);
        root_child0_child0.setHeight(200f);
        root_child0.addChildAt(root_child0_child0, 0);
        root.setDirection(YogaDirection.LTR);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0_child0.getLayoutHeight(), 0.0f);

        root.setDirection(YogaDirection.RTL);
        root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

        assertEquals(0f, root.getLayoutX(), 0.0f);
        assertEquals(0f, root.getLayoutY(), 0.0f);
        assertEquals(100f, root.getLayoutWidth(), 0.0f);
        assertEquals(100f, root.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

        assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
        assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
        assertEquals(100f, root_child0_child0.getLayoutWidth(), 0.0f);
        assertEquals(200f, root_child0_child0.getLayoutHeight(), 0.0f);
    }
}

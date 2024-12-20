/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_ShowUI_t {
 *     EShowUIType eType;
 * }</code></pre>
 */
@NativeType("struct VREvent_ShowUI_t")
public class VREventShowUI extends Struct<VREventShowUI> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ETYPE;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ETYPE = layout.offsetof(0);
    }

    protected VREventShowUI(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VREventShowUI create(long address, @Nullable ByteBuffer container) {
        return new VREventShowUI(address, container);
    }

    /**
     * Creates a {@code VREventShowUI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventShowUI(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code eType} field. */
    @NativeType("EShowUIType")
    public int eType() { return neType(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventShowUI} instance for the specified memory address. */
    public static VREventShowUI create(long address) {
        return new VREventShowUI(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VREventShowUI createSafe(long address) {
        return address == NULL ? null : new VREventShowUI(address, null);
    }

    /**
     * Create a {@link VREventShowUI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventShowUI.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VREventShowUI.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #eType}. */
    public static int neType(long struct) { return memGetInt(struct + VREventShowUI.ETYPE); }

    // -----------------------------------

    /** An array of {@link VREventShowUI} structs. */
    public static class Buffer extends StructBuffer<VREventShowUI, Buffer> {

        private static final VREventShowUI ELEMENT_FACTORY = VREventShowUI.create(-1L);

        /**
         * Creates a new {@code VREventShowUI.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventShowUI#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VREventShowUI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code eType} field. */
        @NativeType("EShowUIType")
        public int eType() { return VREventShowUI.neType(address()); }

    }

}
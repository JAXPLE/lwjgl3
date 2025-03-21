/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct NSVGpaint {
 *     signed char type;
 *     union {
 *         unsigned int color;
 *         {@link NSVGGradient NSVGgradient} * gradient;
 *     };
 * }}</pre>
 */
@NativeType("struct NSVGpaint")
public class NSVGPaint extends Struct<NSVGPaint> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        COLOR,
        GRADIENT;

    static {
        Layout layout = __struct(
            __member(1),
            __union(
                __member(4),
                __member(POINTER_SIZE)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        COLOR = layout.offsetof(2);
        GRADIENT = layout.offsetof(3);
    }

    protected NSVGPaint(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NSVGPaint create(long address, @Nullable ByteBuffer container) {
        return new NSVGPaint(address, container);
    }

    /**
     * Creates a {@code NSVGPaint} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NSVGPaint(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("signed char")
    public byte type() { return ntype(address()); }
    /** @return the value of the {@code color} field. */
    @NativeType("unsigned int")
    public int color() { return ncolor(address()); }
    /** @return a {@link NSVGGradient} view of the struct pointed to by the {@code gradient} field. */
    @NativeType("NSVGgradient *")
    public NSVGGradient gradient() { return ngradient(address()); }

    // -----------------------------------

    /** Returns a new {@code NSVGPaint} instance for the specified memory address. */
    public static NSVGPaint create(long address) {
        return new NSVGPaint(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NSVGPaint createSafe(long address) {
        return address == NULL ? null : new NSVGPaint(address, null);
    }

    /**
     * Create a {@link NSVGPaint.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NSVGPaint.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NSVGPaint.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static byte ntype(long struct) { return memGetByte(struct + NSVGPaint.TYPE); }
    /** Unsafe version of {@link #color}. */
    public static int ncolor(long struct) { return memGetInt(struct + NSVGPaint.COLOR); }
    /** Unsafe version of {@link #gradient}. */
    public static NSVGGradient ngradient(long struct) { return NSVGGradient.create(memGetAddress(struct + NSVGPaint.GRADIENT)); }

    // -----------------------------------

    /** An array of {@link NSVGPaint} structs. */
    public static class Buffer extends StructBuffer<NSVGPaint, Buffer> {

        private static final NSVGPaint ELEMENT_FACTORY = NSVGPaint.create(-1L);

        /**
         * Creates a new {@code NSVGPaint.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NSVGPaint#SIZEOF}, and its mark will be undefined.</p>
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
        protected NSVGPaint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("signed char")
        public byte type() { return NSVGPaint.ntype(address()); }
        /** @return the value of the {@code color} field. */
        @NativeType("unsigned int")
        public int color() { return NSVGPaint.ncolor(address()); }
        /** @return a {@link NSVGGradient} view of the struct pointed to by the {@code gradient} field. */
        @NativeType("NSVGgradient *")
        public NSVGGradient gradient() { return NSVGPaint.ngradient(address()); }

    }

}
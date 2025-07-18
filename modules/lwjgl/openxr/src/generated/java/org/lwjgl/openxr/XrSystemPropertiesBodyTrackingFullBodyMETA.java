/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSystemPropertiesBodyTrackingFullBodyMETA {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsFullBodyTracking;
 * }}</pre>
 */
public class XrSystemPropertiesBodyTrackingFullBodyMETA extends Struct<XrSystemPropertiesBodyTrackingFullBodyMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSFULLBODYTRACKING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSFULLBODYTRACKING = layout.offsetof(2);
    }

    protected XrSystemPropertiesBodyTrackingFullBodyMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemPropertiesBodyTrackingFullBodyMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemPropertiesBodyTrackingFullBodyMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemPropertiesBodyTrackingFullBodyMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemPropertiesBodyTrackingFullBodyMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code supportsFullBodyTracking} field. */
    @NativeType("XrBool32")
    public boolean supportsFullBodyTracking() { return nsupportsFullBodyTracking(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemPropertiesBodyTrackingFullBodyMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METABodyTrackingFullBody#XR_TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FULL_BODY_META TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FULL_BODY_META} value to the {@code type} field. */
    public XrSystemPropertiesBodyTrackingFullBodyMETA type$Default() { return type(METABodyTrackingFullBody.XR_TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FULL_BODY_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemPropertiesBodyTrackingFullBodyMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemPropertiesBodyTrackingFullBodyMETA set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemPropertiesBodyTrackingFullBodyMETA set(XrSystemPropertiesBodyTrackingFullBodyMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemPropertiesBodyTrackingFullBodyMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemPropertiesBodyTrackingFullBodyMETA malloc() {
        return new XrSystemPropertiesBodyTrackingFullBodyMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPropertiesBodyTrackingFullBodyMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemPropertiesBodyTrackingFullBodyMETA calloc() {
        return new XrSystemPropertiesBodyTrackingFullBodyMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPropertiesBodyTrackingFullBodyMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemPropertiesBodyTrackingFullBodyMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemPropertiesBodyTrackingFullBodyMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemPropertiesBodyTrackingFullBodyMETA} instance for the specified memory address. */
    public static XrSystemPropertiesBodyTrackingFullBodyMETA create(long address) {
        return new XrSystemPropertiesBodyTrackingFullBodyMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemPropertiesBodyTrackingFullBodyMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemPropertiesBodyTrackingFullBodyMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemPropertiesBodyTrackingFullBodyMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemPropertiesBodyTrackingFullBodyMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPropertiesBodyTrackingFullBodyMETA malloc(MemoryStack stack) {
        return new XrSystemPropertiesBodyTrackingFullBodyMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemPropertiesBodyTrackingFullBodyMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPropertiesBodyTrackingFullBodyMETA calloc(MemoryStack stack) {
        return new XrSystemPropertiesBodyTrackingFullBodyMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemPropertiesBodyTrackingFullBodyMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemPropertiesBodyTrackingFullBodyMETA.NEXT); }
    /** Unsafe version of {@link #supportsFullBodyTracking}. */
    public static int nsupportsFullBodyTracking(long struct) { return memGetInt(struct + XrSystemPropertiesBodyTrackingFullBodyMETA.SUPPORTSFULLBODYTRACKING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemPropertiesBodyTrackingFullBodyMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemPropertiesBodyTrackingFullBodyMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemPropertiesBodyTrackingFullBodyMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemPropertiesBodyTrackingFullBodyMETA, Buffer> implements NativeResource {

        private static final XrSystemPropertiesBodyTrackingFullBodyMETA ELEMENT_FACTORY = XrSystemPropertiesBodyTrackingFullBodyMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemPropertiesBodyTrackingFullBodyMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemPropertiesBodyTrackingFullBodyMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemPropertiesBodyTrackingFullBodyMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemPropertiesBodyTrackingFullBodyMETA.nnext(address()); }
        /** @return the value of the {@code supportsFullBodyTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsFullBodyTracking() { return XrSystemPropertiesBodyTrackingFullBodyMETA.nsupportsFullBodyTracking(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemPropertiesBodyTrackingFullBodyMETA.ntype(address(), value); return this; }
        /** Sets the {@link METABodyTrackingFullBody#XR_TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FULL_BODY_META TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FULL_BODY_META} value to the {@code type} field. */
        public XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer type$Default() { return type(METABodyTrackingFullBody.XR_TYPE_SYSTEM_PROPERTIES_BODY_TRACKING_FULL_BODY_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemPropertiesBodyTrackingFullBodyMETA.Buffer next(@NativeType("void *") long value) { XrSystemPropertiesBodyTrackingFullBodyMETA.nnext(address(), value); return this; }

    }

}
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
 * struct XrSimultaneousHandsAndControllersTrackingPauseInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrSimultaneousHandsAndControllersTrackingPauseInfoMETA extends Struct<XrSimultaneousHandsAndControllersTrackingPauseInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrSimultaneousHandsAndControllersTrackingPauseInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSimultaneousHandsAndControllersTrackingPauseInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSimultaneousHandsAndControllersTrackingPauseInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrSimultaneousHandsAndControllersTrackingPauseInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSimultaneousHandsAndControllersTrackingPauseInfoMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSimultaneousHandsAndControllersTrackingPauseInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASimultaneousHandsAndControllers#XR_TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_PAUSE_INFO_META TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_PAUSE_INFO_META} value to the {@code type} field. */
    public XrSimultaneousHandsAndControllersTrackingPauseInfoMETA type$Default() { return type(METASimultaneousHandsAndControllers.XR_TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_PAUSE_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSimultaneousHandsAndControllersTrackingPauseInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSimultaneousHandsAndControllersTrackingPauseInfoMETA set(
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
    public XrSimultaneousHandsAndControllersTrackingPauseInfoMETA set(XrSimultaneousHandsAndControllersTrackingPauseInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSimultaneousHandsAndControllersTrackingPauseInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSimultaneousHandsAndControllersTrackingPauseInfoMETA malloc() {
        return new XrSimultaneousHandsAndControllersTrackingPauseInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSimultaneousHandsAndControllersTrackingPauseInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSimultaneousHandsAndControllersTrackingPauseInfoMETA calloc() {
        return new XrSimultaneousHandsAndControllersTrackingPauseInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSimultaneousHandsAndControllersTrackingPauseInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrSimultaneousHandsAndControllersTrackingPauseInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSimultaneousHandsAndControllersTrackingPauseInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSimultaneousHandsAndControllersTrackingPauseInfoMETA} instance for the specified memory address. */
    public static XrSimultaneousHandsAndControllersTrackingPauseInfoMETA create(long address) {
        return new XrSimultaneousHandsAndControllersTrackingPauseInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSimultaneousHandsAndControllersTrackingPauseInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrSimultaneousHandsAndControllersTrackingPauseInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSimultaneousHandsAndControllersTrackingPauseInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSimultaneousHandsAndControllersTrackingPauseInfoMETA malloc(MemoryStack stack) {
        return new XrSimultaneousHandsAndControllersTrackingPauseInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSimultaneousHandsAndControllersTrackingPauseInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSimultaneousHandsAndControllersTrackingPauseInfoMETA calloc(MemoryStack stack) {
        return new XrSimultaneousHandsAndControllersTrackingPauseInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSimultaneousHandsAndControllersTrackingPauseInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrSimultaneousHandsAndControllersTrackingPauseInfoMETA, Buffer> implements NativeResource {

        private static final XrSimultaneousHandsAndControllersTrackingPauseInfoMETA ELEMENT_FACTORY = XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSimultaneousHandsAndControllersTrackingPauseInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSimultaneousHandsAndControllersTrackingPauseInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASimultaneousHandsAndControllers#XR_TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_PAUSE_INFO_META TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_PAUSE_INFO_META} value to the {@code type} field. */
        public XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer type$Default() { return type(METASimultaneousHandsAndControllers.XR_TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_PAUSE_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.Buffer next(@NativeType("void const *") long value) { XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.nnext(address(), value); return this; }

    }

}
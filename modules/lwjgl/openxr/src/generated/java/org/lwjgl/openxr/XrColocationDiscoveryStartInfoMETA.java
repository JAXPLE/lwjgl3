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
 * start discovery information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAColocationDiscovery XR_META_colocation_discovery} extension <b>must</b> be enabled prior to using {@link XrColocationDiscoveryStartInfoMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAColocationDiscovery#XR_TYPE_COLOCATION_DISCOVERY_START_INFO_META TYPE_COLOCATION_DISCOVERY_START_INFO_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link METAColocationDiscovery#xrStartColocationDiscoveryMETA StartColocationDiscoveryMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrColocationDiscoveryStartInfoMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 * }</code></pre>
 */
public class XrColocationDiscoveryStartInfoMETA extends Struct<XrColocationDiscoveryStartInfoMETA> implements NativeResource {

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

    protected XrColocationDiscoveryStartInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrColocationDiscoveryStartInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrColocationDiscoveryStartInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrColocationDiscoveryStartInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrColocationDiscoveryStartInfoMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrColocationDiscoveryStartInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAColocationDiscovery#XR_TYPE_COLOCATION_DISCOVERY_START_INFO_META TYPE_COLOCATION_DISCOVERY_START_INFO_META} value to the {@link #type} field. */
    public XrColocationDiscoveryStartInfoMETA type$Default() { return type(METAColocationDiscovery.XR_TYPE_COLOCATION_DISCOVERY_START_INFO_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrColocationDiscoveryStartInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrColocationDiscoveryStartInfoMETA set(
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
    public XrColocationDiscoveryStartInfoMETA set(XrColocationDiscoveryStartInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrColocationDiscoveryStartInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrColocationDiscoveryStartInfoMETA malloc() {
        return new XrColocationDiscoveryStartInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrColocationDiscoveryStartInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrColocationDiscoveryStartInfoMETA calloc() {
        return new XrColocationDiscoveryStartInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrColocationDiscoveryStartInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrColocationDiscoveryStartInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrColocationDiscoveryStartInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrColocationDiscoveryStartInfoMETA} instance for the specified memory address. */
    public static XrColocationDiscoveryStartInfoMETA create(long address) {
        return new XrColocationDiscoveryStartInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrColocationDiscoveryStartInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrColocationDiscoveryStartInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrColocationDiscoveryStartInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColocationDiscoveryStartInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrColocationDiscoveryStartInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColocationDiscoveryStartInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColocationDiscoveryStartInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrColocationDiscoveryStartInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrColocationDiscoveryStartInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrColocationDiscoveryStartInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrColocationDiscoveryStartInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrColocationDiscoveryStartInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColocationDiscoveryStartInfoMETA malloc(MemoryStack stack) {
        return new XrColocationDiscoveryStartInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrColocationDiscoveryStartInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColocationDiscoveryStartInfoMETA calloc(MemoryStack stack) {
        return new XrColocationDiscoveryStartInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrColocationDiscoveryStartInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColocationDiscoveryStartInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColocationDiscoveryStartInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColocationDiscoveryStartInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrColocationDiscoveryStartInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrColocationDiscoveryStartInfoMETA.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrColocationDiscoveryStartInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrColocationDiscoveryStartInfoMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrColocationDiscoveryStartInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrColocationDiscoveryStartInfoMETA, Buffer> implements NativeResource {

        private static final XrColocationDiscoveryStartInfoMETA ELEMENT_FACTORY = XrColocationDiscoveryStartInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrColocationDiscoveryStartInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrColocationDiscoveryStartInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrColocationDiscoveryStartInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrColocationDiscoveryStartInfoMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrColocationDiscoveryStartInfoMETA.ntype(address()); }
        /** @return the value of the {@link XrColocationDiscoveryStartInfoMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrColocationDiscoveryStartInfoMETA.nnext(address()); }

        /** Sets the specified value to the {@link XrColocationDiscoveryStartInfoMETA#type} field. */
        public XrColocationDiscoveryStartInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrColocationDiscoveryStartInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAColocationDiscovery#XR_TYPE_COLOCATION_DISCOVERY_START_INFO_META TYPE_COLOCATION_DISCOVERY_START_INFO_META} value to the {@link XrColocationDiscoveryStartInfoMETA#type} field. */
        public XrColocationDiscoveryStartInfoMETA.Buffer type$Default() { return type(METAColocationDiscovery.XR_TYPE_COLOCATION_DISCOVERY_START_INFO_META); }
        /** Sets the specified value to the {@link XrColocationDiscoveryStartInfoMETA#next} field. */
        public XrColocationDiscoveryStartInfoMETA.Buffer next(@NativeType("void const *") long value) { XrColocationDiscoveryStartInfoMETA.nnext(address(), value); return this; }

    }

}
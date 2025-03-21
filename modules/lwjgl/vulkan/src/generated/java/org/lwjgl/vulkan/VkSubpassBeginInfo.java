/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkSubpassBeginInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSubpassContents contents;
 * }}</pre>
 */
public class VkSubpassBeginInfo extends Struct<VkSubpassBeginInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CONTENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CONTENTS = layout.offsetof(2);
    }

    protected VkSubpassBeginInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubpassBeginInfo create(long address, @Nullable ByteBuffer container) {
        return new VkSubpassBeginInfo(address, container);
    }

    /**
     * Creates a {@code VkSubpassBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassBeginInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code contents} field. */
    @NativeType("VkSubpassContents")
    public int contents() { return ncontents(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubpassBeginInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO STRUCTURE_TYPE_SUBPASS_BEGIN_INFO} value to the {@code sType} field. */
    public VkSubpassBeginInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubpassBeginInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code contents} field. */
    public VkSubpassBeginInfo contents(@NativeType("VkSubpassContents") int value) { ncontents(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassBeginInfo set(
        int sType,
        long pNext,
        int contents
    ) {
        sType(sType);
        pNext(pNext);
        contents(contents);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassBeginInfo set(VkSubpassBeginInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassBeginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassBeginInfo malloc() {
        return new VkSubpassBeginInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassBeginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassBeginInfo calloc() {
        return new VkSubpassBeginInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassBeginInfo} instance allocated with {@link BufferUtils}. */
    public static VkSubpassBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassBeginInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassBeginInfo} instance for the specified memory address. */
    public static VkSubpassBeginInfo create(long address) {
        return new VkSubpassBeginInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubpassBeginInfo createSafe(long address) {
        return address == NULL ? null : new VkSubpassBeginInfo(address, null);
    }

    /**
     * Returns a new {@link VkSubpassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubpassBeginInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubpassBeginInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassBeginInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassBeginInfo malloc(MemoryStack stack) {
        return new VkSubpassBeginInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubpassBeginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassBeginInfo calloc(MemoryStack stack) {
        return new VkSubpassBeginInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubpassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubpassBeginInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassBeginInfo.PNEXT); }
    /** Unsafe version of {@link #contents}. */
    public static int ncontents(long struct) { return memGetInt(struct + VkSubpassBeginInfo.CONTENTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubpassBeginInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassBeginInfo.PNEXT, value); }
    /** Unsafe version of {@link #contents(int) contents}. */
    public static void ncontents(long struct, int value) { memPutInt(struct + VkSubpassBeginInfo.CONTENTS, value); }

    // -----------------------------------

    /** An array of {@link VkSubpassBeginInfo} structs. */
    public static class Buffer extends StructBuffer<VkSubpassBeginInfo, Buffer> implements NativeResource {

        private static final VkSubpassBeginInfo ELEMENT_FACTORY = VkSubpassBeginInfo.create(-1L);

        /**
         * Creates a new {@code VkSubpassBeginInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassBeginInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubpassBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassBeginInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassBeginInfo.npNext(address()); }
        /** @return the value of the {@code contents} field. */
        @NativeType("VkSubpassContents")
        public int contents() { return VkSubpassBeginInfo.ncontents(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubpassBeginInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassBeginInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO STRUCTURE_TYPE_SUBPASS_BEGIN_INFO} value to the {@code sType} field. */
        public VkSubpassBeginInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubpassBeginInfo.Buffer pNext(@NativeType("void const *") long value) { VkSubpassBeginInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code contents} field. */
        public VkSubpassBeginInfo.Buffer contents(@NativeType("VkSubpassContents") int value) { VkSubpassBeginInfo.ncontents(address(), value); return this; }

    }

}
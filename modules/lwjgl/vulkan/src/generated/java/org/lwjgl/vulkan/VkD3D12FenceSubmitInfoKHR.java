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
 * struct VkD3D12FenceSubmitInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t waitSemaphoreValuesCount;
 *     uint64_t const * pWaitSemaphoreValues;
 *     uint32_t signalSemaphoreValuesCount;
 *     uint64_t const * pSignalSemaphoreValues;
 * }}</pre>
 */
public class VkD3D12FenceSubmitInfoKHR extends Struct<VkD3D12FenceSubmitInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WAITSEMAPHOREVALUESCOUNT,
        PWAITSEMAPHOREVALUES,
        SIGNALSEMAPHOREVALUESCOUNT,
        PSIGNALSEMAPHOREVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHOREVALUESCOUNT = layout.offsetof(2);
        PWAITSEMAPHOREVALUES = layout.offsetof(3);
        SIGNALSEMAPHOREVALUESCOUNT = layout.offsetof(4);
        PSIGNALSEMAPHOREVALUES = layout.offsetof(5);
    }

    protected VkD3D12FenceSubmitInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkD3D12FenceSubmitInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkD3D12FenceSubmitInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkD3D12FenceSubmitInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkD3D12FenceSubmitInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code waitSemaphoreValuesCount} field. */
    @NativeType("uint32_t")
    public int waitSemaphoreValuesCount() { return nwaitSemaphoreValuesCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphoreValues} field. */
    @NativeType("uint64_t const *")
    public @Nullable LongBuffer pWaitSemaphoreValues() { return npWaitSemaphoreValues(address()); }
    /** @return the value of the {@code signalSemaphoreValuesCount} field. */
    @NativeType("uint32_t")
    public int signalSemaphoreValuesCount() { return nsignalSemaphoreValuesCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphoreValues} field. */
    @NativeType("uint64_t const *")
    public @Nullable LongBuffer pSignalSemaphoreValues() { return npSignalSemaphoreValues(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkD3D12FenceSubmitInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExternalSemaphoreWin32#VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR} value to the {@code sType} field. */
    public VkD3D12FenceSubmitInfoKHR sType$Default() { return sType(KHRExternalSemaphoreWin32.VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkD3D12FenceSubmitInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code waitSemaphoreValuesCount} field. */
    public VkD3D12FenceSubmitInfoKHR waitSemaphoreValuesCount(@NativeType("uint32_t") int value) { nwaitSemaphoreValuesCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphoreValues} field. */
    public VkD3D12FenceSubmitInfoKHR pWaitSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npWaitSemaphoreValues(address(), value); return this; }
    /** Sets the specified value to the {@code signalSemaphoreValuesCount} field. */
    public VkD3D12FenceSubmitInfoKHR signalSemaphoreValuesCount(@NativeType("uint32_t") int value) { nsignalSemaphoreValuesCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphoreValues} field. */
    public VkD3D12FenceSubmitInfoKHR pSignalSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npSignalSemaphoreValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkD3D12FenceSubmitInfoKHR set(
        int sType,
        long pNext,
        int waitSemaphoreValuesCount,
        @Nullable LongBuffer pWaitSemaphoreValues,
        int signalSemaphoreValuesCount,
        @Nullable LongBuffer pSignalSemaphoreValues
    ) {
        sType(sType);
        pNext(pNext);
        waitSemaphoreValuesCount(waitSemaphoreValuesCount);
        pWaitSemaphoreValues(pWaitSemaphoreValues);
        signalSemaphoreValuesCount(signalSemaphoreValuesCount);
        pSignalSemaphoreValues(pSignalSemaphoreValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkD3D12FenceSubmitInfoKHR set(VkD3D12FenceSubmitInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkD3D12FenceSubmitInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkD3D12FenceSubmitInfoKHR malloc() {
        return new VkD3D12FenceSubmitInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkD3D12FenceSubmitInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkD3D12FenceSubmitInfoKHR calloc() {
        return new VkD3D12FenceSubmitInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkD3D12FenceSubmitInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkD3D12FenceSubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkD3D12FenceSubmitInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkD3D12FenceSubmitInfoKHR} instance for the specified memory address. */
    public static VkD3D12FenceSubmitInfoKHR create(long address) {
        return new VkD3D12FenceSubmitInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkD3D12FenceSubmitInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkD3D12FenceSubmitInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkD3D12FenceSubmitInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkD3D12FenceSubmitInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkD3D12FenceSubmitInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkD3D12FenceSubmitInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkD3D12FenceSubmitInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkD3D12FenceSubmitInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkD3D12FenceSubmitInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkD3D12FenceSubmitInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkD3D12FenceSubmitInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkD3D12FenceSubmitInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkD3D12FenceSubmitInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkD3D12FenceSubmitInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkD3D12FenceSubmitInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkD3D12FenceSubmitInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkD3D12FenceSubmitInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkD3D12FenceSubmitInfoKHR malloc(MemoryStack stack) {
        return new VkD3D12FenceSubmitInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkD3D12FenceSubmitInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkD3D12FenceSubmitInfoKHR calloc(MemoryStack stack) {
        return new VkD3D12FenceSubmitInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkD3D12FenceSubmitInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkD3D12FenceSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkD3D12FenceSubmitInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkD3D12FenceSubmitInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkD3D12FenceSubmitInfoKHR.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreValuesCount}. */
    public static int nwaitSemaphoreValuesCount(long struct) { return memGetInt(struct + VkD3D12FenceSubmitInfoKHR.WAITSEMAPHOREVALUESCOUNT); }
    /** Unsafe version of {@link #pWaitSemaphoreValues() pWaitSemaphoreValues}. */
    public static @Nullable LongBuffer npWaitSemaphoreValues(long struct) { return memLongBufferSafe(memGetAddress(struct + VkD3D12FenceSubmitInfoKHR.PWAITSEMAPHOREVALUES), nwaitSemaphoreValuesCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreValuesCount}. */
    public static int nsignalSemaphoreValuesCount(long struct) { return memGetInt(struct + VkD3D12FenceSubmitInfoKHR.SIGNALSEMAPHOREVALUESCOUNT); }
    /** Unsafe version of {@link #pSignalSemaphoreValues() pSignalSemaphoreValues}. */
    public static @Nullable LongBuffer npSignalSemaphoreValues(long struct) { return memLongBufferSafe(memGetAddress(struct + VkD3D12FenceSubmitInfoKHR.PSIGNALSEMAPHOREVALUES), nsignalSemaphoreValuesCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkD3D12FenceSubmitInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkD3D12FenceSubmitInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreValuesCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreValuesCount(long struct, int value) { memPutInt(struct + VkD3D12FenceSubmitInfoKHR.WAITSEMAPHOREVALUESCOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphoreValues(LongBuffer) pWaitSemaphoreValues}. */
    public static void npWaitSemaphoreValues(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkD3D12FenceSubmitInfoKHR.PWAITSEMAPHOREVALUES, memAddressSafe(value)); if (value != null) { nwaitSemaphoreValuesCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code signalSemaphoreValuesCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreValuesCount(long struct, int value) { memPutInt(struct + VkD3D12FenceSubmitInfoKHR.SIGNALSEMAPHOREVALUESCOUNT, value); }
    /** Unsafe version of {@link #pSignalSemaphoreValues(LongBuffer) pSignalSemaphoreValues}. */
    public static void npSignalSemaphoreValues(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkD3D12FenceSubmitInfoKHR.PSIGNALSEMAPHOREVALUES, memAddressSafe(value)); if (value != null) { nsignalSemaphoreValuesCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkD3D12FenceSubmitInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkD3D12FenceSubmitInfoKHR, Buffer> implements NativeResource {

        private static final VkD3D12FenceSubmitInfoKHR ELEMENT_FACTORY = VkD3D12FenceSubmitInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkD3D12FenceSubmitInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkD3D12FenceSubmitInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkD3D12FenceSubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkD3D12FenceSubmitInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkD3D12FenceSubmitInfoKHR.npNext(address()); }
        /** @return the value of the {@code waitSemaphoreValuesCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreValuesCount() { return VkD3D12FenceSubmitInfoKHR.nwaitSemaphoreValuesCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphoreValues} field. */
        @NativeType("uint64_t const *")
        public @Nullable LongBuffer pWaitSemaphoreValues() { return VkD3D12FenceSubmitInfoKHR.npWaitSemaphoreValues(address()); }
        /** @return the value of the {@code signalSemaphoreValuesCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreValuesCount() { return VkD3D12FenceSubmitInfoKHR.nsignalSemaphoreValuesCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphoreValues} field. */
        @NativeType("uint64_t const *")
        public @Nullable LongBuffer pSignalSemaphoreValues() { return VkD3D12FenceSubmitInfoKHR.npSignalSemaphoreValues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkD3D12FenceSubmitInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkD3D12FenceSubmitInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExternalSemaphoreWin32#VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR} value to the {@code sType} field. */
        public VkD3D12FenceSubmitInfoKHR.Buffer sType$Default() { return sType(KHRExternalSemaphoreWin32.VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkD3D12FenceSubmitInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkD3D12FenceSubmitInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code waitSemaphoreValuesCount} field. */
        public VkD3D12FenceSubmitInfoKHR.Buffer waitSemaphoreValuesCount(@NativeType("uint32_t") int value) { VkD3D12FenceSubmitInfoKHR.nwaitSemaphoreValuesCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphoreValues} field. */
        public VkD3D12FenceSubmitInfoKHR.Buffer pWaitSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkD3D12FenceSubmitInfoKHR.npWaitSemaphoreValues(address(), value); return this; }
        /** Sets the specified value to the {@code signalSemaphoreValuesCount} field. */
        public VkD3D12FenceSubmitInfoKHR.Buffer signalSemaphoreValuesCount(@NativeType("uint32_t") int value) { VkD3D12FenceSubmitInfoKHR.nsignalSemaphoreValuesCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphoreValues} field. */
        public VkD3D12FenceSubmitInfoKHR.Buffer pSignalSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkD3D12FenceSubmitInfoKHR.npSignalSemaphoreValues(address(), value); return this; }

    }

}
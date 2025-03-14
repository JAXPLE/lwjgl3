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
 * struct VkPhysicalDevicePerformanceQueryFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 performanceCounterQueryPools;
 *     VkBool32 performanceCounterMultipleQueryPools;
 * }}</pre>
 */
public class VkPhysicalDevicePerformanceQueryFeaturesKHR extends Struct<VkPhysicalDevicePerformanceQueryFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PERFORMANCECOUNTERQUERYPOOLS,
        PERFORMANCECOUNTERMULTIPLEQUERYPOOLS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PERFORMANCECOUNTERQUERYPOOLS = layout.offsetof(2);
        PERFORMANCECOUNTERMULTIPLEQUERYPOOLS = layout.offsetof(3);
    }

    protected VkPhysicalDevicePerformanceQueryFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePerformanceQueryFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code performanceCounterQueryPools} field. */
    @NativeType("VkBool32")
    public boolean performanceCounterQueryPools() { return nperformanceCounterQueryPools(address()) != 0; }
    /** @return the value of the {@code performanceCounterMultipleQueryPools} field. */
    @NativeType("VkBool32")
    public boolean performanceCounterMultipleQueryPools() { return nperformanceCounterMultipleQueryPools(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code performanceCounterQueryPools} field. */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterQueryPools(@NativeType("VkBool32") boolean value) { nperformanceCounterQueryPools(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code performanceCounterMultipleQueryPools} field. */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterMultipleQueryPools(@NativeType("VkBool32") boolean value) { nperformanceCounterMultipleQueryPools(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR set(
        int sType,
        long pNext,
        boolean performanceCounterQueryPools,
        boolean performanceCounterMultipleQueryPools
    ) {
        sType(sType);
        pNext(pNext);
        performanceCounterQueryPools(performanceCounterQueryPools);
        performanceCounterMultipleQueryPools(performanceCounterMultipleQueryPools);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePerformanceQueryFeaturesKHR set(VkPhysicalDevicePerformanceQueryFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR malloc() {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR calloc() {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR create(long address) {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePerformanceQueryFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePerformanceQueryFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePerformanceQueryFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #performanceCounterQueryPools}. */
    public static int nperformanceCounterQueryPools(long struct) { return memGetInt(struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.PERFORMANCECOUNTERQUERYPOOLS); }
    /** Unsafe version of {@link #performanceCounterMultipleQueryPools}. */
    public static int nperformanceCounterMultipleQueryPools(long struct) { return memGetInt(struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.PERFORMANCECOUNTERMULTIPLEQUERYPOOLS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #performanceCounterQueryPools(boolean) performanceCounterQueryPools}. */
    public static void nperformanceCounterQueryPools(long struct, int value) { memPutInt(struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.PERFORMANCECOUNTERQUERYPOOLS, value); }
    /** Unsafe version of {@link #performanceCounterMultipleQueryPools(boolean) performanceCounterMultipleQueryPools}. */
    public static void nperformanceCounterMultipleQueryPools(long struct, int value) { memPutInt(struct + VkPhysicalDevicePerformanceQueryFeaturesKHR.PERFORMANCECOUNTERMULTIPLEQUERYPOOLS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePerformanceQueryFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePerformanceQueryFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePerformanceQueryFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePerformanceQueryFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePerformanceQueryFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePerformanceQueryFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePerformanceQueryFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePerformanceQueryFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code performanceCounterQueryPools} field. */
        @NativeType("VkBool32")
        public boolean performanceCounterQueryPools() { return VkPhysicalDevicePerformanceQueryFeaturesKHR.nperformanceCounterQueryPools(address()) != 0; }
        /** @return the value of the {@code performanceCounterMultipleQueryPools} field. */
        @NativeType("VkBool32")
        public boolean performanceCounterMultipleQueryPools() { return VkPhysicalDevicePerformanceQueryFeaturesKHR.nperformanceCounterMultipleQueryPools(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePerformanceQueryFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePerformanceQueryFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code performanceCounterQueryPools} field. */
        public VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer performanceCounterQueryPools(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePerformanceQueryFeaturesKHR.nperformanceCounterQueryPools(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code performanceCounterMultipleQueryPools} field. */
        public VkPhysicalDevicePerformanceQueryFeaturesKHR.Buffer performanceCounterMultipleQueryPools(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePerformanceQueryFeaturesKHR.nperformanceCounterMultipleQueryPools(address(), value ? 1 : 0); return this; }

    }

}
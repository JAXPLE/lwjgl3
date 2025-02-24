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
 * struct VkAcquireNextImageInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSwapchainKHR swapchain;
 *     uint64_t timeout;
 *     VkSemaphore semaphore;
 *     VkFence fence;
 *     uint32_t deviceMask;
 * }}</pre>
 */
public class VkAcquireNextImageInfoKHR extends Struct<VkAcquireNextImageInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAIN,
        TIMEOUT,
        SEMAPHORE,
        FENCE,
        DEVICEMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAIN = layout.offsetof(2);
        TIMEOUT = layout.offsetof(3);
        SEMAPHORE = layout.offsetof(4);
        FENCE = layout.offsetof(5);
        DEVICEMASK = layout.offsetof(6);
    }

    protected VkAcquireNextImageInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAcquireNextImageInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAcquireNextImageInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkAcquireNextImageInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAcquireNextImageInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code swapchain} field. */
    @NativeType("VkSwapchainKHR")
    public long swapchain() { return nswapchain(address()); }
    /** @return the value of the {@code timeout} field. */
    @NativeType("uint64_t")
    public long timeout() { return ntimeout(address()); }
    /** @return the value of the {@code semaphore} field. */
    @NativeType("VkSemaphore")
    public long semaphore() { return nsemaphore(address()); }
    /** @return the value of the {@code fence} field. */
    @NativeType("VkFence")
    public long fence() { return nfence(address()); }
    /** @return the value of the {@code deviceMask} field. */
    @NativeType("uint32_t")
    public int deviceMask() { return ndeviceMask(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAcquireNextImageInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR} value to the {@code sType} field. */
    public VkAcquireNextImageInfoKHR sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAcquireNextImageInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchain} field. */
    public VkAcquireNextImageInfoKHR swapchain(@NativeType("VkSwapchainKHR") long value) { nswapchain(address(), value); return this; }
    /** Sets the specified value to the {@code timeout} field. */
    public VkAcquireNextImageInfoKHR timeout(@NativeType("uint64_t") long value) { ntimeout(address(), value); return this; }
    /** Sets the specified value to the {@code semaphore} field. */
    public VkAcquireNextImageInfoKHR semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@code fence} field. */
    public VkAcquireNextImageInfoKHR fence(@NativeType("VkFence") long value) { nfence(address(), value); return this; }
    /** Sets the specified value to the {@code deviceMask} field. */
    public VkAcquireNextImageInfoKHR deviceMask(@NativeType("uint32_t") int value) { ndeviceMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAcquireNextImageInfoKHR set(
        int sType,
        long pNext,
        long swapchain,
        long timeout,
        long semaphore,
        long fence,
        int deviceMask
    ) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);
        timeout(timeout);
        semaphore(semaphore);
        fence(fence);
        deviceMask(deviceMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAcquireNextImageInfoKHR set(VkAcquireNextImageInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAcquireNextImageInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAcquireNextImageInfoKHR malloc() {
        return new VkAcquireNextImageInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAcquireNextImageInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAcquireNextImageInfoKHR calloc() {
        return new VkAcquireNextImageInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAcquireNextImageInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAcquireNextImageInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAcquireNextImageInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAcquireNextImageInfoKHR} instance for the specified memory address. */
    public static VkAcquireNextImageInfoKHR create(long address) {
        return new VkAcquireNextImageInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAcquireNextImageInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkAcquireNextImageInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAcquireNextImageInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAcquireNextImageInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAcquireNextImageInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAcquireNextImageInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAcquireNextImageInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAcquireNextImageInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAcquireNextImageInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkAcquireNextImageInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAcquireNextImageInfoKHR malloc(MemoryStack stack) {
        return new VkAcquireNextImageInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAcquireNextImageInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAcquireNextImageInfoKHR calloc(MemoryStack stack) {
        return new VkAcquireNextImageInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAcquireNextImageInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAcquireNextImageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAcquireNextImageInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAcquireNextImageInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAcquireNextImageInfoKHR.PNEXT); }
    /** Unsafe version of {@link #swapchain}. */
    public static long nswapchain(long struct) { return memGetLong(struct + VkAcquireNextImageInfoKHR.SWAPCHAIN); }
    /** Unsafe version of {@link #timeout}. */
    public static long ntimeout(long struct) { return memGetLong(struct + VkAcquireNextImageInfoKHR.TIMEOUT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return memGetLong(struct + VkAcquireNextImageInfoKHR.SEMAPHORE); }
    /** Unsafe version of {@link #fence}. */
    public static long nfence(long struct) { return memGetLong(struct + VkAcquireNextImageInfoKHR.FENCE); }
    /** Unsafe version of {@link #deviceMask}. */
    public static int ndeviceMask(long struct) { return memGetInt(struct + VkAcquireNextImageInfoKHR.DEVICEMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAcquireNextImageInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAcquireNextImageInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #swapchain(long) swapchain}. */
    public static void nswapchain(long struct, long value) { memPutLong(struct + VkAcquireNextImageInfoKHR.SWAPCHAIN, value); }
    /** Unsafe version of {@link #timeout(long) timeout}. */
    public static void ntimeout(long struct, long value) { memPutLong(struct + VkAcquireNextImageInfoKHR.TIMEOUT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { memPutLong(struct + VkAcquireNextImageInfoKHR.SEMAPHORE, value); }
    /** Unsafe version of {@link #fence(long) fence}. */
    public static void nfence(long struct, long value) { memPutLong(struct + VkAcquireNextImageInfoKHR.FENCE, value); }
    /** Unsafe version of {@link #deviceMask(int) deviceMask}. */
    public static void ndeviceMask(long struct, int value) { memPutInt(struct + VkAcquireNextImageInfoKHR.DEVICEMASK, value); }

    // -----------------------------------

    /** An array of {@link VkAcquireNextImageInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAcquireNextImageInfoKHR, Buffer> implements NativeResource {

        private static final VkAcquireNextImageInfoKHR ELEMENT_FACTORY = VkAcquireNextImageInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAcquireNextImageInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAcquireNextImageInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAcquireNextImageInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAcquireNextImageInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAcquireNextImageInfoKHR.npNext(address()); }
        /** @return the value of the {@code swapchain} field. */
        @NativeType("VkSwapchainKHR")
        public long swapchain() { return VkAcquireNextImageInfoKHR.nswapchain(address()); }
        /** @return the value of the {@code timeout} field. */
        @NativeType("uint64_t")
        public long timeout() { return VkAcquireNextImageInfoKHR.ntimeout(address()); }
        /** @return the value of the {@code semaphore} field. */
        @NativeType("VkSemaphore")
        public long semaphore() { return VkAcquireNextImageInfoKHR.nsemaphore(address()); }
        /** @return the value of the {@code fence} field. */
        @NativeType("VkFence")
        public long fence() { return VkAcquireNextImageInfoKHR.nfence(address()); }
        /** @return the value of the {@code deviceMask} field. */
        @NativeType("uint32_t")
        public int deviceMask() { return VkAcquireNextImageInfoKHR.ndeviceMask(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAcquireNextImageInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAcquireNextImageInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR} value to the {@code sType} field. */
        public VkAcquireNextImageInfoKHR.Buffer sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAcquireNextImageInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkAcquireNextImageInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchain} field. */
        public VkAcquireNextImageInfoKHR.Buffer swapchain(@NativeType("VkSwapchainKHR") long value) { VkAcquireNextImageInfoKHR.nswapchain(address(), value); return this; }
        /** Sets the specified value to the {@code timeout} field. */
        public VkAcquireNextImageInfoKHR.Buffer timeout(@NativeType("uint64_t") long value) { VkAcquireNextImageInfoKHR.ntimeout(address(), value); return this; }
        /** Sets the specified value to the {@code semaphore} field. */
        public VkAcquireNextImageInfoKHR.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkAcquireNextImageInfoKHR.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@code fence} field. */
        public VkAcquireNextImageInfoKHR.Buffer fence(@NativeType("VkFence") long value) { VkAcquireNextImageInfoKHR.nfence(address(), value); return this; }
        /** Sets the specified value to the {@code deviceMask} field. */
        public VkAcquireNextImageInfoKHR.Buffer deviceMask(@NativeType("uint32_t") int value) { VkAcquireNextImageInfoKHR.ndeviceMask(address(), value); return this; }

    }

}
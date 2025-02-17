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
 * struct VkAccelerationStructureBuildSizesInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceSize accelerationStructureSize;
 *     VkDeviceSize updateScratchSize;
 *     VkDeviceSize buildScratchSize;
 * }}</pre>
 */
public class VkAccelerationStructureBuildSizesInfoKHR extends Struct<VkAccelerationStructureBuildSizesInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACCELERATIONSTRUCTURESIZE,
        UPDATESCRATCHSIZE,
        BUILDSCRATCHSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURESIZE = layout.offsetof(2);
        UPDATESCRATCHSIZE = layout.offsetof(3);
        BUILDSCRATCHSIZE = layout.offsetof(4);
    }

    protected VkAccelerationStructureBuildSizesInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureBuildSizesInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureBuildSizesInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureBuildSizesInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureBuildSizesInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code accelerationStructureSize} field. */
    @NativeType("VkDeviceSize")
    public long accelerationStructureSize() { return naccelerationStructureSize(address()); }
    /** @return the value of the {@code updateScratchSize} field. */
    @NativeType("VkDeviceSize")
    public long updateScratchSize() { return nupdateScratchSize(address()); }
    /** @return the value of the {@code buildScratchSize} field. */
    @NativeType("VkDeviceSize")
    public long buildScratchSize() { return nbuildScratchSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureBuildSizesInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR} value to the {@code sType} field. */
    public VkAccelerationStructureBuildSizesInfoKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureBuildSizesInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureBuildSizesInfoKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureBuildSizesInfoKHR set(VkAccelerationStructureBuildSizesInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureBuildSizesInfoKHR malloc() {
        return new VkAccelerationStructureBuildSizesInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureBuildSizesInfoKHR calloc() {
        return new VkAccelerationStructureBuildSizesInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureBuildSizesInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureBuildSizesInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance for the specified memory address. */
    public static VkAccelerationStructureBuildSizesInfoKHR create(long address) {
        return new VkAccelerationStructureBuildSizesInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureBuildSizesInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureBuildSizesInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureBuildSizesInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureBuildSizesInfoKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureBuildSizesInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureBuildSizesInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureBuildSizesInfoKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureBuildSizesInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildSizesInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureBuildSizesInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureBuildSizesInfoKHR.PNEXT); }
    /** Unsafe version of {@link #accelerationStructureSize}. */
    public static long naccelerationStructureSize(long struct) { return memGetLong(struct + VkAccelerationStructureBuildSizesInfoKHR.ACCELERATIONSTRUCTURESIZE); }
    /** Unsafe version of {@link #updateScratchSize}. */
    public static long nupdateScratchSize(long struct) { return memGetLong(struct + VkAccelerationStructureBuildSizesInfoKHR.UPDATESCRATCHSIZE); }
    /** Unsafe version of {@link #buildScratchSize}. */
    public static long nbuildScratchSize(long struct) { return memGetLong(struct + VkAccelerationStructureBuildSizesInfoKHR.BUILDSCRATCHSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureBuildSizesInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureBuildSizesInfoKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureBuildSizesInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureBuildSizesInfoKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureBuildSizesInfoKHR ELEMENT_FACTORY = VkAccelerationStructureBuildSizesInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureBuildSizesInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureBuildSizesInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureBuildSizesInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureBuildSizesInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureBuildSizesInfoKHR.npNext(address()); }
        /** @return the value of the {@code accelerationStructureSize} field. */
        @NativeType("VkDeviceSize")
        public long accelerationStructureSize() { return VkAccelerationStructureBuildSizesInfoKHR.naccelerationStructureSize(address()); }
        /** @return the value of the {@code updateScratchSize} field. */
        @NativeType("VkDeviceSize")
        public long updateScratchSize() { return VkAccelerationStructureBuildSizesInfoKHR.nupdateScratchSize(address()); }
        /** @return the value of the {@code buildScratchSize} field. */
        @NativeType("VkDeviceSize")
        public long buildScratchSize() { return VkAccelerationStructureBuildSizesInfoKHR.nbuildScratchSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureBuildSizesInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureBuildSizesInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR} value to the {@code sType} field. */
        public VkAccelerationStructureBuildSizesInfoKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureBuildSizesInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureBuildSizesInfoKHR.npNext(address(), value); return this; }

    }

}
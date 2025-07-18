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
 * struct VkPhysicalDeviceMaintenance9PropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 image2DViewOf3DSparse;
 *     VkDefaultVertexAttributeValueKHR defaultVertexAttributeValue;
 * }}</pre>
 */
public class VkPhysicalDeviceMaintenance9PropertiesKHR extends Struct<VkPhysicalDeviceMaintenance9PropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGE2DVIEWOF3DSPARSE,
        DEFAULTVERTEXATTRIBUTEVALUE;

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
        IMAGE2DVIEWOF3DSPARSE = layout.offsetof(2);
        DEFAULTVERTEXATTRIBUTEVALUE = layout.offsetof(3);
    }

    protected VkPhysicalDeviceMaintenance9PropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMaintenance9PropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMaintenance9PropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMaintenance9PropertiesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code image2DViewOf3DSparse} field. */
    @NativeType("VkBool32")
    public boolean image2DViewOf3DSparse() { return nimage2DViewOf3DSparse(address()) != 0; }
    /** @return the value of the {@code defaultVertexAttributeValue} field. */
    @NativeType("VkDefaultVertexAttributeValueKHR")
    public int defaultVertexAttributeValue() { return ndefaultVertexAttributeValue(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMaintenance9PropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance9#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceMaintenance9PropertiesKHR sType$Default() { return sType(KHRMaintenance9.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMaintenance9PropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMaintenance9PropertiesKHR set(
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
    public VkPhysicalDeviceMaintenance9PropertiesKHR set(VkPhysicalDeviceMaintenance9PropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMaintenance9PropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance9PropertiesKHR malloc() {
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance9PropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance9PropertiesKHR calloc() {
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance9PropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMaintenance9PropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance9PropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceMaintenance9PropertiesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMaintenance9PropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMaintenance9PropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMaintenance9PropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance9PropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance9PropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance9PropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance9PropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance9PropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMaintenance9PropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #image2DViewOf3DSparse}. */
    public static int nimage2DViewOf3DSparse(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance9PropertiesKHR.IMAGE2DVIEWOF3DSPARSE); }
    /** Unsafe version of {@link #defaultVertexAttributeValue}. */
    public static int ndefaultVertexAttributeValue(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance9PropertiesKHR.DEFAULTVERTEXATTRIBUTEVALUE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMaintenance9PropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMaintenance9PropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMaintenance9PropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance9PropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMaintenance9PropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance9PropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMaintenance9PropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMaintenance9PropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance9PropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance9PropertiesKHR.npNext(address()); }
        /** @return the value of the {@code image2DViewOf3DSparse} field. */
        @NativeType("VkBool32")
        public boolean image2DViewOf3DSparse() { return VkPhysicalDeviceMaintenance9PropertiesKHR.nimage2DViewOf3DSparse(address()) != 0; }
        /** @return the value of the {@code defaultVertexAttributeValue} field. */
        @NativeType("VkDefaultVertexAttributeValueKHR")
        public int defaultVertexAttributeValue() { return VkPhysicalDeviceMaintenance9PropertiesKHR.ndefaultVertexAttributeValue(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMaintenance9PropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance9#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer sType$Default() { return sType(KHRMaintenance9.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMaintenance9PropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMaintenance9PropertiesKHR.npNext(address(), value); return this; }

    }

}
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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.system.windows.*;

/**
 * <pre>{@code
 * struct VkExportFenceWin32HandleInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link SECURITY_ATTRIBUTES SECURITY_ATTRIBUTES} const * pAttributes;
 *     DWORD dwAccess;
 *     LPCWSTR name;
 * }}</pre>
 */
public class VkExportFenceWin32HandleInfoKHR extends Struct<VkExportFenceWin32HandleInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PATTRIBUTES,
        DWACCESS,
        NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PATTRIBUTES = layout.offsetof(2);
        DWACCESS = layout.offsetof(3);
        NAME = layout.offsetof(4);
    }

    protected VkExportFenceWin32HandleInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExportFenceWin32HandleInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkExportFenceWin32HandleInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkExportFenceWin32HandleInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportFenceWin32HandleInfoKHR(ByteBuffer container) {
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
    /** @return a {@link SECURITY_ATTRIBUTES} view of the struct pointed to by the {@code pAttributes} field. */
    @NativeType("SECURITY_ATTRIBUTES const *")
    public @Nullable SECURITY_ATTRIBUTES pAttributes() { return npAttributes(address()); }
    /** @return the value of the {@code dwAccess} field. */
    @NativeType("DWORD")
    public int dwAccess() { return ndwAccess(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("LPCWSTR")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("LPCWSTR")
    public String nameString() { return nnameString(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExportFenceWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExternalFenceWin32#VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR} value to the {@code sType} field. */
    public VkExportFenceWin32HandleInfoKHR sType$Default() { return sType(KHRExternalFenceWin32.VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExportFenceWin32HandleInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link SECURITY_ATTRIBUTES} to the {@code pAttributes} field. */
    public VkExportFenceWin32HandleInfoKHR pAttributes(@Nullable @NativeType("SECURITY_ATTRIBUTES const *") SECURITY_ATTRIBUTES value) { npAttributes(address(), value); return this; }
    /** Sets the specified value to the {@code dwAccess} field. */
    public VkExportFenceWin32HandleInfoKHR dwAccess(@NativeType("DWORD") int value) { ndwAccess(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code name} field. */
    public VkExportFenceWin32HandleInfoKHR name(@NativeType("LPCWSTR") ByteBuffer value) { nname(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportFenceWin32HandleInfoKHR set(
        int sType,
        long pNext,
        @Nullable SECURITY_ATTRIBUTES pAttributes,
        int dwAccess,
        ByteBuffer name
    ) {
        sType(sType);
        pNext(pNext);
        pAttributes(pAttributes);
        dwAccess(dwAccess);
        name(name);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExportFenceWin32HandleInfoKHR set(VkExportFenceWin32HandleInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportFenceWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportFenceWin32HandleInfoKHR malloc() {
        return new VkExportFenceWin32HandleInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExportFenceWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportFenceWin32HandleInfoKHR calloc() {
        return new VkExportFenceWin32HandleInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExportFenceWin32HandleInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkExportFenceWin32HandleInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportFenceWin32HandleInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkExportFenceWin32HandleInfoKHR} instance for the specified memory address. */
    public static VkExportFenceWin32HandleInfoKHR create(long address) {
        return new VkExportFenceWin32HandleInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExportFenceWin32HandleInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkExportFenceWin32HandleInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkExportFenceWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportFenceWin32HandleInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportFenceWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportFenceWin32HandleInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportFenceWin32HandleInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportFenceWin32HandleInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExportFenceWin32HandleInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportFenceWin32HandleInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExportFenceWin32HandleInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportFenceWin32HandleInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportFenceWin32HandleInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExportFenceWin32HandleInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExportFenceWin32HandleInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportFenceWin32HandleInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportFenceWin32HandleInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportFenceWin32HandleInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExportFenceWin32HandleInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExportFenceWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportFenceWin32HandleInfoKHR malloc(MemoryStack stack) {
        return new VkExportFenceWin32HandleInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExportFenceWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportFenceWin32HandleInfoKHR calloc(MemoryStack stack) {
        return new VkExportFenceWin32HandleInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExportFenceWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportFenceWin32HandleInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportFenceWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportFenceWin32HandleInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExportFenceWin32HandleInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportFenceWin32HandleInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pAttributes}. */
    public static @Nullable SECURITY_ATTRIBUTES npAttributes(long struct) { return SECURITY_ATTRIBUTES.createSafe(memGetAddress(struct + VkExportFenceWin32HandleInfoKHR.PATTRIBUTES)); }
    /** Unsafe version of {@link #dwAccess}. */
    public static int ndwAccess(long struct) { return memGetInt(struct + VkExportFenceWin32HandleInfoKHR.DWACCESS); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT2(memGetAddress(struct + VkExportFenceWin32HandleInfoKHR.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF16(memGetAddress(struct + VkExportFenceWin32HandleInfoKHR.NAME)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExportFenceWin32HandleInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportFenceWin32HandleInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pAttributes(SECURITY_ATTRIBUTES) pAttributes}. */
    public static void npAttributes(long struct, @Nullable SECURITY_ATTRIBUTES value) { memPutAddress(struct + VkExportFenceWin32HandleInfoKHR.PATTRIBUTES, memAddressSafe(value)); }
    /** Unsafe version of {@link #dwAccess(int) dwAccess}. */
    public static void ndwAccess(long struct, int value) { memPutInt(struct + VkExportFenceWin32HandleInfoKHR.DWACCESS, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT2(value); }
        memPutAddress(struct + VkExportFenceWin32HandleInfoKHR.NAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pAttributes = memGetAddress(struct + VkExportFenceWin32HandleInfoKHR.PATTRIBUTES);
        if (pAttributes != NULL) {
            SECURITY_ATTRIBUTES.validate(pAttributes);
        }
        check(memGetAddress(struct + VkExportFenceWin32HandleInfoKHR.NAME));
    }

    // -----------------------------------

    /** An array of {@link VkExportFenceWin32HandleInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkExportFenceWin32HandleInfoKHR, Buffer> implements NativeResource {

        private static final VkExportFenceWin32HandleInfoKHR ELEMENT_FACTORY = VkExportFenceWin32HandleInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkExportFenceWin32HandleInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportFenceWin32HandleInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExportFenceWin32HandleInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportFenceWin32HandleInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportFenceWin32HandleInfoKHR.npNext(address()); }
        /** @return a {@link SECURITY_ATTRIBUTES} view of the struct pointed to by the {@code pAttributes} field. */
        @NativeType("SECURITY_ATTRIBUTES const *")
        public @Nullable SECURITY_ATTRIBUTES pAttributes() { return VkExportFenceWin32HandleInfoKHR.npAttributes(address()); }
        /** @return the value of the {@code dwAccess} field. */
        @NativeType("DWORD")
        public int dwAccess() { return VkExportFenceWin32HandleInfoKHR.ndwAccess(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("LPCWSTR")
        public ByteBuffer name() { return VkExportFenceWin32HandleInfoKHR.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("LPCWSTR")
        public String nameString() { return VkExportFenceWin32HandleInfoKHR.nnameString(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExportFenceWin32HandleInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkExportFenceWin32HandleInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExternalFenceWin32#VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR} value to the {@code sType} field. */
        public VkExportFenceWin32HandleInfoKHR.Buffer sType$Default() { return sType(KHRExternalFenceWin32.VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExportFenceWin32HandleInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkExportFenceWin32HandleInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link SECURITY_ATTRIBUTES} to the {@code pAttributes} field. */
        public VkExportFenceWin32HandleInfoKHR.Buffer pAttributes(@Nullable @NativeType("SECURITY_ATTRIBUTES const *") SECURITY_ATTRIBUTES value) { VkExportFenceWin32HandleInfoKHR.npAttributes(address(), value); return this; }
        /** Sets the specified value to the {@code dwAccess} field. */
        public VkExportFenceWin32HandleInfoKHR.Buffer dwAccess(@NativeType("DWORD") int value) { VkExportFenceWin32HandleInfoKHR.ndwAccess(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code name} field. */
        public VkExportFenceWin32HandleInfoKHR.Buffer name(@NativeType("LPCWSTR") ByteBuffer value) { VkExportFenceWin32HandleInfoKHR.nname(address(), value); return this; }

    }

}
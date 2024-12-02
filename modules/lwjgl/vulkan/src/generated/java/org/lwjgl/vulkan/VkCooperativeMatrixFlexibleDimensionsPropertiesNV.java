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
 * Structure specifying cooperative matrix properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>Rather than explicitly enumerating a list of supported sizes, {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV} advertises size granularities, where the matrix <b>must</b> be a multiple of the advertised size. The M and K granularities apply to rows and columns of matrices with {@code Use} of {@code MatrixA}, K, and N apply to rows and columns of matrices with {@code Use} of {@code MatrixB}, M, and N apply to rows and columns of matrices with {@code Use} of {@code MatrixAccumulator}.</p>
 * 
 * <p>For a given type combination, if multiple workgroup sizes are supported there <b>may</b> be multiple {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV} structures with different granularities.</p>
 * 
 * <p>All granularity values <b>must</b> be powers of two.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Different A/B types may require different granularities but share the same accumulator type. In such a case, the supported granularity for a matrix with the accumulator type would be the smallest advertised granularity.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVCooperativeMatrix2#VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVCooperativeMatrix2#vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV GetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCooperativeMatrixFlexibleDimensionsPropertiesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #MGranularity};
 *     uint32_t {@link #NGranularity};
 *     uint32_t {@link #KGranularity};
 *     VkComponentTypeKHR {@link #AType};
 *     VkComponentTypeKHR {@link #BType};
 *     VkComponentTypeKHR {@link #CType};
 *     VkComponentTypeKHR {@link #ResultType};
 *     VkBool32 {@link #saturatingAccumulation};
 *     VkScopeKHR {@link #scope};
 *     uint32_t {@link #workgroupInvocations};
 * }</code></pre>
 */
public class VkCooperativeMatrixFlexibleDimensionsPropertiesNV extends Struct<VkCooperativeMatrixFlexibleDimensionsPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MGRANULARITY,
        NGRANULARITY,
        KGRANULARITY,
        ATYPE,
        BTYPE,
        CTYPE,
        RESULTTYPE,
        SATURATINGACCUMULATION,
        SCOPE,
        WORKGROUPINVOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MGRANULARITY = layout.offsetof(2);
        NGRANULARITY = layout.offsetof(3);
        KGRANULARITY = layout.offsetof(4);
        ATYPE = layout.offsetof(5);
        BTYPE = layout.offsetof(6);
        CTYPE = layout.offsetof(7);
        RESULTTYPE = layout.offsetof(8);
        SATURATINGACCUMULATION = layout.offsetof(9);
        SCOPE = layout.offsetof(10);
        WORKGROUPINVOCATIONS = layout.offsetof(11);
    }

    protected VkCooperativeMatrixFlexibleDimensionsPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCooperativeMatrixFlexibleDimensionsPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkCooperativeMatrixFlexibleDimensionsPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the granularity of the number of rows in matrices {@code A}, {@code C}, and {@code Result}. The rows <b>must</b> be an integer multiple of this value. */
    @NativeType("uint32_t")
    public int MGranularity() { return nMGranularity(address()); }
    /** the granularity of columns in matrices {@code B}, {@code C}, {@code Result}. The columns <b>must</b> be an integer multiple of this value. */
    @NativeType("uint32_t")
    public int NGranularity() { return nNGranularity(address()); }
    /** the granularity of columns in matrix {@code A} and rows in matrix {@code B}. The columns/rows <b>must</b> be an integer multiple of this value. */
    @NativeType("uint32_t")
    public int KGranularity() { return nKGranularity(address()); }
    /** the component type of matrix {@code A}, of type {@code VkComponentTypeKHR}. */
    @NativeType("VkComponentTypeKHR")
    public int AType() { return nAType(address()); }
    /** the component type of matrix {@code B}, of type {@code VkComponentTypeKHR}. */
    @NativeType("VkComponentTypeKHR")
    public int BType() { return nBType(address()); }
    /** the component type of matrix {@code C}, of type {@code VkComponentTypeKHR}. */
    @NativeType("VkComponentTypeKHR")
    public int CType() { return nCType(address()); }
    /** the component type of matrix {@code Result}, of type {@code VkComponentTypeKHR}. */
    @NativeType("VkComponentTypeKHR")
    public int ResultType() { return nResultType(address()); }
    /** indicates whether the {@code SaturatingAccumulation} operand to {@code OpCooperativeMatrixMulAddKHR} <b>must</b> be present or not. If it is {@link VK10#VK_TRUE TRUE}, the {@code SaturatingAccumulation} operand <b>must</b> be present. If it is {@link VK10#VK_FALSE FALSE}, the {@code SaturatingAccumulation} operand <b>must</b> not be present. */
    @NativeType("VkBool32")
    public boolean saturatingAccumulation() { return nsaturatingAccumulation(address()) != 0; }
    /** the scope of all the matrix types, of type {@code VkScopeKHR}. */
    @NativeType("VkScopeKHR")
    public int scope() { return nscope(address()); }
    /** the number of invocations in the local workgroup when this combination of values is supported. */
    @NativeType("uint32_t")
    public int workgroupInvocations() { return nworkgroupInvocations(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCooperativeMatrix2#VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV} value to the {@link #sType} field. */
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV sType$Default() { return sType(NVCooperativeMatrix2.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV set(
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
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV set(VkCooperativeMatrixFlexibleDimensionsPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCooperativeMatrixFlexibleDimensionsPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV malloc() {
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCooperativeMatrixFlexibleDimensionsPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV calloc() {
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCooperativeMatrixFlexibleDimensionsPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkCooperativeMatrixFlexibleDimensionsPropertiesNV} instance for the specified memory address. */
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV create(long address) {
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCooperativeMatrixFlexibleDimensionsPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCooperativeMatrixFlexibleDimensionsPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV malloc(MemoryStack stack) {
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCooperativeMatrixFlexibleDimensionsPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV calloc(MemoryStack stack) {
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #MGranularity}. */
    public static int nMGranularity(long struct) { return memGetInt(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.MGRANULARITY); }
    /** Unsafe version of {@link #NGranularity}. */
    public static int nNGranularity(long struct) { return memGetInt(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.NGRANULARITY); }
    /** Unsafe version of {@link #KGranularity}. */
    public static int nKGranularity(long struct) { return memGetInt(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.KGRANULARITY); }
    /** Unsafe version of {@link #AType}. */
    public static int nAType(long struct) { return memGetInt(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.ATYPE); }
    /** Unsafe version of {@link #BType}. */
    public static int nBType(long struct) { return memGetInt(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.BTYPE); }
    /** Unsafe version of {@link #CType}. */
    public static int nCType(long struct) { return memGetInt(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.CTYPE); }
    /** Unsafe version of {@link #ResultType}. */
    public static int nResultType(long struct) { return memGetInt(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.RESULTTYPE); }
    /** Unsafe version of {@link #saturatingAccumulation}. */
    public static int nsaturatingAccumulation(long struct) { return memGetInt(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.SATURATINGACCUMULATION); }
    /** Unsafe version of {@link #scope}. */
    public static int nscope(long struct) { return memGetInt(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.SCOPE); }
    /** Unsafe version of {@link #workgroupInvocations}. */
    public static int nworkgroupInvocations(long struct) { return memGetInt(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.WORKGROUPINVOCATIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCooperativeMatrixFlexibleDimensionsPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkCooperativeMatrixFlexibleDimensionsPropertiesNV, Buffer> implements NativeResource {

        private static final VkCooperativeMatrixFlexibleDimensionsPropertiesNV ELEMENT_FACTORY = VkCooperativeMatrixFlexibleDimensionsPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCooperativeMatrixFlexibleDimensionsPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nsType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.npNext(address()); }
        /** @return the value of the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#MGranularity} field. */
        @NativeType("uint32_t")
        public int MGranularity() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nMGranularity(address()); }
        /** @return the value of the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#NGranularity} field. */
        @NativeType("uint32_t")
        public int NGranularity() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nNGranularity(address()); }
        /** @return the value of the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#KGranularity} field. */
        @NativeType("uint32_t")
        public int KGranularity() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nKGranularity(address()); }
        /** @return the value of the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#AType} field. */
        @NativeType("VkComponentTypeKHR")
        public int AType() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nAType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#BType} field. */
        @NativeType("VkComponentTypeKHR")
        public int BType() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nBType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#CType} field. */
        @NativeType("VkComponentTypeKHR")
        public int CType() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nCType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#ResultType} field. */
        @NativeType("VkComponentTypeKHR")
        public int ResultType() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nResultType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#saturatingAccumulation} field. */
        @NativeType("VkBool32")
        public boolean saturatingAccumulation() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nsaturatingAccumulation(address()) != 0; }
        /** @return the value of the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#scope} field. */
        @NativeType("VkScopeKHR")
        public int scope() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nscope(address()); }
        /** @return the value of the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#workgroupInvocations} field. */
        @NativeType("uint32_t")
        public int workgroupInvocations() { return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nworkgroupInvocations(address()); }

        /** Sets the specified value to the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#sType} field. */
        public VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCooperativeMatrix2#VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV} value to the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#sType} field. */
        public VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer sType$Default() { return sType(NVCooperativeMatrix2.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV); }
        /** Sets the specified value to the {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV#pNext} field. */
        public VkCooperativeMatrixFlexibleDimensionsPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkCooperativeMatrixFlexibleDimensionsPropertiesNV.npNext(address(), value); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct nk_chart_slot {
 *     enum nk_chart_type type;
 *     {@link NkColor struct nk_color} color;
 *     {@link NkColor struct nk_color} highlight;
 *     float min;
 *     float max;
 *     float range;
 *     int count;
 *     {@link NkVec2 struct nk_vec2} last;
 *     int index;
 *     nk_bool show_markers;
 * }}</pre>
 */
@NativeType("struct nk_chart_slot")
public class NkChartSlot extends Struct<NkChartSlot> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        COLOR,
        HIGHLIGHT,
        MIN,
        MAX,
        RANGE,
        COUNT,
        LAST,
        INDEX,
        SHOW_MARKERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        COLOR = layout.offsetof(1);
        HIGHLIGHT = layout.offsetof(2);
        MIN = layout.offsetof(3);
        MAX = layout.offsetof(4);
        RANGE = layout.offsetof(5);
        COUNT = layout.offsetof(6);
        LAST = layout.offsetof(7);
        INDEX = layout.offsetof(8);
        SHOW_MARKERS = layout.offsetof(9);
    }

    protected NkChartSlot(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkChartSlot create(long address, @Nullable ByteBuffer container) {
        return new NkChartSlot(address, container);
    }

    /**
     * Creates a {@code NkChartSlot} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkChartSlot(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("enum nk_chart_type")
    public int type() { return ntype(address()); }
    /** @return a {@link NkColor} view of the {@code color} field. */
    @NativeType("struct nk_color")
    public NkColor color() { return ncolor(address()); }
    /** @return a {@link NkColor} view of the {@code highlight} field. */
    @NativeType("struct nk_color")
    public NkColor highlight() { return nhighlight(address()); }
    /** @return the value of the {@code min} field. */
    public float min() { return nmin(address()); }
    /** @return the value of the {@code max} field. */
    public float max() { return nmax(address()); }
    /** @return the value of the {@code range} field. */
    public float range() { return nrange(address()); }
    /** @return the value of the {@code count} field. */
    public int count() { return ncount(address()); }
    /** @return a {@link NkVec2} view of the {@code last} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 last() { return nlast(address()); }
    /** @return the value of the {@code index} field. */
    public int index() { return nindex(address()); }
    /** @return the value of the {@code show_markers} field. */
    @NativeType("nk_bool")
    public boolean show_markers() { return nshow_markers(address()); }

    // -----------------------------------

    /** Returns a new {@code NkChartSlot} instance for the specified memory address. */
    public static NkChartSlot create(long address) {
        return new NkChartSlot(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkChartSlot createSafe(long address) {
        return address == NULL ? null : new NkChartSlot(address, null);
    }

    /**
     * Create a {@link NkChartSlot.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkChartSlot.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkChartSlot.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + NkChartSlot.TYPE); }
    /** Unsafe version of {@link #color}. */
    public static NkColor ncolor(long struct) { return NkColor.create(struct + NkChartSlot.COLOR); }
    /** Unsafe version of {@link #highlight}. */
    public static NkColor nhighlight(long struct) { return NkColor.create(struct + NkChartSlot.HIGHLIGHT); }
    /** Unsafe version of {@link #min}. */
    public static float nmin(long struct) { return memGetFloat(struct + NkChartSlot.MIN); }
    /** Unsafe version of {@link #max}. */
    public static float nmax(long struct) { return memGetFloat(struct + NkChartSlot.MAX); }
    /** Unsafe version of {@link #range}. */
    public static float nrange(long struct) { return memGetFloat(struct + NkChartSlot.RANGE); }
    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return memGetInt(struct + NkChartSlot.COUNT); }
    /** Unsafe version of {@link #last}. */
    public static NkVec2 nlast(long struct) { return NkVec2.create(struct + NkChartSlot.LAST); }
    /** Unsafe version of {@link #index}. */
    public static int nindex(long struct) { return memGetInt(struct + NkChartSlot.INDEX); }
    /** Unsafe version of {@link #show_markers}. */
    public static boolean nshow_markers(long struct) { return memGetByte(struct + NkChartSlot.SHOW_MARKERS) != 0; }

    // -----------------------------------

    /** An array of {@link NkChartSlot} structs. */
    public static class Buffer extends StructBuffer<NkChartSlot, Buffer> {

        private static final NkChartSlot ELEMENT_FACTORY = NkChartSlot.create(-1L);

        /**
         * Creates a new {@code NkChartSlot.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkChartSlot#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkChartSlot getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("enum nk_chart_type")
        public int type() { return NkChartSlot.ntype(address()); }
        /** @return a {@link NkColor} view of the {@code color} field. */
        @NativeType("struct nk_color")
        public NkColor color() { return NkChartSlot.ncolor(address()); }
        /** @return a {@link NkColor} view of the {@code highlight} field. */
        @NativeType("struct nk_color")
        public NkColor highlight() { return NkChartSlot.nhighlight(address()); }
        /** @return the value of the {@code min} field. */
        public float min() { return NkChartSlot.nmin(address()); }
        /** @return the value of the {@code max} field. */
        public float max() { return NkChartSlot.nmax(address()); }
        /** @return the value of the {@code range} field. */
        public float range() { return NkChartSlot.nrange(address()); }
        /** @return the value of the {@code count} field. */
        public int count() { return NkChartSlot.ncount(address()); }
        /** @return a {@link NkVec2} view of the {@code last} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 last() { return NkChartSlot.nlast(address()); }
        /** @return the value of the {@code index} field. */
        public int index() { return NkChartSlot.nindex(address()); }
        /** @return the value of the {@code show_markers} field. */
        @NativeType("nk_bool")
        public boolean show_markers() { return NkChartSlot.nshow_markers(address()); }

    }

}
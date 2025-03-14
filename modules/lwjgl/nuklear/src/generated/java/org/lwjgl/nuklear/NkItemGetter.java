/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_item_getter} */
public abstract class NkItemGetter extends Callback implements NkItemGetterI {

    /**
     * Creates a {@code NkItemGetter} instance from the specified function pointer.
     *
     * @return the new {@code NkItemGetter}
     */
    public static NkItemGetter create(long functionPointer) {
        NkItemGetterI instance = Callback.get(functionPointer);
        return instance instanceof NkItemGetter
            ? (NkItemGetter)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkItemGetter createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code NkItemGetter} instance that delegates to the specified {@code NkItemGetterI} instance. */
    public static NkItemGetter create(NkItemGetterI instance) {
        return instance instanceof NkItemGetter
            ? (NkItemGetter)instance
            : new Container(instance.address(), instance);
    }

    protected NkItemGetter() {
        super(CIF);
    }

    NkItemGetter(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends NkItemGetter {

        private final NkItemGetterI delegate;

        Container(long functionPointer, NkItemGetterI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(long userdata, int selected, long item) {
            return delegate.invoke(userdata, selected, item);
        }

    }

}
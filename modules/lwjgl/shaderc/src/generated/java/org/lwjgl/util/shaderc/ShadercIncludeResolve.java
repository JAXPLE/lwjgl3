/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke shaderc_include_resolve_fn} */
public abstract class ShadercIncludeResolve extends Callback implements ShadercIncludeResolveI {

    /**
     * Creates a {@code ShadercIncludeResolve} instance from the specified function pointer.
     *
     * @return the new {@code ShadercIncludeResolve}
     */
    public static ShadercIncludeResolve create(long functionPointer) {
        ShadercIncludeResolveI instance = Callback.get(functionPointer);
        return instance instanceof ShadercIncludeResolve
            ? (ShadercIncludeResolve)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ShadercIncludeResolve createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ShadercIncludeResolve} instance that delegates to the specified {@code ShadercIncludeResolveI} instance. */
    public static ShadercIncludeResolve create(ShadercIncludeResolveI instance) {
        return instance instanceof ShadercIncludeResolve
            ? (ShadercIncludeResolve)instance
            : new Container(instance.address(), instance);
    }

    protected ShadercIncludeResolve() {
        super(CIF);
    }

    ShadercIncludeResolve(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ShadercIncludeResolve {

        private final ShadercIncludeResolveI delegate;

        Container(long functionPointer, ShadercIncludeResolveI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long user_data, long requested_source, int type, long requesting_source, long include_depth) {
            return delegate.invoke(user_data, requested_source, type, requesting_source, include_depth);
        }

    }

}
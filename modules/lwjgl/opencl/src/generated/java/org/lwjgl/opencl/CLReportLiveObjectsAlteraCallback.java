/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class CLReportLiveObjectsAlteraCallback extends Callback implements CLReportLiveObjectsAlteraCallbackI {

    /**
     * Creates a {@code CLReportLiveObjectsAlteraCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLReportLiveObjectsAlteraCallback}
     */
    public static CLReportLiveObjectsAlteraCallback create(long functionPointer) {
        CLReportLiveObjectsAlteraCallbackI instance = Callback.get(functionPointer);
        return instance instanceof CLReportLiveObjectsAlteraCallback
            ? (CLReportLiveObjectsAlteraCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLReportLiveObjectsAlteraCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CLReportLiveObjectsAlteraCallback} instance that delegates to the specified {@code CLReportLiveObjectsAlteraCallbackI} instance. */
    public static CLReportLiveObjectsAlteraCallback create(CLReportLiveObjectsAlteraCallbackI instance) {
        return instance instanceof CLReportLiveObjectsAlteraCallback
            ? (CLReportLiveObjectsAlteraCallback)instance
            : new Container(instance.address(), instance);
    }

    protected CLReportLiveObjectsAlteraCallback() {
        super(CIF);
    }

    CLReportLiveObjectsAlteraCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CLReportLiveObjectsAlteraCallback {

        private final CLReportLiveObjectsAlteraCallbackI delegate;

        Container(long functionPointer, CLReportLiveObjectsAlteraCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long user_data, long obj_ptr, long type_name, int refcount) {
            delegate.invoke(user_data, obj_ptr, type_name, refcount);
        }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke EGLGetBlobFuncANDROID} */
public abstract class EGLGetBlobFuncANDROID extends Callback implements EGLGetBlobFuncANDROIDI {

    /**
     * Creates a {@code EGLGetBlobFuncANDROID} instance from the specified function pointer.
     *
     * @return the new {@code EGLGetBlobFuncANDROID}
     */
    public static EGLGetBlobFuncANDROID create(long functionPointer) {
        EGLGetBlobFuncANDROIDI instance = Callback.get(functionPointer);
        return instance instanceof EGLGetBlobFuncANDROID
            ? (EGLGetBlobFuncANDROID)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable EGLGetBlobFuncANDROID createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code EGLGetBlobFuncANDROID} instance that delegates to the specified {@code EGLGetBlobFuncANDROIDI} instance. */
    public static EGLGetBlobFuncANDROID create(EGLGetBlobFuncANDROIDI instance) {
        return instance instanceof EGLGetBlobFuncANDROID
            ? (EGLGetBlobFuncANDROID)instance
            : new Container(instance.address(), instance);
    }

    protected EGLGetBlobFuncANDROID() {
        super(CIF);
    }

    EGLGetBlobFuncANDROID(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends EGLGetBlobFuncANDROID {

        private final EGLGetBlobFuncANDROIDI delegate;

        Container(long functionPointer, EGLGetBlobFuncANDROIDI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long key, long keySize, long value, long valueSize) {
            return delegate.invoke(key, keySize, value, valueSize);
        }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class IndexerAbortQuery extends Callback implements IndexerAbortQueryI {

    /**
     * Creates a {@code IndexerAbortQuery} instance from the specified function pointer.
     *
     * @return the new {@code IndexerAbortQuery}
     */
    public static IndexerAbortQuery create(long functionPointer) {
        IndexerAbortQueryI instance = Callback.get(functionPointer);
        return instance instanceof IndexerAbortQuery
            ? (IndexerAbortQuery)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable IndexerAbortQuery createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code IndexerAbortQuery} instance that delegates to the specified {@code IndexerAbortQueryI} instance. */
    public static IndexerAbortQuery create(IndexerAbortQueryI instance) {
        return instance instanceof IndexerAbortQuery
            ? (IndexerAbortQuery)instance
            : new Container(instance.address(), instance);
    }

    protected IndexerAbortQuery() {
        super(CIF);
    }

    IndexerAbortQuery(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends IndexerAbortQuery {

        private final IndexerAbortQueryI delegate;

        Container(long functionPointer, IndexerAbortQueryI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long client_data, long reserved) {
            return delegate.invoke(client_data, reserved);
        }

    }

}
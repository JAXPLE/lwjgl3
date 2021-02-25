/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be set to the {@link NkClipboard} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     nk_handle handle,
 *     struct nk_text_edit *edit
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("nk_plugin_paste")
public interface NkPluginPasteI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
    }

    void invoke(@NativeType("nk_handle") long handle, @NativeType("struct nk_text_edit *") long edit);

}
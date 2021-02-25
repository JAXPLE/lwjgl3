/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be passed to the {@link GLFW#glfwSetWindowMaximizeCallback SetWindowMaximizeCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     GLFWwindow *window,
 *     int maximized
 * )</code></pre>
 *
 * @since version 3.3
 */
@FunctionalInterface
@NativeType("GLFWwindowmaximizefun")
public interface GLFWWindowMaximizeCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)) != 0
        );
    }

    /**
     * Will be called when the specified window is maximized or restored.
     *
     * @param window    the window that was maximized or restored.
     * @param maximized {@link GLFW#GLFW_TRUE TRUE} if the window was maximized, or {@link GLFW#GLFW_FALSE FALSE} if it was restored
     */
    void invoke(@NativeType("GLFWwindow *") long window, @NativeType("int") boolean maximized);

}
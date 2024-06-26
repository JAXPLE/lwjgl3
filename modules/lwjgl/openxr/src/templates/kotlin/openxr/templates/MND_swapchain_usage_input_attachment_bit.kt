/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MND_swapchain_usage_input_attachment_bit = "MNDSwapchainUsageInputAttachmentBit".nativeClassXR("MND_swapchain_usage_input_attachment_bit", type = "instance", postfix = "MND") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_MND_swapchain_usage_input_attachment_bit">XR_MND_swapchain_usage_input_attachment_bit</a> extension.

        This extension enables an application to specify that swapchain images should be created in a way so that they can be used as input attachments. At the time of writing this bit only affects Vulkan swapchains.
        """

    IntConstant(
        "The extension specification version.",

        "MND_swapchain_usage_input_attachment_bit_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "MND_SWAPCHAIN_USAGE_INPUT_ATTACHMENT_BIT_EXTENSION_NAME".."XR_MND_swapchain_usage_input_attachment_bit"
    )

    EnumConstant(
        "Extends {@code XrSwapchainUsageFlagBits}.",

        "SWAPCHAIN_USAGE_INPUT_ATTACHMENT_BIT_MND".enum(0x00000080)
    )
}
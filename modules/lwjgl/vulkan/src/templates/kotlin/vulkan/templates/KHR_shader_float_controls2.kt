/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_float_controls2 = "KHRShaderFloatControls2".nativeClassVK("KHR_shader_float_controls2", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension enables use of the more expressive fast floating-point math flags in the SPV_KHR_float_controls2 extension. These flags give finer- grained control over which optimizations compilers may apply, potentially speeding up execution while retaining correct results.

        The extension also adds control over the fast-math modes to the GLSL extended instruction set, making these operations more consistent with SPIR-V and allowing their use in situations where floating-point conformance is important.

        <h5>Promotion to Vulkan 1.4</h5>
        Functionality in this extension is included in core Vulkan 1.4 with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_shader_float_controls2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>529</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.1">Version 1.1</a> and {@link KHRShaderFloatControls VK_KHR_shader_float_controls}</dd>

            <dt><b>SPIR-V Dependencies</b></dt>
            <dd><ul>
                <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_float_controls2.html">SPV_KHR_float_controls2</a></li>
            </ul></dd>

            <dt><b>Deprecation State</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to Vulkan 1.4</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Graeme Leese <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_shader_float_controls2]%20@gnl21%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_shader_float_controls2%20extension*">gnl21</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_shader_float_controls2.adoc">VK_KHR_shader_float_controls2</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-05-16</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_float_controls2.html">{@code SPV_KHR_float_controls2}</a>.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Graeme Leese, Broadcom</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SHADER_FLOAT_CONTROLS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SHADER_FLOAT_CONTROLS_2_EXTENSION_NAME".."VK_KHR_shader_float_controls2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES_KHR".."1000528000"
    )
}